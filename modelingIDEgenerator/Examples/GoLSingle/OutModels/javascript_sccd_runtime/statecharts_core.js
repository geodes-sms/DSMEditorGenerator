__next_objid=1;
function objectId(obj) {
    if (obj==null) return null;
    if (obj.__obj_id==null) obj.__obj_id=__next_objid++;
    return obj.__obj_id;
}

start_time = undefined
function time() {
    return (new Date).getTime() - start_time;
}

// Exception
function RuntimeException(msg) {
	this.msg = msg;
}

// InputException
function InputException(msg) {
	RuntimeException.call(this, msg);
}

InputException.prototype = new RuntimeException();

// AssociationException
function AssociationException(msg) {
	RuntimeException.call(this, msg);
}

AssociationException.prototype = new RuntimeException();

// AssociationReferenceException
function AssociationReferenceException(msg) {
	RuntimeException.call(this, msg);
}

AssociationReferenceException.prototype = new RuntimeException();

// ParameterException
function ParameterException(msg) {
	RuntimeException.call(this, msg);
}

ParameterException.prototype = new RuntimeException();

// InputException
function InputException(msg) {
	RuntimeException.call(this, msg);
}

InputException.prototype = new RuntimeException();

// EventQueueEntry
function EventQueueEntry(scheduled_time, the_event) {
	this.scheduled_time = scheduled_time;
	this.the_event = the_event;
}

// EventQueue
function EventQueue() {
	this.event_list = new Array();
    this.sort_function = function(a, b) {
        return a.scheduled_time - b.scheduled_time
    }
}

EventQueue.prototype.isEmpty = function() {
	return this.event_list.length == 0;
};

EventQueue.prototype.getEarliestTime = function() {
	if (this.isEmpty()) {
		return Infinity;
	} else {
		return this.event_list[0].scheduled_time;
	}
};

EventQueue.prototype.add = function(the_event) {
	this.event_list.push(the_event)
    this.event_list.sort(this.sort_function)
    return objectId(the_event)
};

EventQueue.prototype.remove = function(event_id) {
    this.event_list = this.event_list.filter(function(el) {objectId(el) != event_id}).sort()
}

EventQueue.prototype.pop = function() {
	return this.event_list.shift().the_event
};

// Association
function Association(to_class, min_card, max_card) {
	this.to_class = to_class;
	this.min_card = min_card;
	this.max_card = max_card;
	this.instances = new Object(); /* maps index (as string) to instance */
	this.size = 0;
	this.next_id = 0;
}

Association.prototype.allowedToAdd = function() {
	return (this.max_card === -1 || this.size < this.max_card);
};

Association.prototype.allowedToRemove = function() {
	return (this.min_card === -1 || this.size > this.min_card);
};

Association.prototype.addInstance = function(instance) {
	if (this.allowedToAdd()) {
		var id = this.next_id++;
		this.instances[id] = instance;
		return id;
	} else {
		throw new AssociationException("Not allowed to add the instance to the association.");
	}
};

Association.prototype.removeInstance = function(instance) {
	if (this.allowedToRemove()) {
		delete this.instances[this.instances_to_ids[instance]]
	} else {
		throw new AssociationException("Not allowed to remove the instance to the association.");
	}
};

Association.prototype.getInstance = function(index) {
	var instance = this.instances[index];
	if (instance === undefined) {
		throw new AssociationException("Invalid index for fetching instance(s) from association.");
	}
	return instance;
};

// ObjectManagerBase
function ObjectManagerBase(controller) {
	this.controller = controller;
	this.events = new EventQueue();
	this.instances = new Array();
	this.regex = /^([a-zA-Z_]\w*)(?:\[(\d+)\])?$/;
}

ObjectManagerBase.prototype.addEvent = function(the_event, time_offset) {
	if (time_offset === undefined) time_offset = 0;
	this.events.add(new EventQueueEntry(this.controller.simulated_time + time_offset, the_event));
};

ObjectManagerBase.prototype.broadcast = function(new_event, time_offset) {
	if (time_offset === undefined) time_offset = 0;
	for (var i in this.instances) {
		if (!this.instances.hasOwnProperty(i)) continue;
		this.instances[i].addEvent(new_event, time_offset);
	}
};

ObjectManagerBase.prototype.getEarliestEventTime = function() {
	var earliest_time = this.events.getEarliestTime();
	for (var i in this.instances) {
		if (!this.instances.hasOwnProperty(i)) continue;
		earliest_time = Math.min(earliest_time, this.instances[i].earliest_event_time);
	}
	return earliest_time;
};

ObjectManagerBase.prototype.stepAll = function() {
	this.step();
	for (var i in this.instances) {
		if (!this.instances.hasOwnProperty(i)) continue;
        var instance = this.instances[i];
        if (instance.active && (instance.getEarliestEventTime() <= this.controller.simulated_time || instance.eventlessTransitions())) {
            instance.step();
        }
	}
};

