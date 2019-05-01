/**
 * http://usejsdoc.org/
 */

var scConstructor = function(canvasID){
	var svgCanvas = document.createElementNS("http://www.w3.org/2000/svg","svg");
	var svgCanvasNS = svgCanvas.namespaceURI;
	// adding id to canvas breaks the code ...
	//svgCanvas.setAttribute('id','svgCanvas');
    svgCanvas.setAttribute('width','1500');
    svgCanvas.setAttribute('height','1000');
    svgCanvas.setAttribute('id','svgCanvas');
    svgCanvas.setAttribute('xmlns:xlink','http://www.w3.org/1999/xlink');
    svgCanvas.innerHTML = "no SVG support ?";
    //this has to be the last append ?
    document.getElementById(canvasID).appendChild(svgCanvas);
//	svgCanvas.setAttribute('onClick', 'GoL05.Interaction.prototype.releaseCall(event)', false);
///    document.getElementById(canvasID).addEventListener("click",function() {GoL05.Interaction.prototype.releaseCall(event);}, false);
    document.getElementById(canvasID).addEventListener('contextmenu', event => event.preventDefault());
//    document.getElementById(canvasID).addEventListener('contextmenu', function() {document.getElementById("19").style.width = "250px";});
//	svgCanvas.addEventListener('onClick',"GoL03.Interaction.prototype.releaseCall(event)");
//	document.body.setAttribute('oncontextmenu',"GoL03.Interaction.prototype.releaseCall(event);");
    return svgCanvas;
}

var remLife = function(element){
	this.event.target.remove();
}

var addLife = function(canvasID){
    var rect = document.createElementNS("http://www.w3.org/2000/svg","rect");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    rect.setAttribute('style',"fill:rgb(0,0,0)");
    rect.setAttribute('data-type',"life");
    rect.setAttribute('id',"life");
    rect.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('data-name',"life");
    this.svg.appendChild(rect);
    this.event.target = rect;
}

var addPacManInstance = function(canvasID) {
	console.log("addPacMan");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    rect.setAttribute('style',"fill:yellow");

 //   rect.setAttribute('fill-opacity',"0.0");
    
    var icon = document.createElementNS("http://www.w3.org/2000/svg", "text");
    var icontext = document.createTextNode('\uf111');
   // var icontext = document.createTextNode("O");
    icon.setAttribute('text-anchor',"middle");
    icon.setAttribute('x',"25");
    icon.setAttribute('y',"40");
    icon.setAttribute("font-family", "FontAwesome");
    icon.setAttribute("font-size", "40");
    
    var cover = document.createElementNS("http://www.w3.org/2000/svg","rect");
    cover.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    cover.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    cover.setAttribute('fill-opacity',0.0);
    cover.setAttribute('data-type',"PacManInstance");
    cover.setAttribute('id',"PacManInstance");
    cover.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    cover.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    cover.setAttribute('data-name',"PacManInstance");

    icon.appendChild(icontext);
    rect.appendChild(icon);
    rect.appendChild(cover);
    this.svg.appendChild(rect);
    this.event.target = rect;
	
}

var remPacManInstance = function(element){
	this.event.target.viewportElement.remove();
}

var addGhostInstance = function(canvasID) {
	console.log("addGhost");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('xmlns:xlink','http://www.w3.org/1999/xlink');
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    rect.setAttribute('style',"fill:pink");
 //   rect.setAttribute('fill-opacity',"0.0");
    
/*    var icon = document.createElementNS("http://www.w3.org/2000/svg", "text");
    icon.setAttribute('text-anchor',"middle");
    icon.setAttribute('x',25);
    icon.setAttribute('y',40);
    icon.setAttribute('color',"pink");
    //icon.setAttribute("xlink:href", "carrot-solid.svg");
    icon.appendChild(document.createTextNode('\uf111'));
    icon.setAttribute("font-size", "40");
    icon.setAttribute("font-family", "FontAwesome");

    rect.appendChild(icon);*/
    
 // this works , missing color
    var image = document.createElementNS("http://www.w3.org/2000/svg", "image");
    image.setAttributeNS('http://www.w3.org/1999/xlink','href','ghost-solid.svg');
    image.setAttribute('x',5);
    image.setAttribute('y',5);
    image.setAttribute('color',"pink");
    image.setAttribute('width',"40");
    image.setAttribute('height',"40");
    
    var cover = document.createElementNS("http://www.w3.org/2000/svg","rect");
    cover.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    cover.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    cover.setAttribute('fill-opacity',0.0);
    cover.setAttribute('data-type',"GhostInstance");
    cover.setAttribute('id',"GhostInstance");
    cover.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    cover.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    cover.setAttribute('data-name',"GhostInstance");

    rect.appendChild(image);
    rect.appendChild(cover);
    this.svg.appendChild(rect);
    this.event.target = rect;
	
}

var remGhostInstance = function(element){
	this.event.target.viewportElement.remove();
}

