/**
 * Small framework for dynamically creating/deleting shapes on an SVG canvas and responding to events.
 *
 * Author: Joeri Exelmans
 * Date: 2014/07/26
 */

svg = {};

svg.__ui_element_wrapper = function(element) {
	this.element = element;
};

svg.canvas_wrapper = function(element) {
	svg.__ui_element_wrapper.call(this, element);

	this.namespace = "http://www.w3.org/2000/svg";
	this.width = parseInt(element.getAttribute('width'));
	this.height = parseInt(element.getAttribute('height'));
};

svg.canvas_wrapper.prototype = new svg.__ui_element_wrapper();

svg.canvas_wrapper.prototype.add_circle = function(x,y,r,style) {
	var new_element = document.createElementNS(this.namespace, "circle");
	new_element.setAttribute('r', r);
	new_element.setAttribute('stroke', '#000');
	for( var key in style )
		new_element.setAttribute(key, style[key]);
	this.element.appendChild(new_element);
	var wrapper = new svg.element_wrapper(this, new_element, x, y);
	return wrapper;
};

svg.canvas_wrapper.prototype.add_rectangle = function(x,y,w,h,style) {
	var new_element = document.createElementNS(this.namespace, "rect");
	new_element.setAttribute('width', w);
	new_element.setAttribute('height', h);
	for( var key in style )
		new_element.setAttribute(key, style[key]);
	this.element.appendChild(new_element);
	var wrapper = new svg.element_wrapper(this, new_element, x, y);
	var transl = this.element.createSVGTransform();
	transl.setTranslate(-w/2.0, -h/2.0);
	new_element.transform.baseVal.appendItem(transl);
	return wrapper;
};

svg.canvas_wrapper.prototype.add_text = function(x,y,textContent,style) {
    var new_element = document.createElementNS(this.namespace, "text");
    var textnode = document.createTextNode(textContent);
	new_element.setAttribute('x', x);
	new_element.setAttribute('y', y);
	for( var key in style )
		new_element.setAttribute(key, style[key]);
	this.element.appendChild(new_element);
	new_element.appendChild(textnode);
	var wrapper = new svg.element_wrapper(this, new_element, x, y);
    wrapper.textnode = textnode
	return wrapper;
}

svg.canvas_wrapper.prototype.remove_element = function(element) {
	this.element.removeChild(element.element);
};

svg.element_wrapper = function(canvas_wrapper, element, x, y) {
	svg.__ui_element_wrapper.call(this, element);
	this.a = 0.0;

	this.translation = canvas_wrapper.element.createSVGTransform();
	this.rotation = canvas_wrapper.element.createSVGTransform();

	this.translation.setTranslate(x,y);
	this.rotation.setRotate(this.a, 0.0, 0.0);

	/** WORKAROUND Chrome Issue 55010 (1of3) **/	
	if( window && window.chrome && window.chrome.webstore )
		this.__translation = {x:x, y:y};

	var t = this.element.transform.baseVal;
	t.appendItem(this.translation);
	t.appendItem(this.rotation);
};

svg.element_wrapper.prototype = new svg.__ui_element_wrapper();

svg.element_wrapper.prototype.set_position = function(x, y) {
	/** WORKAROUND Chrome Issue 55010 (2of3) **/
	if( window && window.chrome && window.chrome.webstore )
	{
		this.__translation.x = x;
		this.__translation.y = y;
		this.element.setAttribute('transform','translate('+this.__translation.x+' '+this.__translation.y+')');
	}
	else
		this.translation.setTranslate(x,y);
};

svg.element_wrapper.prototype.get_position = function() {
	/** WORKAROUND Chrome Issue 55010 (3of3) **/
	if( window && window.chrome && window.chrome.webstore )
		return {x:this.__translation.x, y:this.__translation.y};
	else
		return {x: this.translation.matrix.e, y: this.translation.matrix.f};
};

svg.element_wrapper.prototype.move = function(dx, dy) {
	var pos = this.get_position();
	this.set_position(pos.x + dx, pos.y + dy);
};

svg.element_wrapper.prototype.set_rotation = function(a) {
	this.a = a;
	this.rotation.setRotate(this.a, 0.0, 0.0);
};

svg.element_wrapper.prototype.rotate = function(a) {
	this.a += a;
	this.rotation.setRotate(this.a, 0.0, 0.0);
};

svg.element_wrapper.prototype.set_color = function(color) {
	this.element.setAttribute('fill', color);
};

svg.element_wrapper.prototype.set_text = function(textContent) {
	this.element.removeChild(this.textnode)
    textnode = document.createTextNode(textContent);
    this.element.appendChild(textnode)
    this.textnode = textnode
};