ObjectManagerBase.prototype.step = function() {
	while (this.events.getEarliestTime() <= this.controller.simulated_time) {
		this.handleEvent(this.events.pop());
	}
};

ObjectManagerBase.prototype.start = function() {
	for (var i in this.instances) {
		if (!this.instances.hasOwnProperty(i)) continue;
		this.instances[i].start();
	}
};

ObjectManagerBase.prototype.handleEvent = function(e) {
	if (e.name === "narrow_cast") {
		this.handleNarrowCastEvent(e.parameters);
	} else if (e.name === "broad_cast") {
		this.handleBroadcastEvent(e.parameters);
	} else if (e.name === "create_instance") {
		this.handleCreateEvent(e.parameters);
	} else if (e.name === "associate_instance") {
		this.handleAssociateEvent(e.parameters);
	} else if (e.name === "start_instance") {
		this.handleStartInstanceEvent(e.parameters);
	} else if (e.name === "delete_instance") {
		this.handleDeleteInstanceEvent(e.parameters);
	}
};

ObjectManagerBase.prototype.processAssociationReference = function(input_string) {
	if (input_string.length == 0) {
		throw new AssociationReferenceException("Empty association reference.");
	}
	var path_string = input_string.split('/');
	var result = new Array();
	if (input_string !== "") {
		for (var p in path_string) {
			if (!path_string.hasOwnProperty(p)) continue;
			var m = this.regex.exec(path_string[p]);
			if (m) {
				var name = m[1];
				var index = m[2];
				if (!index) {
					index = -1;
				}
				result.push({name:name,index:index});
			} else {
				throw new AssociationReferenceException("Invalid entry in association reference.");
			}
		}
	}
	return result;
};

ObjectManagerBase.prototype.handleStartInstanceEvent = function(parameters) {
	if (parameters.length !== 2) {
		throw new ParameterException("The start instance event needs 2 parameters.");
	}
	var source = parameters[0];
	var traversal_list = this.processAssociationReference(parameters[1]);
	var instances = this.getInstances(source, traversal_list);
	for (var i in instances) {
		if (!instances.hasOwnProperty(i)) continue;
		instances[i].instance.start();
	}
};

ObjectManagerBase.prototype.handleDeleteInstanceEvent = function(parameters) {
	if (parameters.length !== 2) {
		throw new ParameterException("The delete instance event needs 2 parameters.");
	}
	var source = parameters[0];
	var traversal_list = this.processAssociationReference(parameters[1]);
	var instances = this.getInstances(source, traversal_list);
	for (var i in instances) {
		if (!instances.hasOwnProperty(i)) continue;
		instances[i].instance.stop();
		instances[i].instance.user_defined_destructor();
		// delete association from source instance
		var association_to_remove = instances[i].ref.associations[instances[i].assoc_name];
		if (instances[i].assoc_index === -1) {
			/*for (var x in association_to_remove.instances) {
				if (!association_to_remove.instances.hasOwnProperty(x)) continue;
				association_to_remove.instances = new Object();
				//association_to_remove.instances[x] = null;
			}*/
			// empty instances object
			association_to_remove.instances = new Object();
			//association_to_remove.instances = new Array();
		} else {
			//association_to_remove.instances[instances[i].assoc_index] = null;
			// remove property from instances object
			delete association_to_remove.instances[instances[i].assoc_index];
		}
		// also remove instance from OM's list of instances
		index = this.instances.indexOf(instances[i].instance);
		this.instances.splice(index,1);
	}
	source.addEvent(new Event("instance_deleted", undefined, [parameters[1]]));
};

ObjectManagerBase.prototype.handleBroadcastEvent = function(parameters) {
	if (parameters.length !== 1) {
		throw new ParameterException("The broadcast event needs 1 parameter.");
	}
	this.broadcast(parameters[0]);
};

ObjectManagerBase.prototype.handleCreateEvent = function(parameters) {
	if (parameters.length < 2) {
		throw new ParameterException("The create event needs at least 2 parameters.");
	}
	var source = parameters[0];
	var association_name = parameters[1];
	var association = source.associations[association_name];
	if (!association) {
		throw new ParameterException("No such association: " + association_name);
	}
	if (association.allowedToAdd()) {
		// allow subclasses to be instantiated
		if (parameters.length === 2) {
			var class_name = association.to_class;
			var creation_parameters = [];
		} else /* 3 or more parameters*/ {
			// 3rd parameter is class name
			var class_name = parameters[2];
			// parameters after 3rd parameter are creation parameters
			var creation_parameters = parameters.slice(3);
		}
		var new_instance = this.createInstance(class_name, creation_parameters);
		if (new_instance === undefined) {
			throw new ParameterException("Creating instance: no such class: " + class_name);
		}
		var index = association.addInstance(new_instance);
		// add parent association to created instance
		// if a parent association is defined in the class diagram
		var parent_association = new_instance.associations["parent"];
		if (parent_association !== undefined) {
			parent_association.addInstance(source);
		}
		// TODO: maybe change order of Event constructor parameters such that we don't have to
		//       explicitly set the port to 'undefined'?
		source.addEvent(new Event("instance_created", undefined, [association_name+"["+index+"]"]));
	} else {
		source.addEvent(new Event("instance_creation_error", undefined, [association_name]));
	}
};

