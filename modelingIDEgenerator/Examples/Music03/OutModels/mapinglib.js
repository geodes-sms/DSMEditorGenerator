/**
 * http://usejsdoc.org/
 */

var scConstructor = function(canvasID){
	var svgCanvas = document.createElementNS("http://www.w3.org/2000/svg","svg");
	var svgCanvasNS = svgCanvas.namespaceURI;
	// adding id to canvas breaks the code ...
	//svgCanvas.setAttribute('id','svgCanvas');
    svgCanvas.setAttribute('width','820');
    svgCanvas.setAttribute('height','1000');
    svgCanvas.setAttribute('id','svgCanvas');
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

var remNote = function(element){
	this.event.target.remove();
}

var addNote = function(canvasID,note,length){
    var rect = document.createElementNS("http://www.w3.org/2000/svg","rect");
    var cursor = document.getElementById("27");
    console.log(cursor);
    console.log("RRRRRRRRRRRRRRRRRR");
    console.log(length);

    var rect = document.createElementNS("http://www.w3.org/2000/svg","svg");
    rect.setAttribute('x',cursor.style.left);
    rect.setAttribute('y',cursor.style.top);
    
    var icon = document.createElementNS("http://www.w3.org/2000/svg", "text");
    var icontext;
    switch (length){
	case "full":
    	icontext = document.createTextNode('𝅝');    
		break;
	case "half":
    	icontext = document.createTextNode('𝅗𝅥');    
		break;
	case "quarter":
    	icontext = document.createTextNode('𝅘𝅥');    
		break;
	case "eighth":
    	icontext = document.createTextNode('𝅘𝅥𝅮');    
		break;
	default:
    	icontext = document.createTextNode('𝅘𝅥𝅲');    
		break;
    }
   // var icontext = document.createTextNode("O");
    icon.setAttribute('text-anchor',"middle");
    icon.setAttribute('x',cursor.style.left);
    console.log(note);
    switch (note) {
	case "do":
		icon.setAttribute('y',parseInt(cursor.style.top));
		break;
	case "re":
		icon.setAttribute('y',parseInt(cursor.style.top)+14);
		break;
	case "mi":
		icon.setAttribute('y',parseInt(cursor.style.top)+19);
		break;
	case "fa":
		icon.setAttribute('y',parseInt(cursor.style.top)+24);
		break;
	case "sol":
		icon.setAttribute('y',parseInt(cursor.style.top)+29);
		break;
	case "la":
		icon.setAttribute('y',parseInt(cursor.style.top)+34);
		break;
	case "si":
		icon.setAttribute('y',parseInt(cursor.style.top)+39);
		break;
	default:
		icon.setAttribute('y',parseInt(cursor.style.top)+44);
		break;
	}
    
    icon.setAttribute("font-size", "42");
    
    icon.appendChild(icontext);
    this.svg.appendChild(icon);
    this.event.target = icon;
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
//	x.innerHTML = this.event.target.getAttribute(x.dataset.atompmInterfaceDataSource);
	console.log("update");
	var newValue = parseInt(x.style.left)+30;
	if (newValue < 800){
		x.style.left = newValue.toString() + "px";
	}else {
		x.style.left = "45px";
		newValue = parseInt(x.style.top)+150;
		x.style.top = newValue.toString() + "px";
	}
}

var screenActive = function(element, controll){
	var x = document.getElementById(element);
	if (!hasClass(x, "active") && controll == 1)
	   addClass(x, "active");
	else
		removeClass(x, "active");
	var inner = x.innerHTML;
	x.innerHTML = inner;
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

var newModel = function(cursor){
	console.log("NNNNNNNNNNNNNNNN");
	var element = document.getElementById("svgCanvas");
    console.log(element);
    console.log(element.children);
    while (element.lastChild) {
       element.removeChild(element.lastChild);
    }
    var cursorElement = document.getElementById(cursor);
    console.log(cursorElement);
    cursorElement.style.left = "70px";
    cursorElement.style.top = "150px";
}