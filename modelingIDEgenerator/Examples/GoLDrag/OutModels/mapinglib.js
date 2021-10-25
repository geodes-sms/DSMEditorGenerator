/**
 * http://usejsdoc.org/
 */

var scConstructor = function(canvasID){
	var svgCanvas = document.createElementNS("http://www.w3.org/2000/svg","svg");
	var svgCanvasNS = svgCanvas.namespaceURI;
	// adding id to canvas breaks the code ...
	//svgCanvas.setAttribute('id','svgCanvas');
    svgCanvas.setAttribute('width','1600');
    svgCanvas.setAttribute('height','900');
    svgCanvas.setAttribute('id','svgCanvas');
    svgCanvas.innerHTML = "no SVG support ?";
    //this has to be the last append ?
    document.getElementById(canvasID).appendChild(svgCanvas);
//	svgCanvas.setAttribute('onClick', 'GoL06.Interaction.prototype.releaseCall(event)', false);
///    document.getElementById(canvasID).addEventListener("click",function() {GoL06.Interaction.prototype.releaseCall(event);}, false);
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
    rect.setAttribute('data-type',"Life");
    rect.setAttribute('id',"Life");
    rect.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('data-name',"Life");
    this.svg.appendChild(rect);
    this.event.target = rect;
}

var openNav = function(navBar) {
// maybe later	
//    document.getElementById("mySidenav").style.width = document.getElementById("mySidenav").getAttribute("data-defaultwith");
    document.getElementById(navBar).style.width = "250px";
}

var closeNav = function(navBar) {
    document.getElementById(navBar).style.width = "0";
}

var screenDisable = function(element,value){
	console.log("disable");
	console.log(element);
	var x = document.getElementById(element);
	if (val == 0 && !hasClass(x, "disabled"))
	   addClass(x, "disabled");
}

var screenEnable = function(element,value){
	console.log("enable");
	console.log(element);
	var x = document.getElementById(element);
	if (val == 1 && hasClass(x, "disabled"))
		removeClass(x, "disabled");
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

var screenset = function(element,value){
  var x = document.getElementById(element);

  if(value == "default" || value == null){
    if(x.getAttribute('data-style')!=null && x.getAttribute('data-style')!=""){
        console.log("removed " + (x.getAttribute('data-style')==""));
	    removeClass(x, x.getAttribute('data-style'));
	    x.setAttribute('data-style', '');
    }
  }else { if (!hasClass(x, value)){
    addClass(x, value);
    console.log("added " + value);
    x.setAttribute('data-style', value);
  }}
 	var inner = x.innerHTML;
	x.innerHTML = inner;
}

var screenSetter = function(element,value){
	console.log("setter");
	console.log(element);
  var x = document.getElementById(element);
  if (value === 1) {
    x.style.display = "";
  }else{
    if (value === 0) {
      x.style.display = "none";
    }
  }
}

var screenUpdater = function(element){
	console.log("updating");
	console.log(element);
	var x = document.getElementById(element);
	if(x.innerHTML == "On"){
		x.innerHTML = "";
	}else{
		x.innerHTML = "On";
	}
}

//var deleteElems = function(){
//  var element = document.getElementById("svgCanvas");
//  while (element.lastChild) {
//    element.removeChild(element.lastChild);
//  }
//}

var simulateGoL = function(){
  console.log("Running GoL simulation");
  //this
  var element = document.getElementById("svgCanvas");
  var x;
  var y;
  var shift;

  for (i = 0; i<1; i++){
    for (c of element.children){
      x=Number(c.getAttribute("data-xPos"));
//      shift = Math.floor(Math.random()*7)-3;
      shift = Math.floor(Math.random()*3)-1;
      c.setAttribute("data-xPos",x+shift);
      c.setAttribute("x",(x+shift)*10);
      y=Number(c.getAttribute("data-yPos"));
//      shift = Math.floor(Math.random()*7)-3;
      shift = Math.floor(Math.random()*3)-1;
      c.setAttribute("data-yPos",y+shift);
      c.setAttribute("y",(y+shift)*10);
    }
    
    for (c of element.children){
      x=Number(c.getAttribute("data-xPos"));
      y=Number(c.getAttribute("data-yPos"));
      overlap = document.elementFromPoint(x*10+5,y*10+5) // for proper construction of GoL
      console.log(overlap === c);
      if(overlap !== c){
        element.removeChild(c);
      }
      //    console.log(c);  
    }
  }
  setTimeout(function afterTwoSeconds() {
    GoLDrag.Interaction.prototype.triggerEvent(event,event.target.id,'_finish');
  }, 1000);
}

//from -> https://jaketrent.com/post/addremove-classes-raw-javascript/

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