ObjectManagerBase.prototype.handleAssociateEvent = function(parameters) {
	if (parameters.length !== 3) {
		throw new ParameterException("The associate_instance event needs 3 parameters.");
	}
	var source = parameters[0];
	var source_list = parameters[1];
	var traversal_list = this.processAssociationReference(source_list);
	var to_copy_list = this.getInstances(source, traversal_list);
	if (to_copy_list.length !== 1) {
		throw new AssociationReferenceException("Invalid source association reference.");
	}
	var wrapped_to_copy_instance = to_copy_list[0].instance;
	var dest_list = this.processAssociationReference(parameters[2]);
	if (dest_list.length === 0) {
		throw new AssociationReferenceException("Invalid destination association reference.");
	}
	var last = dest_list.pop();
	if (last.index !== -1) {
		throw new AssociationReferenceException("Last association name in association reference could not be accompanied by an index.");
	}
	var instances = this.getInstances(source, dest_list);
	for (var i in instances) {
		if (!instances.hasOwnProperty(i)) continue;
		instances[i].instance.associations[last.name].addInstance(wrapped_to_copy_instance);
	}
};

ObjectManagerBase.prototype.handleNarrowCastEvent = function(parameters) {
	if (parameters.length !== 3) {
		throw new ParameterException("The narrow_cast event needs 3 parameters.");
	}
	var source = parameters[0];
	var traversal_list = this.processAssociationReference(parameters[1]);
	var cast_event = parameters[2];
	var instances = this.getInstances(source, traversal_list);
	for (var i in instances) {
		if (!instances.hasOwnProperty(i)) continue;
		instances[i].instance.addEvent(cast_event);
	}
};

ObjectManagerBase.prototype.getInstances = function(source, traversal_list) {
	var currents = [{
		instance : source,
		ref : null,
		assoc_name : null,
		assoc_index : null
	}];
	for (var t in traversal_list) {
		if (!traversal_list.hasOwnProperty(t)) continue;
		var name = traversal_list[t].name;
		var index = traversal_list[t].index;
		nexts = new Array();
		for (var c in currents) {
			if (!currents.hasOwnProperty(c)) continue;
			var association = currents[c].instance.associations[name];
			if (index >= 0) {
				nexts.push({
					instance : association.getInstance(index),
					ref : currents[c].instance,
					assoc_name : name,
					assoc_index : index
				});
			} else if (index === -1) {
				for (var i in association.instances) {
					if (!association.instances.hasOwnProperty(i)) continue;
					nexts.push({
						instance: association.instances[i],
						ref: currents[c].instance,
						assoc_name : name,
						assoc_index : index
					});
				}
				//nexts = nexts.concat(association.instances);
			} else {
				throw new AssociationReferenceException("Incorrect index in association reference.");
			}
		}
		currents = nexts;
	}
	return currents;
};

ObjectManagerBase.prototype.instantiate = function(to_class, construct_params) {
	// pure virtual
};

ObjectManagerBase.prototype.createInstance = function(to_class, construct_params) {
	var instance = this.instantiate(to_class, construct_params);
	this.instances.push(instance);
	return instance;
};

// Event
function Event(name, port, parameters) {
    if (port === undefined) port = "";
    if (parameters === undefined) parameters = [];
	this.name = name;
	this.port = port;
	this.parameters = parameters;
}

// OutputListener
function OutputListener(port_names) {
	this.port_names = port_names;
	this.queue = new Array(); // TODO: optimize!
}

OutputListener.prototype.add = function(the_event) {
	if (this.port_names.length == 0
		|| this.port_names.indexOf(the_event.port) != -1)
	{
		this.queue.push(the_event);
	}
};

OutputListener.prototype.fetch = function(timeout) {
    if (this.queue.length > 0) {
        return this.queue.shift();
    }
};

// ControllerBase
function ControllerBase(object_manager) {
	this.object_manager = object_manager;
    
	this.private_port_counter = 0;
    
    // keep track of input ports
	this.input_ports = new Object();
	this.input_queue = new EventQueue();
    
    // keep track of output ports
	this.output_ports = new Array();
	this.output_listeners = new Array();

    this.simulated_time = null;
}

ControllerBase.prototype.getSimulatedTime = function() {
    return this.simulated_time
}

ControllerBase.prototype.addInputPort = function(virtual_name, instance) {
	if (instance === undefined) {
		var port_name = virtual_name; // "global" port
	} else {
		var port_name = "private_" + (this.private_port_counter++) + "_" + virtual_name;
	}
	this.input_ports[port_name] = {
		virtual_name: virtual_name,
		instance: instance
	};
	return port_name;
};