var addFoodInstance = function(canvasID) {
	console.log("addFood");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    rect.setAttribute('style',"fill:orange");

 //   rect.setAttribute('fill-opacity',"0.0");
    
/*    var icon = document.createElementNS("http://www.w3.org/2000/svg", "text");
    icon.setAttribute('text-anchor',"middle");
    icon.setAttribute('x',25);
    icon.setAttribute('y',40);
    icon.setAttribute('color',"orange");
    //icon.setAttribute("xlink:href", "carrot-solid.svg");
    icon.appendChild(document.createTextNode('\uf111'));
    icon.setAttribute("font-size", "40");
    icon.setAttribute("font-family", "FontAwesome");*/
    
    var image = document.createElementNS("http://www.w3.org/2000/svg", "image");
    image.setAttributeNS('http://www.w3.org/1999/xlink','href','carrot-solid.svg');
    image.setAttribute('x',15);
    image.setAttribute('y',15);
    image.setAttribute('width',"20");
    image.setAttribute('height',"20");
    
    var cover = document.createElementNS("http://www.w3.org/2000/svg","rect");
    cover.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    cover.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    cover.setAttribute('fill-opacity',0.0);
    cover.setAttribute('data-type',"FoodInstance");
    cover.setAttribute('id',"FoodInstance");
    cover.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    cover.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    cover.setAttribute('data-name',"FoodInstance");

    rect.appendChild(image);
    rect.appendChild(cover);
    this.svg.appendChild(rect);
    this.event.target = rect;
	
}

var remFoodInstance = function(element){
	this.event.target.viewportElement.remove();
}

var addScoreInstance = function(canvasID) {
	console.log("addFood");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    rect.setAttribute('style',"fill:rgb(0,0,0)");
 //   rect.setAttribute('fill-opacity',"0.0");
    
    var icon = document.createElementNS("http://www.w3.org/2000/svg", "text");
    icon.setAttribute('text-anchor',"middle");
    icon.setAttribute('x',25);
    icon.setAttribute('y',40);
    icon.setAttribute('color',"orange");
    //icon.setAttribute("xlink:href", "carrot-solid.svg");
    icon.appendChild(document.createTextNode('#'));
    icon.setAttribute("font-size", "40");
    icon.setAttribute("font-family", "FontAwesome");
    
    var cover = document.createElementNS("http://www.w3.org/2000/svg","rect");
    cover.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    cover.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    cover.setAttribute('fill-opacity',0.1);
    cover.setAttribute('data-type',"ScoreInstance");
    cover.setAttribute('id',"ScoreInstance");
    cover.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    cover.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    cover.setAttribute('data-name',"ScoreInstance");

    rect.appendChild(icon);
    rect.appendChild(cover);
    this.svg.appendChild(rect);
    this.event.target = rect;
	
}

var remScoreInstance = function(element){
	this.event.target.viewportElement.remove();
}

var addGridInstance = function(canvasID){
    var rect = document.createElementNS("http://www.w3.org/2000/svg","rect");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    rect.setAttribute('style',"fill:rgb(2,5,58)");
    rect.setAttribute('data-type',"GridInstance");
    rect.setAttribute('id',"GridInstance");
    rect.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('data-name',"GridInstance");
    this.svg.appendChild(rect);
    this.event.target = rect;
}

var remGridInstance = function(element){
	this.event.target.remove();
}

var openNav = function(navBar) {
// maybe later	
//    document.getElementById("mySidenav").style.width = document.getElementById("mySidenav").getAttribute("data-defaultwith");
    document.getElementById(navBar).style.width = "250px";
}

var closeNav = function(navBar) {
    document.getElementById(navBar).style.width = "0";
}

var screenSetter = function(element,value){
	console.log("setter");
	console.log(element);
    var x = document.getElementById(element);
    if (hasClass(x, "notVisible") && value === 1) {
//           x.style.display = "";
          removeClass(x, "notVisible");
    }else{
       if (!hasClass(x, "notVisible") && value === 0) {
//          x.style.display = "none";
          addClass(x, "notVisible");
       }
    }
}

var screenUpdater = function(element){
	var x = document.getElementById(element);
	x.innerHTML = this.event.target.getAttribute(x.dataset.atompmInterfaceDataSource);
	console.log("updater");
	console.log(x.dataset.atompmInterfaceDataSource);
	console.log(this.event.target.getAttribute(x.dataset.atompmInterfaceDataSource));
}

var screenActive = function(element,val){
	var x = document.getElementById(element);
	console.log("set active");
	if (val = 1 && !hasClass(x, "active"))
	   addClass(x, "active");
	else
	   removeClass(x, "active");
}

// from -> https://jaketrent.com/post/addremove-classes-raw-javascript/

function hasClass(el, className) {
  if (el.classList)
    return el.classList.contains(className)
  else
    return !!el.className.match(new RegExp('(\\s|^)' + className + '(\\s|$)'))
}

function addClass(el, className) {
  if (el.classList)
    el.classList.add(className)
  else if (!hasClass(el, className)) el.className += " " + className
}

function removeClass(el, className) {
  if (el.classList)
    el.classList.remove(className)
  else if (hasClass(el, className)) {
    var reg = new RegExp('(\\s|^)' + className + '(\\s|$)')
    el.className=el.className.replace(reg, ' ')
  }
}

// end from -> https://jaketrent.com/post/addremove-classes-raw-javascript/

var newPacManModel = function(){
	console.log("clean model");
	var element = document.getElementById("svgCanvas");
    console.log(element);
    console.log(element.children);
    while (element.lastChild) {
       element.removeChild(element.lastChild);
    }
}