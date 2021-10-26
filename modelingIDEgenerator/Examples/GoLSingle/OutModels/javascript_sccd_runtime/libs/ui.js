/**
 * *REALLY* Small framework for creating/manipulating/deleting gui elements in a browser.
 *
 *	TODO / TBI
 * . finer append_*() layout control (as opposed to current append at the end of the window)
 * . finer print control (as opposed to current append at the end of main window)
 *	. replicate ui.EVENTS for style properties
 *	. complete this list
 *
 * Author: Raphael Mannadiar
 * Date: 2014/08/14
 */

['svg'].forEach(
	function(dependency) {if( this[dependency] === undefined ) throw 'Missing dependency: '+dependency;});


ui = {};
ui.window = window;
ui.__nextWindowId = 0;

ui.EVENTS = {
	KEY_PRESS:				'keydown',
	MOUSE_CLICK: 			'click',
	MOUSE_MOVE: 			'mousemove',
	MOUSE_PRESS:			'mousedown',
	MOUSE_RELEASE:			'mouseup',
	MOUSE_RIGHT_CLICK: 	'contextmenu',
	WINDOW_CLOSE: 			'unload'
};

ui.MOUSE_BUTTONS = {
	LEFT:	 	0,
	MIDDLE:	1,
	RIGHT:	2
};

ui.KEYCODES	= {
	DELETE: 46
};

ui.append_button = function(_window,text) {
	var button = _window.document.createElement('button');
	button.innerHTML = text;
	_window.document.body.appendChild(button);
	return ui.wrap_element(button);
};


ui.append_canvas = function(_window,width,height,style) {
	var canvas = _window.document.createElementNS('http://www.w3.org/2000/svg', 'svg');
	canvas.setAttribute('width', width);
	canvas.setAttribute('height', height);
	for( var key in style )
		canvas.style[key] = style[key];
	_window.document.body.appendChild(canvas);
	return new svg.canvas_wrapper(canvas);
};


ui.bind_event = function(source,event,controller,raise_name,port,time_offset) {
	if( port === undefined) port = "ui";
	if( time_offset === undefined ) time_offset = 0.0;

	var args = [];
	switch(event) {
		case ui.EVENTS.KEY_PRESS:
			args = function(e) {return [e.keyCode, e.view]};
			source = source.document;
			break;

		case ui.EVENTS.MOUSE_CLICK:
		case ui.EVENTS.MOUSE_MOVE: 
		case ui.EVENTS.MOUSE_PRESS:
		case ui.EVENTS.MOUSE_RELEASE:
		case ui.EVENTS.MOUSE_RIGHT_CLICK:
			args = function(e) {return [e.clientX, e.clientY, e.button]};
			if( source instanceof svg.element_wrapper )
				source = source.element;
			break;

		case ui.EVENTS.WINDOW_CLOSE:
			args = function() {return [source]};
			break;

		default:
			throw 'Unsupported event';
	}

	source.addEventListener(
		event, 
		(function (controller, raise_name, port, time_offset) {
 			 return function(e) {
 						 e.preventDefault();
			 			 e.stopPropagation();
			 			 //console.log("adding input to port " + port);
			 			 controller.addInput(new Event(raise_name, port, args(e)), time_offset);};}
		)(controller, raise_name, port, time_offset));
};


ui.close_window = function(_window) {
	_window.close();
};


ui.log = function(value) {
	if( typeof(value) == 'object' )
		console.log(JSON.stringify(value));
	else
		console.log(value);
};


ui.new_window = function(width,height) {
	return window.open('',ui.__nextWindowId++,'width='+width+',height='+height);
};


ui.println = function(value,target) {
	if( target === undefined ) target = window.document.body;

	if( typeof(value) == 'object' )
		target.innerHTML += JSON.stringify(value);
	else
		target.innerHTML += value;
	target.innerHTML += '<br/>'
};


ui.wrap_element = function(element) {
	return {element:element};
};