ControllerBase.prototype.addOutputPort = function(port_name) {
	this.output_ports.push(port_name);
};

ControllerBase.prototype.broadcast = function(new_event, time_offset) {
    if (time_offset === undefined) time_offset = 0
	this.object_manager.broadcast(new_event, time_offset);
};

ControllerBase.prototype.start = function() {
    start_time = (new Date()).getTime();
    this.simulated_time = 0;
	this.object_manager.start();
};

ControllerBase.prototype.stop = function() {
};

ControllerBase.prototype.addInput = function(input_event_list, time_offset) {
    if (time_offset === undefined) time_offset = 0
	if (!(input_event_list instanceof Array)) {
		input_event_list = [input_event_list];
    }
	for (var e in input_event_list) {
		if (!input_event_list.hasOwnProperty(e)) continue;
		if (input_event_list[e].name === "") {
			throw new InputException("Input event can't have an empty name.");
		}
		var input_port = this.input_ports[input_event_list[e].port];
		if (input_port === undefined) {
			throw new InputException("Input port mismatch, no such port: " + input_event_list[e].port + ".");
		}
        this.input_queue.add(new EventQueueEntry((this.simulated_time === null ? 0 : time()) + time_offset, input_event_list[e]));
	}
};

ControllerBase.prototype.getEarliestEventTime = function() {
	return Math.min(this.object_manager.getEarliestEventTime(), this.input_queue.getEarliestTime());
};

ControllerBase.prototype.handleInput = function() {
	var event_time = this.input_queue.getEarliestTime();
	while (event_time <= this.simulated_time) {
		var e = this.input_queue.pop();
        input_port = this.input_ports[e.port];
        e.port = input_port.virtual_name
        var target_instance = input_port.instance;
        if (target_instance === undefined) {
            this.broadcast(e, event_time - this.simulated_time);
        } else {
            target_instance.addEvent(e, event_time - this.simulated_time);
        }
        event_time = this.input_queue.getEarliestTime();
	}
};

ControllerBase.prototype.outputEvent = function(the_event) {
	for (var l in this.output_listeners) {
		if (!this.output_listeners.hasOwnProperty(l)) continue;
		this.output_listeners[l].add(the_event);
	}
};

ControllerBase.prototype.addOutputListener = function(ports) {
	var listener = new OutputListener(ports);
	this.output_listeners.push(listener);
	return listener;
};

ControllerBase.prototype.addMyOwnOutputListener = function(listener) {
	this.output_listeners.push(listener);
};

// GameLoopControllerBase
function GameLoopControllerBase(object_manager) {
	ControllerBase.call(this, object_manager);
}

GameLoopControllerBase.prototype = new ControllerBase();

GameLoopControllerBase.prototype.update = function(delta) {
	this.handleInput();
    earliest_event_time = this.getEarliestEventTime();
    if (earliest_event_time > time()) {
        this.simulated_time = earliest_event_time;
        this.object_manager.stepAll();
    }
};

// EventLoop

// parameters:
//  schedule - a callback scheduling another callback in the event loop
//      this callback should take 2 parameters: (callback, timeout) and return an ID
//  clear - a callback that clears a scheduled callback
//      this callback should take an ID that was returned by 'schedule'
function EventLoop(schedule, clear) {
	this.schedule_callback = schedule;
	this.clear_callback = clear;
	this.scheduled_id = null;
	this.last_print = 0.0;
}

EventLoop.prototype.schedule = function(f, wait_time, behind) {
    if (behind === undefined) behind = false
	if (this.scheduled_id) {
		// if the following error occurs, it is probably due to a flaw in the logic of EventLoopControllerBase
		throw new RuntimeException("EventLoop class intended to maintain at most 1 scheduled callback.");
	}
    
	if (wait_time != Infinity) {
        this.scheduled_id = this.schedule_callback(f, wait_time, behind)
    }
};

EventLoop.prototype.clear = function() {
	if (this.scheduled_id) {
		this.clear_callback(this.scheduled_id);
		this.scheduled_id = null;
	}
};

// EventLoopControllerBase
function EventLoopControllerBase(object_manager, event_loop, finished_callback, behind_schedule_callback) {
	ControllerBase.call(this, object_manager);
	this.event_loop = event_loop;
	this.finished_callback = finished_callback;
    this.behind_schedule_callback = behind_schedule_callback;
	this.last_print_time = 0;
}

EventLoopControllerBase.prototype = new ControllerBase();

EventLoopControllerBase.prototype.addInput = function(input_event, time_offset) {
	ControllerBase.prototype.addInput.call(this, input_event, time_offset);
	this.event_loop.clear();
    this.simulated_time = ControllerBase.prototype.getEarliestEventTime.call(this);
    this.run();
};

EventLoopControllerBase.prototype.start = function() {
	ControllerBase.prototype.start.call(this);
	this.run();
};

EventLoopControllerBase.prototype.stop = function() {
	this.event_loop.clear();
	ControllerBase.prototype.stop.call(this);
};

