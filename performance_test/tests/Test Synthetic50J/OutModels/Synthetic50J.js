/* Generated by Statechart compiler by Glenn De Jonghe, Joeri Exelmans, Simon Van Mierlo, and Yentl Van Tendeloo (for the inspiration)

Date:   Sun Apr 28 02:33:16 2019

Model author: Vasco and Khady
Model name:   Synthetic50J
Model description:
RunGhostGameofLifeEditor*/


// package "Synthetic50J"
var Synthetic50J = {};
(function() {

var Interaction = function(controller) {
    RuntimeClassBase.call(this, controller);
    
    this.semantics.big_step_maximality = StatechartSemantics.TakeMany;
    this.semantics.internal_event_lifeline = StatechartSemantics.Queue;
    this.semantics.input_event_lifeline = StatechartSemantics.FirstComboStep;
    this.semantics.priority = StatechartSemantics.SourceParent;
    this.semantics.concurrency = StatechartSemantics.Single;
    
    // build Statechart structure
    this.build_statechart_structure();
    
    // user defined attributes
    this.context = null;
    
    // call user defined constructor
    Interaction.prototype.user_defined_constructor.call(this);
};
Interaction.prototype = new Object();
(function() {
    var proto = new RuntimeClassBase();
    for (prop in proto) {
        Interaction.prototype[prop] = proto[prop];
    }
})();

Interaction.prototype.user_defined_constructor = function() {
    this.svg = scConstructor("23");
    document.getElementById("E1").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E1",'event');}, false);
    document.getElementById("E2").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E2",'event');}, false);
    document.getElementById("E3").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E3",'event');}, false);
    document.getElementById("E4").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E4",'event');}, false);
    document.getElementById("E5").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E5",'event');}, false);
    document.getElementById("E6").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E6",'event');}, false);
    document.getElementById("E7").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E7",'event');}, false);
    document.getElementById("E8").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E8",'event');}, false);
    document.getElementById("E9").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E9",'event');}, false);
    document.getElementById("E10").addEventListener("click", function() {Synthetic50J.Interaction.prototype.triggerEvent(event,"E10",'event');}, false);
    document.getElementById("23").addEventListener("click",function() {Synthetic50J.Interaction.prototype.triggerEvent(event,event.target.id,'select');}, false);
};

Interaction.prototype.user_defined_destructor = function() {
};


// user defined method
Interaction.prototype.triggerEvent = function(evt, type, internalEvt) {
    console.log(evt);
    console.log(type);
    console.log(internalEvt);
    console.log(controller.object_manager.instances[0].configuration);
    this.event=evt;
    this.type = type;
    controller.addInput(new Event(internalEvt, "ui"), []);
    console.log(controller.object_manager.instances[0].configuration);
};


// user defined method
Interaction.prototype.E1add = function() {
    addE.call(this,"23","1");
};


// user defined method
Interaction.prototype.E2add = function() {
    addE.call(this,"23","2");
};


// user defined method
Interaction.prototype.E3add = function() {
    addE.call(this,"23","3");
};


// user defined method
Interaction.prototype.E4add = function() {
    addE.call(this,"23","4");
};


// user defined method
Interaction.prototype.E5add = function() {
    addE.call(this,"23","5");
};


// user defined method
Interaction.prototype.E6add = function() {
    addE.call(this,"23","6");
};


// user defined method
Interaction.prototype.E7add = function() {
    addE.call(this,"23","7");
};


// user defined method
Interaction.prototype.E8add = function() {
    addE.call(this,"23","8");
};


// user defined method
Interaction.prototype.E9add = function() {
    addE.call(this,"23","9");
};


// user defined method
Interaction.prototype.E10add = function() {
    addE.call(this,"23","10");
};


// user defined method
Interaction.prototype.E1rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E2rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E3rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E4rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E5rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E6rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E7rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E8rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E9rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.E10rem = function() {
    remE.call(this,this.event.target);
};


// user defined method
Interaction.prototype.eventCall = function(evt) {
};


// builds Statechart structure
Interaction.prototype.build_statechart_structure = function() {
    
    // state <root>
    this.states[""] = new State(0, this);
    
    // state /System
    this.states["/System"] = new ParallelState(1, this);
    
    // state /System/LayerE2
    this.states["/System/LayerE2"] = new State(2, this);
    
    // state /System/LayerE2/s0
    this.states["/System/LayerE2/s0"] = new State(3, this);
    
    // state /System/LayerE2/s17
    this.states["/System/LayerE2/s17"] = new State(4, this);
    
    // state /System/LayerE1
    this.states["/System/LayerE1"] = new State(5, this);
    
    // state /System/LayerE1/s1
    this.states["/System/LayerE1/s1"] = new State(6, this);
    
    // state /System/Layercanvas
    this.states["/System/Layercanvas"] = new State(7, this);
    
    // state /System/Layercanvas/s2
    this.states["/System/Layercanvas/s2"] = new State(8, this);
    
    // state /System/LayerE3
    this.states["/System/LayerE3"] = new State(9, this);
    
    // state /System/LayerE3/s3
    this.states["/System/LayerE3/s3"] = new State(10, this);
    
    // state /System/LayerE3/s14
    this.states["/System/LayerE3/s14"] = new State(11, this);
    
    // state /System/LayerE4
    this.states["/System/LayerE4"] = new State(12, this);
    
    // state /System/LayerE4/s4
    this.states["/System/LayerE4/s4"] = new State(13, this);
    
    // state /System/LayerE4/s13
    this.states["/System/LayerE4/s13"] = new State(14, this);
    
    // state /System/LayerE5
    this.states["/System/LayerE5"] = new State(15, this);
    
    // state /System/LayerE5/s5
    this.states["/System/LayerE5/s5"] = new State(16, this);
    
    // state /System/LayerE6
    this.states["/System/LayerE6"] = new State(17, this);
    
    // state /System/LayerE6/s6
    this.states["/System/LayerE6/s6"] = new State(18, this);
    
    // state /System/LayerE7
    this.states["/System/LayerE7"] = new State(19, this);
    
    // state /System/LayerE7/s7
    this.states["/System/LayerE7/s7"] = new State(20, this);
    
    // state /System/LayerE8
    this.states["/System/LayerE8"] = new State(21, this);
    
    // state /System/LayerE8/s8
    this.states["/System/LayerE8/s8"] = new State(22, this);
    
    // state /System/LayerE8/s15
    this.states["/System/LayerE8/s15"] = new State(23, this);
    
    // state /System/LayerE9
    this.states["/System/LayerE9"] = new State(24, this);
    
    // state /System/LayerE9/s9
    this.states["/System/LayerE9/s9"] = new State(25, this);
    
    // state /System/LayerE9/s16
    this.states["/System/LayerE9/s16"] = new State(26, this);
    
    // state /System/LayerE10
    this.states["/System/LayerE10"] = new State(27, this);
    
    // state /System/LayerE10/s10
    this.states["/System/LayerE10/s10"] = new State(28, this);
    
    // state /System/LayerE10/s12
    this.states["/System/LayerE10/s12"] = new State(29, this);
    
    // state /System/LayerControler
    this.states["/System/LayerControler"] = new State(30, this);
    
    // state /System/LayerControler/h00
    this.states["/System/LayerControler/h00"] = new State(31, this);
    
    // state /System/LayerController
    this.states["/System/LayerController"] = new State(32, this);
    
    // state /System/LayerController/controller
    this.states["/System/LayerController/controller"] = new State(33, this);
    
    // add children
    this.states[""].addChild(this.states["/System"]);
    this.states["/System"].addChild(this.states["/System/LayerE2"]);
    this.states["/System"].addChild(this.states["/System/LayerE1"]);
    this.states["/System"].addChild(this.states["/System/Layercanvas"]);
    this.states["/System"].addChild(this.states["/System/LayerE3"]);
    this.states["/System"].addChild(this.states["/System/LayerE4"]);
    this.states["/System"].addChild(this.states["/System/LayerE5"]);
    this.states["/System"].addChild(this.states["/System/LayerE6"]);
    this.states["/System"].addChild(this.states["/System/LayerE7"]);
    this.states["/System"].addChild(this.states["/System/LayerE8"]);
    this.states["/System"].addChild(this.states["/System/LayerE9"]);
    this.states["/System"].addChild(this.states["/System/LayerE10"]);
    this.states["/System"].addChild(this.states["/System/LayerControler"]);
    this.states["/System"].addChild(this.states["/System/LayerController"]);
    this.states["/System/LayerE2"].addChild(this.states["/System/LayerE2/s0"]);
    this.states["/System/LayerE2"].addChild(this.states["/System/LayerE2/s17"]);
    this.states["/System/LayerE1"].addChild(this.states["/System/LayerE1/s1"]);
    this.states["/System/Layercanvas"].addChild(this.states["/System/Layercanvas/s2"]);
    this.states["/System/LayerE3"].addChild(this.states["/System/LayerE3/s3"]);
    this.states["/System/LayerE3"].addChild(this.states["/System/LayerE3/s14"]);
    this.states["/System/LayerE4"].addChild(this.states["/System/LayerE4/s4"]);
    this.states["/System/LayerE4"].addChild(this.states["/System/LayerE4/s13"]);
    this.states["/System/LayerE5"].addChild(this.states["/System/LayerE5/s5"]);
    this.states["/System/LayerE6"].addChild(this.states["/System/LayerE6/s6"]);
    this.states["/System/LayerE7"].addChild(this.states["/System/LayerE7/s7"]);
    this.states["/System/LayerE8"].addChild(this.states["/System/LayerE8/s8"]);
    this.states["/System/LayerE8"].addChild(this.states["/System/LayerE8/s15"]);
    this.states["/System/LayerE9"].addChild(this.states["/System/LayerE9/s9"]);
    this.states["/System/LayerE9"].addChild(this.states["/System/LayerE9/s16"]);
    this.states["/System/LayerE10"].addChild(this.states["/System/LayerE10/s10"]);
    this.states["/System/LayerE10"].addChild(this.states["/System/LayerE10/s12"]);
    this.states["/System/LayerControler"].addChild(this.states["/System/LayerControler/h00"]);
    this.states["/System/LayerController"].addChild(this.states["/System/LayerController/controller"]);
    this.states[""].fixTree();
    this.states[""].default_state = this.states["/System"];
    this.states["/System/LayerE2"].default_state = this.states["/System/LayerE2/s0"];
    this.states["/System/LayerE1"].default_state = this.states["/System/LayerE1/s1"];
    this.states["/System/Layercanvas"].default_state = this.states["/System/Layercanvas/s2"];
    this.states["/System/LayerE3"].default_state = this.states["/System/LayerE3/s3"];
    this.states["/System/LayerE4"].default_state = this.states["/System/LayerE4/s4"];
    this.states["/System/LayerE5"].default_state = this.states["/System/LayerE5/s5"];
    this.states["/System/LayerE6"].default_state = this.states["/System/LayerE6/s6"];
    this.states["/System/LayerE7"].default_state = this.states["/System/LayerE7/s7"];
    this.states["/System/LayerE8"].default_state = this.states["/System/LayerE8/s8"];
    this.states["/System/LayerE9"].default_state = this.states["/System/LayerE9/s9"];
    this.states["/System/LayerE10"].default_state = this.states["/System/LayerE10/s10"];
    this.states["/System/LayerControler"].default_state = this.states["/System/LayerControler/h00"];
    this.states["/System/LayerController"].default_state = this.states["/System/LayerController/controller"];
    
    // transition /System/LayerE2/s0
    var _System_LayerE2_s0_0 = new Transition(this, this.states["/System/LayerE2/s0"], [this.states["/System/LayerE2/s17"]]);
    _System_LayerE2_s0_0.setAction(this._System_LayerE2_s0_0_exec);
    _System_LayerE2_s0_0.setTrigger(new Event("event1", null));
    this.states["/System/LayerE2/s0"].addTransition(_System_LayerE2_s0_0);
    
    // transition /System/LayerE2/s17
    var _System_LayerE2_s17_0 = new Transition(this, this.states["/System/LayerE2/s17"], [this.states["/System/LayerE2/s17"]]);
    _System_LayerE2_s17_0.setAction(this._System_LayerE2_s17_0_exec);
    _System_LayerE2_s17_0.setTrigger(new Event("event1", null));
    this.states["/System/LayerE2/s17"].addTransition(_System_LayerE2_s17_0);
    
    // transition /System/Layercanvas/s2
    var _System_Layercanvas_s2_0 = new Transition(this, this.states["/System/Layercanvas/s2"], [this.states["/System/Layercanvas/s2"]]);
    _System_Layercanvas_s2_0.setAction(this._System_Layercanvas_s2_0_exec);
    _System_Layercanvas_s2_0.setTrigger(new Event("event0", null));
    this.states["/System/Layercanvas/s2"].addTransition(_System_Layercanvas_s2_0);
    var _System_Layercanvas_s2_1 = new Transition(this, this.states["/System/Layercanvas/s2"], [this.states["/System/Layercanvas/s2"]]);
    _System_Layercanvas_s2_1.setAction(this._System_Layercanvas_s2_1_exec);
    _System_Layercanvas_s2_1.setTrigger(new Event("event1", null));
    this.states["/System/Layercanvas/s2"].addTransition(_System_Layercanvas_s2_1);
    
    // transition /System/LayerE3/s3
    var _System_LayerE3_s3_0 = new Transition(this, this.states["/System/LayerE3/s3"], [this.states["/System/LayerE3/s14"]]);
    _System_LayerE3_s3_0.setAction(this._System_LayerE3_s3_0_exec);
    _System_LayerE3_s3_0.setTrigger(new Event("event0", null));
    this.states["/System/LayerE3/s3"].addTransition(_System_LayerE3_s3_0);
    
    // transition /System/LayerE4/s4
    var _System_LayerE4_s4_0 = new Transition(this, this.states["/System/LayerE4/s4"], [this.states["/System/LayerE4/s13"]]);
    _System_LayerE4_s4_0.setAction(this._System_LayerE4_s4_0_exec);
    _System_LayerE4_s4_0.setTrigger(new Event("event0", null));
    this.states["/System/LayerE4/s4"].addTransition(_System_LayerE4_s4_0);
    
    // transition /System/LayerE4/s13
    var _System_LayerE4_s13_0 = new Transition(this, this.states["/System/LayerE4/s13"], [this.states["/System/LayerE4/s13"]]);
    _System_LayerE4_s13_0.setAction(this._System_LayerE4_s13_0_exec);
    _System_LayerE4_s13_0.setTrigger(new Event("event0", null));
    this.states["/System/LayerE4/s13"].addTransition(_System_LayerE4_s13_0);
    
    // transition /System/LayerE7/s7
    var _System_LayerE7_s7_0 = new Transition(this, this.states["/System/LayerE7/s7"], [this.states["/System/LayerE7/s7"]]);
    _System_LayerE7_s7_0.setAction(this._System_LayerE7_s7_0_exec);
    _System_LayerE7_s7_0.setTrigger(new Event("event1", null));
    this.states["/System/LayerE7/s7"].addTransition(_System_LayerE7_s7_0);
    
    // transition /System/LayerE8/s8
    var _System_LayerE8_s8_0 = new Transition(this, this.states["/System/LayerE8/s8"], [this.states["/System/LayerE8/s15"]]);
    _System_LayerE8_s8_0.setAction(this._System_LayerE8_s8_0_exec);
    _System_LayerE8_s8_0.setTrigger(new Event("event1", null));
    this.states["/System/LayerE8/s8"].addTransition(_System_LayerE8_s8_0);
    
    // transition /System/LayerE8/s15
    var _System_LayerE8_s15_0 = new Transition(this, this.states["/System/LayerE8/s15"], [this.states["/System/LayerE8/s15"]]);
    _System_LayerE8_s15_0.setAction(this._System_LayerE8_s15_0_exec);
    _System_LayerE8_s15_0.setTrigger(new Event("event1", null));
    this.states["/System/LayerE8/s15"].addTransition(_System_LayerE8_s15_0);
    
    // transition /System/LayerE9/s9
    var _System_LayerE9_s9_0 = new Transition(this, this.states["/System/LayerE9/s9"], [this.states["/System/LayerE9/s16"]]);
    _System_LayerE9_s9_0.setAction(this._System_LayerE9_s9_0_exec);
    _System_LayerE9_s9_0.setTrigger(new Event("event1", null));
    this.states["/System/LayerE9/s9"].addTransition(_System_LayerE9_s9_0);
    
    // transition /System/LayerE10/s10
    var _System_LayerE10_s10_0 = new Transition(this, this.states["/System/LayerE10/s10"], [this.states["/System/LayerE10/s12"]]);
    _System_LayerE10_s10_0.setAction(this._System_LayerE10_s10_0_exec);
    _System_LayerE10_s10_0.setTrigger(new Event("event0", null));
    this.states["/System/LayerE10/s10"].addTransition(_System_LayerE10_s10_0);
    
    // transition /System/LayerE10/s12
    var _System_LayerE10_s12_0 = new Transition(this, this.states["/System/LayerE10/s12"], [this.states["/System/LayerE10/s12"]]);
    _System_LayerE10_s12_0.setAction(this._System_LayerE10_s12_0_exec);
    _System_LayerE10_s12_0.setTrigger(new Event("event0", null));
    this.states["/System/LayerE10/s12"].addTransition(_System_LayerE10_s12_0);
    
    // transition /System/LayerControler/h00
    var _System_LayerControler_h00_0 = new Transition(this, this.states["/System/LayerControler/h00"], [this.states["/System/LayerControler/h00"]]);
    _System_LayerControler_h00_0.setAction(this._System_LayerControler_h00_0_exec);
    _System_LayerControler_h00_0.setTrigger(new Event("event", null));
    _System_LayerControler_h00_0.setGuard(this._System_LayerControler_h00_0_guard);
    this.states["/System/LayerControler/h00"].addTransition(_System_LayerControler_h00_0);
    var _System_LayerControler_h00_1 = new Transition(this, this.states["/System/LayerControler/h00"], [this.states["/System/LayerControler/h00"]]);
    _System_LayerControler_h00_1.setAction(this._System_LayerControler_h00_1_exec);
    _System_LayerControler_h00_1.setTrigger(new Event("event", null));
    _System_LayerControler_h00_1.setGuard(this._System_LayerControler_h00_1_guard);
    this.states["/System/LayerControler/h00"].addTransition(_System_LayerControler_h00_1);
};

Interaction.prototype._System_LayerE2_s0_0_exec = function(parameters) {
    screenActive.call(this,'E2',0);
};

Interaction.prototype._System_LayerE2_s17_0_exec = function(parameters) {
    screenActive.call(this,'E2',0);
};

Interaction.prototype._System_Layercanvas_s2_0_exec = function(parameters) {
    this.E1rem();
    this.E8rem();
    this.E9rem();
    this.E1update();
    this.E10add();
    this.E2rem();
};

Interaction.prototype._System_Layercanvas_s2_1_exec = function(parameters) {
    this.E4add();
};

Interaction.prototype._System_LayerE3_s3_0_exec = function(parameters) {
    screenActive.call(this,'E3',0);
};

Interaction.prototype._System_LayerE4_s4_0_exec = function(parameters) {
    screenActive.call(this,'E4',0);
};

Interaction.prototype._System_LayerE4_s13_0_exec = function(parameters) {
    screenActive.call(this,'E4',0);
};

Interaction.prototype._System_LayerE7_s7_0_exec = function(parameters) {
    screenActive.call(this,'E7',0);
    screenActive.call(this,'E7',0);
};

Interaction.prototype._System_LayerE8_s8_0_exec = function(parameters) {
    screenActive.call(this,'E8',0);
};

Interaction.prototype._System_LayerE8_s15_0_exec = function(parameters) {
    screenActive.call(this,'E8',0);
};

Interaction.prototype._System_LayerE9_s9_0_exec = function(parameters) {
    screenActive.call(this,'E9',0);
};

Interaction.prototype._System_LayerE10_s10_0_exec = function(parameters) {
    screenActive.call(this,'E10',0);
    screenActive.call(this,'E10',0);
};

Interaction.prototype._System_LayerE10_s12_0_exec = function(parameters) {
    screenActive.call(this,'E10',0);
    screenActive.call(this,'E10',0);
};

Interaction.prototype._System_LayerControler_h00_0_exec = function(parameters) {
    this.raiseInternalEvent(new Event("event0", null, new Array()));
};

Interaction.prototype._System_LayerControler_h00_0_guard = function(parameters) {
    return this.inState(["/System/Layercanvas/s2"]) and this.inState(["/System/LayerE3/s3"]) and this.type == 'E8';
};

Interaction.prototype._System_LayerControler_h00_1_exec = function(parameters) {
    this.raiseInternalEvent(new Event("event1", null, new Array()));
};

Interaction.prototype._System_LayerControler_h00_1_guard = function(parameters) {
    return this.inState(["/System/LayerE9/s9"]) and this.type == 'E9';
};

Interaction.prototype.initializeStatechart = function() {
    // enter default state
    this.default_targets = this.states["/System"].getEffectiveTargetStates();
    RuntimeClassBase.prototype.initializeStatechart.call(this);
};

// add symbol 'Interaction' to package 'Synthetic50J'
Synthetic50J.Interaction = Interaction;

var ObjectManager = function(controller) {
    ObjectManagerBase.call(this, controller);
};
ObjectManager.prototype = new Object();
(function() {
    var proto = new ObjectManagerBase();
    for (prop in proto) {
        ObjectManager.prototype[prop] = proto[prop];
    }
})();

ObjectManager.prototype.instantiate = function(class_name, construct_params) {
    if (class_name === "Interaction") {
        var instance = new Interaction(this.controller);
        instance.associations = new Object();
    } else  {
        throw new Error("Cannot instantiate class " + class_name);
    }
    return instance;
};

// add symbol 'ObjectManager' to package 'Synthetic50J'
Synthetic50J.ObjectManager = ObjectManager;

var Controller = function(event_loop_callbacks, finished_callback, behind_schedule_callback) {
    if (finished_callback === undefined) finished_callback = null;
    if (behind_schedule_callback === undefined) behind_schedule_callback = null;
    EventLoopControllerBase.call(this, new ObjectManager(this), event_loop_callbacks, finished_callback, behind_schedule_callback);
    this.addInputPort("ui");
    this.object_manager.createInstance("Interaction", new Array());
};
Controller.prototype = new Object();
(function() {
    var proto = new EventLoopControllerBase();
    for (prop in proto) {
        Controller.prototype[prop] = proto[prop];
    }
})();

// add symbol 'Controller' to package 'Synthetic50J'
Synthetic50J.Controller = Controller;
})();