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
    document.getElementById(canvasID).addEventListener('contextmenu', event => event.preventDefault());
    return svgCanvas;
}

var addPacManInstance = function(canvasID) {
	console.log("addPacMan");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));

    var image = document.createElementNS("http://www.w3.org/2000/svg", "image");
    image.setAttributeNS('http://www.w3.org/1999/xlink','href','circle-solid.svg');
    image.setAttribute('x',5);
    image.setAttribute('y',5);
    image.setAttribute('width',"40");
    image.setAttribute('height',"40");
    
    var cover = document.createElementNS("http://www.w3.org/2000/svg","rect");
    cover.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    cover.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    cover.setAttribute('fill-opacity',0.0);
    cover.setAttribute('data-type',"PacManInstance");
    cover.setAttribute('id',"PacManInstance");
    cover.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    cover.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    cover.setAttribute('data-name',"PacManInstance");

    rect.appendChild(image);
    rect.appendChild(cover);
    this.svg.appendChild(rect);
    this.event.target = rect;
	
}

var addGhostInstance = function(canvasID) {
	console.log("addGhost");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('xmlns:xlink','http://www.w3.org/1999/xlink');
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));

    var image = document.createElementNS("http://www.w3.org/2000/svg", "image");
    image.setAttributeNS('http://www.w3.org/1999/xlink','href','ghost-solid.svg');
    image.setAttribute('x',5);
    image.setAttribute('y',5);
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

var addFoodInstance = function(canvasID) {
	console.log("addFood");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));

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

var addScoreInstance = function(canvasID) {
	console.log("addScore");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    rect.setAttribute('style',"fill:rgb(0,0,0)");
    
    var icon = document.createElementNS("http://www.w3.org/2000/svg", "text");
    icon.setAttribute('text-anchor',"middle");
    icon.setAttribute('x',25);
    icon.setAttribute('y',40);
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

var addGridInstance = function(canvasID){
	console.log("addGrid");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    rect.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    rect.setAttribute('style',"fill:rgb(2,5,58)");
    
    var image = document.createElementNS("http://www.w3.org/2000/svg", "rect");
    image.setAttribute('x',0);
    image.setAttribute('y',0);
    image.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    image.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    image.setAttribute('style',"fill:rgb(2,5,58)");    
    
    
    var cover = document.createElementNS("http://www.w3.org/2000/svg","rect");
    cover.setAttribute('width',document.getElementById(canvasID).getAttribute("data-gridsizex"));
    cover.setAttribute('height',document.getElementById(canvasID).getAttribute("data-gridsizey"));
    cover.setAttribute('fill-opacity',0.0);
    cover.setAttribute('data-type',"GridInstance");
    cover.setAttribute('id',"GridInstance");
    cover.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    cover.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    cover.setAttribute('data-name',"GridInstance");
    
    rect.appendChild(image);
    rect.appendChild(cover);
    this.svg.appendChild(rect);
    this.event.target = rect;
}

var remInstance = function(element){
	var marked = document.querySelectorAll("[data-mark='mark']");
	for (var i = 0; i < marked.length; i++) {
		marked[i].viewportElement.remove();
	}
	//this.event.target.viewportElement.remove();
}

var markInstance = function(element) {
	var marked = document.querySelectorAll("[data-mark='mark']");
	console.log(marked);
	//unmark previously marked
	for (var i = 0; i < marked.length; i++) {
		marked[i].setAttribute('data-mark', '');
	}
	
	element.setAttribute('data-mark', 'mark');
	console.log(element);
	console.log("Just marked");
}

var moveInstance = function(element,canvasID) {
	var marked = document.querySelectorAll("[data-mark='mark']");
	console.log(marked);
	console.log(element);
	console.log("Just moved");
	//unmark previously marked
	for (var i = 0; i < marked.length; i++) {
		marked[i].viewportElement.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
		marked[i].viewportElement.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
		marked[i].setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
		marked[i].setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
	}
}

var openNav = function(navBar) {
// maybe later	
//    document.getElementById("mySidenav").style.width = document.getElementById("mySidenav").getAttribute("data-defaultwith");
    document.getElementById(navBar).style.width = "250px";
}

var closeNav = function(navBar) {
    document.getElementById(navBar).style.width = "0";
}

var screenset = function(element,value){
	console.log("setter");
  console.log(element);
  console.log(value);
  var x = document.getElementById(element);
  switch (value) {
    case "active":
      if (!hasClass(x, "active"))
        addClass(x, "active");
      break;
    
    case "default":
        removeClass(x, "active");      
      break;
  
    case "visible":
      if (hasClass(x, "notVisible"))
        removeClass(x, "notVisible");
      break;

    case "notvisible":
      if (!hasClass(x, "notVisible"))
        addClass(x, "notVisible");
      break;

    case "update":
      x.innerHTML = this.event.target.getAttribute(x.dataset.atompmInterfaceDataSource);
      console.log("updater");
      console.log(x.dataset.atompmInterfaceDataSource);
      console.log(this.event.target.getAttribute(x.dataset.atompmInterfaceDataSource));
      break;
    default:
      break;
  }
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