EventLoopControllerBase.prototype.run = function() {
    var start_time = time();
	while (true) {
		// clear existing timeout
		this.event_loop.clear();
		// simulate
		this.handleInput();
		this.object_manager.stepAll();
		// schedule next timeout
		var earliest_event_time = ControllerBase.prototype.getEarliestEventTime.call(this);
		if (earliest_event_time == Infinity) {
            if (this.finished_callback != undefined) this.finished_callback(); // TODO: This is not necessarily correct (keep_running necessary?)
            return;
		}
        var now = time();
        if (now - start_time > 10 || earliest_event_time - now > 0) {
            this.event_loop.schedule(this.run.bind(this), earliest_event_time - now, now - start_time > 10);
            if (now - earliest_event_time > 10 && now - this.last_print_time >= 1000) {
                console.log('running ' + (now - earliest_event_time) + ' ms behind schedule');
                this.last_print_time = now;
            }
            this.simulated_time = earliest_event_time;
            return;
        } else {
            this.simulated_time = earliest_event_time;
        }
	}
};

// JsEventLoop
function JsEventLoop() {
	EventLoop.call(this, window.setTimeout.bind(window), window.clearTimeout.bind(window));
}

JsEventLoop.prototype = new EventLoop();

// Enum-like construct holding statechart semantic options.
StatechartSemantics = {
	// Big Step Maximality
	TakeOne : 0,
	TakeMany : 1,
	// Concurrency
	Single : 0,
	Many : 1, // not yet implemented
	// Preemption (unsupported)
	NonPreemptive : 0,
	Preemptive : 1,
	// Internal Event Lifeline
	Queue : 0,
	NextSmallStep : 1,
	NextComboStep : 2,
	// Input Event Lifeline
	Whole : 0,
	FirstSmallStep : 1,
	FirstComboStep : 2,
	// Priority
	SourceParent : 0,
	SourceChild : 1
};

var DefaultStatechartSemantics = function() {
	this.big_step_maximality = this.TakeMany;
	this.concurrency = this.Single
	this.internal_event_lifeline = this.Queue;
	this.input_event_lifeline = this.FirstComboStep;
	this.priority = this.SourceParent;
};

// State
function State(state_id, obj) {
    this.state_id = state_id;
    this.obj = obj;
    
    this.ancestors = new Array();
    this.descendants = new Array();
    this.children = new Array();
    this.my_parent = null;
    this.enter = null;
    this.exit = null;
    this.default_state = null;
    this.transitions = new Array();
    this.my_history = new Array();
    this.has_eventless_transitions = false;
}

State.prototype.getEffectiveTargetStates = function() {
    var targets = [this];
    if (this.default_state != null) {
        Array.prototype.push.apply(targets, this.default_state.getEffectiveTargetStates());
    }
    return targets;
}

State.prototype.fixTree = function() {
    for (let c of this.children) {
        if (c instanceof HistoryState) {
            this.my_history.push(c);
        }
        c.my_parent = this;
        c.ancestors.push(this);
        Array.prototype.push.apply(c.ancestors, this.ancestors);
        c.fixTree();
    }
    Array.prototype.push.apply(this.descendants, this.children)
    for (let c of this.children) {
        Array.prototype.push.apply(this.descendants, c.descendants)
    }
}

State.prototype.addChild = function(child) {
    this.children.push(child);
}

State.prototype.addTransition = function(transition) {
    this.transitions.push(transition);
}

State.prototype.setEnter = function(enter) {
    this.enter = enter.bind(this.obj);
}

State.prototype.setExit = function(exit) {
    this.exit = exit.bind(this.obj);
}

// HistoryState
function HistoryState(state_id, obj) {
    State.call(this, state_id, obj);
}

HistoryState.prototype = new State();

// ShallowHistoryState
function ShallowHistoryState(state_id, obj) {
    HistoryState.call(this, state_id, obj);
}

ShallowHistoryState.prototype = new HistoryState();

ShallowHistoryState.prototype.getEffectiveTargetStates = function() {
    if (this.state_id in this.obj.history_values) {
        var targets = [];
        for (let hv of this.obj.history_values[this.state_id]) {
            Array.prototype.push.apply(targets, hv.getEffectiveTargetStates());
        }
        return targets;
    } else {
        // TODO: is it correct that in this case, the parent itself is also entered?
        return this.my_parent.getEffectiveTargetStates();
    }
}

// DeepHistoryState
function DeepHistoryState(state_id, obj) {
    HistoryState.call(this, state_id, obj);
}

DeepHistoryState.prototype = new HistoryState();

DeepHistoryState.prototype.getEffectiveTargetStates = function() {
    if (this.state_id in this.obj.history_values) {
        return this.obj.history_values[this.state_id];
    } else {
        // TODO: is it correct that in this case, the parent itself is also entered?
        return this.my_parent.getEffectiveTargetStates();
    }
}

// ParallelState
function ParallelState(state_id, obj) {
    State.call(this, state_id, obj);
}

ParallelState.prototype = new State();

ParallelState.prototype.getEffectiveTargetStates = function() {
    var targets = [this];
    for (let c of this.children) {
        if (!(c instanceof HistoryState)) {
            Array.prototype.push.apply(targets, c.getEffectiveTargetStates());
        }
    }
    return targets;
}

// Transition
function Transition(obj, source, targets) {
    this.guard = null;
    this.action = null;
    this.trigger = null;
    this.source = source;
    this.targets = targets;
    this.obj = obj;
    this.enabled_event = null; // the event that enabled this transition
    this.optimize();
}

Transition.prototype.isEnabled = function(events) {
    if (this.trigger === null) {
        this.enabled_event = null;
        return (this.guard === null || this.guard([]));
    } else {
        for (var i in events) {
            the_event = events[i];
            if ((this.trigger.name == the_event.name && (!this.trigger.port || this.trigger.port == the_event.port)) && (this.guard === null || this.guard(the_event.parameters))) {
                this.enabled_event = the_event;
                return true;
            }
        }
    }
}

Transition.prototype.fire = function() {
    // exit states...
    var targets = this.__getEffectiveTargetStates();
    var exit_set = this.__exitSet(targets);
    for (let s of exit_set) {
        for (let h of s.my_history) {
            var f = function(s0) {return s0.ancestors.length > 0 && s0.my_parent == s;}
            if (h instanceof DeepHistoryState) {
                f = function(s0) {return s0.descendants.length == 0 && s.descendants.indexOf(s0) >= 0;}
            }
            this.obj.history_values[h.state_id] = this.obj.configuration.filter(f);
        }
    }
    for (let s of exit_set) {
        if (s.exit != null) {
            s.exit();
        }
    }
    this.obj.configuration = this.obj.configuration.filter(function(el) {return exit_set.indexOf(el) < 0;})
    
    // combo state changed area
    this.obj.combo_step.changed.push(this.lca);
    for (let d of this.lca.descendants) {
        this.obj.combo_step.changed.push(d);
    }
    
    // execute transition action(s)
    if (this.action != null) {
        var params = [];
        if (this.enabled_event != null) params = this.enabled_event.parameters;
        this.action(params);
    }
    
    // enter states...
    for (let s of this.__enterSet(targets)) {
        this.obj.configuration.push(s);
        if (s.enter != null) {
            s.enter();
        }
    }
    
    this.obj.configuration = this.obj.configuration.sort(function(a, b) {return a.state_id - b.state_id})
    this.enabled_event = null;
}

Transition.prototype.__getEffectiveTargetStates = function() {
    var targets = []
    for (let target of this.targets) {
        for (let e_t of target.getEffectiveTargetStates()) {
            if (targets.indexOf(e_t) < 0) {
                targets.push(e_t);
            }
        }
    }
    return targets;
}

Transition.prototype.__exitSet = function(targets) {
    var exit_set = this.lca.descendants.slice(0).filter(function(obj) {
        return function(s) {
            return obj.obj.configuration.indexOf(s) >= 0;
        }
    }(this));
    exit_set.reverse();
    return exit_set;
}

Transition.prototype.__enterSet = function*(targets) {
    var target = targets[0];
    var reversed_ancestors = target.ancestors.slice(0).reverse();
    for (let a of reversed_ancestors) {
        if (this.source.ancestors.indexOf(a) >= 0) {
            continue;
        } else {
            yield a;
        }
    }
    for (let target of targets) {
        yield target;
    }
}

Transition.prototype.setGuard = function(guard) {
    this.guard = guard.bind(this.obj);
}

Transition.prototype.setAction = function(action) {
    this.action = action.bind(this.obj);
}

Transition.prototype.setTrigger = function(trigger) {
    this.trigger = trigger;
    if (this.trigger === null) {
        this.source.has_eventless_transitions = true;
    }
}

Transition.prototype.optimize = function() {
    // the least-common ancestor can be computed statically
    this.lca = this.source.my_parent;
    var target = this.targets[0];
    if (this.source.my_parent != target.my_parent) { // external
        for (let a of this.source.ancestors) {
            if (target.ancestors.indexOf(a) >= 0) {
                this.lca = a;
                break;
            }
        }
    }
}

// RuntimeClassBase
function RuntimeClassBase(controller) {
	this.active = false;
	this.__set_stable(true);
	this.events = new EventQueue();

	this.controller = controller;
	this.inports = new Object();
	this.timers = new Object();
    this.states = new Object();

	this.semantics = new DefaultStatechartSemantics();
}

RuntimeClassBase.prototype.eventlessTransitions = function() {
    for (let s of this.configuration) {
        if (s.has_eventless_transitions) return true;
    }
    return false;
}

RuntimeClassBase.prototype.start = function() {
    this.configuration = new Array();
    
	this.current_state = new Object();
	this.history_values = new Object();
	this.timers = new Object();
    this.timers_to_add = new Object();

	this.big_step = new BigStepState();
	this.combo_step = new ComboStepState();
	this.small_step = new SmallStepState();

	this.active = true;
	this.__set_stable(false);

	this.initializeStatechart();
	this.processBigStepOutput();
};

RuntimeClassBase.prototype.sccd_yield = function() {
    return Math.max(0, (time() - this.controller.simulated_time) / 1000.0);
}

RuntimeClassBase.prototype.getSimulatedTime = function() {
    return this.controller.simulated_time;
}

RuntimeClassBase.prototype.updateConfiguration = function(states) {
    this.configuration = states.slice(0);
};

RuntimeClassBase.prototype.stop = function() {
	this.active = false;
    this.__set_stable(false);
};

RuntimeClassBase.prototype.addTimer = function(index, timeout) {
    this.timers_to_add[index] = new EventQueueEntry(this.controller.simulated_time + Math.trunc(timeout * 1000), new Event("_" + index + "after"));
};

RuntimeClassBase.prototype.removeTimer = function(index) {
    if (index in this.timers_to_add) delete this.timers_to_add[index];
	this.events.remove(this.timers[index]);
    delete this.timers[index];
};

RuntimeClassBase.prototype.addEvent = function(event_list, time_offset) {
	if (time_offset == undefined) time_offset = 0;
    var event_time = this.controller.simulated_time + time_offset;
    if (event_time < this.earliest_event_time) {
        this.earliest_event_time = event_time;
    }
	if (!(event_list instanceof Array)) {
		event_list = [event_list];
	}
    for (i in event_list) {
        if (!event_list.hasOwnProperty(i)) continue;
        this.events.add(new EventQueueEntry(this.controller.simulated_time + time_offset, event_list[i]));
    }
};

RuntimeClassBase.prototype.getEarliestEventTime = function() {
	return this.earliest_event_time;
};

RuntimeClassBase.prototype.processBigStepOutput = function() {
	var o = this.big_step.output_events_port;
	var om = this.big_step.output_events_om;
	for (var e in o) {
		if (!o.hasOwnProperty(e)) continue;
		this.controller.outputEvent(o[e]);
	}
	for (var e in om) {
		if (!om.hasOwnProperty(e)) continue;
		this.controller.object_manager.addEvent(om[e]);
	}
};

RuntimeClassBase.prototype.__set_stable = function(is_stable) {
    this.is_stable = is_stable;
    // self.earliest_event_time keeps track of the earliest time this instance will execute a transition
    if (!this.is_stable) {
        this.earliest_event_time = 0.0;
    } else if (!this.active) {
        this.earliest_event_time = Infinity;
    } else {
        this.earliest_event_time = this.events.getEarliestTime();
    }
}

RuntimeClassBase.prototype.step = function(delta) {
	var is_stable = false;
    while (!is_stable) {
        var due = [];
        if (this.events.getEarliestTime() <= this.controller.simulated_time) {
            due = [this.events.pop()];
        }
        is_stable = !this.bigStep(due);
        this.processBigStepOutput();
    }
    for (key in this.timers_to_add) {
        if (!this.timers_to_add.hasOwnProperty(key)) continue;
        this.timers[key] = this.events.add(this.timers_to_add[key]);
    }
	this.timers_to_add = new Object();
    this.__set_stable(true);
};

RuntimeClassBase.prototype.inState = function(state_strings) {
    var state_ids = [];
    for (let state_string of state_strings) {
        state_ids.push(this.states[state_string].state_id);
    }
    for (let state_id of state_ids) {
        var found = false;
        for (let s of this.configuration) {
            if (s.state_id == state_id) {
                found = true;
                break;
            }
        }
        if (!found) return false;
    }
    return true;
};

RuntimeClassBase.prototype.bigStep = function(input_events) {
	this.big_step.next(input_events);
	this.small_step.reset();
	this.combo_step.reset();
	while (this.comboStep()) {
		this.big_step.has_stepped = true;
		if (this.semantics.big_step_maximality === StatechartSemantics.TakeOne)
			break;
	}
	return this.big_step.has_stepped;
};

RuntimeClassBase.prototype.comboStep = function() {
	this.combo_step.next();
	while (this.smallStep()) {
		this.combo_step.has_stepped = true;
	}
	return this.combo_step.has_stepped;
};

// generate transition candidates for current small step
RuntimeClassBase.prototype.generateCandidates = function() {
    var enabledEvents = this.getEnabledEvents();
    var enabledTransitions = new Array();
    for (let s of this.configuration) {
        if (this.combo_step.changed.indexOf(s) < 0) {
            for (let t of s.transitions) {
                if (t.isEnabled(enabledEvents)) {
                    enabledTransitions.push(t);
                }
            }
        }
    }
    return enabledTransitions
};

RuntimeClassBase.prototype.smallStep = function() {
    var __younger_than = 
        function(x, y) {
            if (y.source.ancestors.indexOf(x.source) >= 0) {
                return 1;
            } else if (x.source.ancestors.indexOf(y.source) >= 0) {
                return -1;
            } else {
                throw new Exception("These items have no relation with each other.");
            }
        };
    
	if (this.small_step.has_stepped) {
		this.small_step.next();
	}
	var candidates = this.generateCandidates();
	if (candidates.length > 0) {
        to_skip = new Set();
        conflicting = new Array();
        for (var i in candidates) {
            c1 = candidates[i];
            if (!to_skip.has(c1)) {
                conflict = [c1];
                for (var j in candidates.slice(candidates.indexOf(c1))) {
                    c2 = candidates[j];
                    if (c1.source.ancestors.indexOf(c2.source) >= 0 || c2.source.ancestors.indexOf(c1.source) >= 0) {
                        conflict.push(c2);
                        to_skip.add(c2);
                    }
                }
                conflicting.push(conflict.sort(__younger_than));
            }
        }
        if (this.semantics.concurrency === StatechartSemantics.Single) {
            var candidate = conflicting[0];
            if (this.semantics.priority === StatechartSemantics.SourceParent) {
                candidate[candidate.length - 1].fire();
            } else {
                candidate[0].fire();
            }
        } else if (this.semantics.concurrency === StatechartSemantics.Many) {
            // TODO: Implement
        }
        this.small_step.has_stepped = true;
    }
	return this.small_step.has_stepped;
};

RuntimeClassBase.prototype.getEnabledEvents = function() {
	var result = this.small_step.current_events.concat(this.combo_step.current_events);
	if (this.semantics.input_event_lifeline === StatechartSemantics.Whole ||
		(!this.big_step.has_stepped &&
			(this.semantics.input_event_lifeline === StatechartSemantics.FirstComboStep ||
				(!this.combo_step.has_stepped &&
					this.semantics.input_event_lifeline === StatechartSemantics.FirstSmallStep)))) {
		result = result.concat(this.big_step.input_events);
	}
	return result;
};

RuntimeClassBase.prototype.raiseInternalEvent = function(the_event) {
	if (this.semantics.internal_event_lifeline === StatechartSemantics.NextSmallStep) {
		this.small_step.addNextEvent(the_event);
	} else if (this.semantics.internal_event_lifeline === StatechartSemantics.NextComboStep) {
		this.combo_step.addNextEvent(the_event);
	} else if (this.semantics.internal_event_lifeline === StatechartSemantics.Queue) {
		this.events.add(new EventQueueEntry(0.0, the_event));
	}
};

RuntimeClassBase.prototype.initializeStatechart = function() {
	this.updateConfiguration(this.default_targets);
    for (let state of this.default_targets) {
        if (state.enter != null) {
            state.enter();
        }
    }
};

// BigStepState
var BigStepState = function() {
	this.input_events = new Array();
	this.output_events_port = new Array();
	this.output_events_om = new Array();
	this.has_stepped = true;
	this.transitions = 0;
};

BigStepState.prototype.next = function(input_events) {
	this.input_events = input_events;
	this.output_events_port = new Array();
	this.output_events_om = new Array();
	this.has_stepped = false;
	this.transitions = 0;
};

BigStepState.prototype.outputEvent = function(event) {
	this.output_events_port.push(event);
};

BigStepState.prototype.outputEventOM = function(event) {
	this.output_events_om.push(event);
};

// ComboStepState
var ComboStepState = function() {
	this.current_events = new Array();
	this.next_events = new Array();
	this.changed = new Array();
	this.has_stepped = true;
};

ComboStepState.prototype.reset = function() {
	this.current_events = new Array();
	this.next_events = new Array();
};

ComboStepState.prototype.next = function() {
	this.current_events = this.next_events;
	this.next_events = new Array();
	this.changed = new Array();
	this.has_stepped = false;
};

ComboStepState.prototype.addNextEvent = function(event) {
	this.next_events.push(event);
};

ComboStepState.prototype.setArenaChanged = function(arena) {
	this.changed.push(arena);
};

ComboStepState.prototype.isArenaChanged = function(arena) {
	return (this.changed.indexOf(arena) !== -1);
};

ComboStepState.prototype.isStable = function() {
	return (this.changed.length === 0);
};

// SmallStepState
var SmallStepState = function() {
	this.current_events = new Array();
	this.next_events = new Array();
	this.candidates = new Array();
	this.has_stepped = true;
};

SmallStepState.prototype.reset = function() {
	this.current_events = new Array();
	this.next_events = new Array();
};

SmallStepState.prototype.next = function() {
	this.current_events = this.next_events;
	this.next_events = new Array();
	this.candidates = new Array();
	this.has_stepped = false;
};

SmallStepState.prototype.addNextEvent = function(event) {
	this.next_events.push(event);
};

SmallStepState.prototype.addCandidate = function(t, p) {
	this.candidates.push({transition: t, parameters: p});
};

SmallStepState.prototype.hasCandidates = function() {
	return (this.candidates.length > 0);
};

