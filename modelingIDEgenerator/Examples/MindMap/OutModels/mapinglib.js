/**
 * http://usejsdoc.org/
 */

var idCount = 0;

var scConstructor = function(canvasID){
    var svgCanvas = document.createElementNS("http://www.w3.org/2000/svg","svg");
    var svgCanvasNS = svgCanvas.namespaceURI;
    // adding id to canvas breaks the code ...
    svgCanvas.setAttribute('width','1500');
    svgCanvas.setAttribute('height','1000');
    svgCanvas.setAttribute('id','svgCanvas');
    svgCanvas.setAttribute('data-type',"svgCanvas");
    svgCanvas.innerHTML = "no SVG support ?";
    //this has to be the last append ?
    document.getElementById(canvasID).appendChild(svgCanvas);
    document.getElementById(canvasID).addEventListener('contextmenu', event => event.preventDefault());
    return svgCanvas;
}

var add = function(canvasID, elementType){
    var foreign = document.createElementNS('http://www.w3.org/2000/svg', 'foreignObject')
    var textdiv = document.createElement("div");
    var textnode = document.createTextNode("Click to edit");
    var elem = document.createElementNS("http://www.w3.org/2000/svg","svg");
    var rect = document.createElementNS("http://www.w3.org/2000/svg","rect");
    var subRect = document.createElementNS("http://www.w3.org/2000/svg","rect");

    elem.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    elem.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    elem.setAttribute('width',200);
    elem.setAttribute('height',50);
    //elem.setAttribute('id',idCount);


    //rect.setAttribute('x',this.event.clientX - (this.event.clientX%document.getElementById(canvasID).getAttribute("data-gridsizex")));
    //rect.setAttribute('y',this.event.clientY - (this.event.clientY%document.getElementById(canvasID).getAttribute("data-gridsizey")));
    rect.setAttribute('width',200);
    rect.setAttribute('height',50);
    if(elementType == "Topic"){
        rect.setAttribute('style',"fill:rgb(238,119,51)");
        subRect.setAttribute('style',"fill:rgb(248,205,180)");
        rect.setAttribute('data-type',"Topic");
        rect.setAttribute('data-name',"Topic");
        elem.setAttribute('data-type',"Topic");
        elem.setAttribute('data-name',"Topic");
    } else {
        rect.setAttribute('style',"fill:rgb(136,204,238)");
    	subRect.setAttribute('style',"fill:rgb(181,231,248)");
        rect.setAttribute('data-type',"SubTopic");
        rect.setAttribute('data-name',"SubTopic");
        elem.setAttribute('data-type',"SubTopic");
        elem.setAttribute('data-name',"SubTopic");
    }

    rect.setAttribute('id',idCount);
    idCount++;
    rect.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById(canvasID).getAttribute("data-gridsizex")));
    rect.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById(canvasID).getAttribute("data-gridsizey")));
    //select(rect);

    subRect.setAttribute("width", "156");
    subRect.setAttribute("height", "24");
    subRect.setAttribute('x',"37");
    subRect.setAttribute('y',"13");
    
    textdiv.appendChild(textnode);
    textdiv.setAttribute("contentEditable", "true");
    textdiv.setAttribute("width", "auto");
    foreign.setAttribute("width", "150");
    foreign.setAttribute("height", "20");
    foreign.setAttribute('style',"text-align: left; display:inline-block");
    textdiv.setAttribute('style',"display: inline-block");
    foreign.setAttribute('x',"40");
    foreign.setAttribute('y',"15");

    elem.appendChild(rect);
    elem.appendChild(subRect);
    elem.appendChild(foreign);
    foreign.appendChild(textdiv);

    this.svg.appendChild(elem);
    this.event.target = rect;
    
    vElement["focusElement"] = rect;

    //var topicText = document.createElementNS("http://www.w3.org/2000/svg","text");

    //<foreignObject x="10" y="10" width="100" height="150">
    //<div xmlns="http://www.w3.org/1999/xhtml">
    //<input></input>
    //    </div>
    //</foreignObject>

    //<svg width="100" height="100" >
    //  <g transform="translate(40,40)">
    //    <text contentEditable="true">foo</text>
    //  </g>
    //</svg>
}

var addLink = function(sourceName,targetName){
  //var source = document.querySelectorAll("[data-select='select']");
  var source = vElement[sourceName];
  var target = vElement[targetName];

  var line = document.createElementNS("http://www.w3.org/2000/svg","line");

  line.setAttribute('style',"stroke:rgb(0,0,0);stroke-width:3");

  console.log(" -------------------source");
  console.log(vElement);
  
  //for (var i = 0; i < source.length; i++) {
  //  console.log(source[i]);
  //  line.setAttribute('x1',source[i].getAttribute("data-xPos")*5+100);
  //  line.setAttribute('y1',source[i].getAttribute("data-yPos")*5+25);
  //  line.setAttribute('data-xPosSource',source[i].getAttribute("data-xPos"));
  //  line.setAttribute('data-yPosSource',source[i].getAttribute("data-yPos"));
  //  line.setAttribute('data-source', source[i].getAttribute("id"));
  //}

  console.log(source);
  line.setAttribute('x1',source.getAttribute("data-xPos")*5+100);
  line.setAttribute('y1',source.getAttribute("data-yPos")*5+25);
  line.setAttribute('data-xPosSource',source.getAttribute("data-xPos"));
  line.setAttribute('data-yPosSource',source.getAttribute("data-yPos"));
  line.setAttribute('data-source', source.getAttribute("id"));

  console.log(target);
  line.setAttribute('x2',target.getAttribute("data-xPos")*5+100);
  line.setAttribute('y2',target.getAttribute("data-yPos")*5+25);
  line.setAttribute('data-xPosTarget',target.getAttribute("data-xPos"));
  line.setAttribute('data-yPosTarget',target.getAttribute("data-yPos"));
  line.setAttribute('data-target', target.getAttribute("id"));

  line.setAttribute('data-type',"Link");
  line.setAttribute('data-name',"Link");
  
  line.setAttribute('id',idCount);
//  select(line);
  idCount++;

  this.svg.insertBefore(line, this.svg.childNodes[0]); 
 // this.svg.appendChild(line);
  this.event.target = line;
  vElement["focusElement"] = line;
}

var rem = function(element){
  
  if (element == undefined || element == "") {
    element="focusElement";
    console.log(element);
  }
  var marked = vElement[element];
  console.log("Delete function");
  console.log(marked);
  console.log(vElement);
  var links;

  console.log(marked);
  if (marked == undefined) {
    return;
  }
  if (marked.getAttribute("data-type") != "Link") {
    links = document.querySelectorAll("[data-source='" + marked.getAttribute("id") + "']");
    for (var j = 0; j < links.length; j++){
      links[j].remove();
    } 
    links = document.querySelectorAll("[data-target='" + marked.getAttribute("id") + "']");
    for (var j = 0; j < links.length; j++){
      links[j].remove();
    }
    marked.parentNode.remove();
  }else{
    marked.remove();
  }
}

var equalsVElement = function(element){
  console.log("Guard function");
  console.log(element);
  console.log(vElement[element]);
  if(vElement[element] != undefined){
	console.log(vElement["focusElement"]);
  	vElement["focusElement"] = vElement[element];
	console.log(vElement["focusElement"]);
  	return true;
  }
  return false;
}

var move = function(element, base){
//	var marked = document.querySelectorAll("[data-mark='mark']");
  var marked = vElement["focusElement"];
	console.log(marked);
  console.log(element);
  console.log("I need to move");
  console.log(vElement);
  console.log(this.event.clientX);
  console.log(this.event.clientY);
  console.log("Just moved");
  var links;
  var x = (this.event.clientX-10) - ((this.event.clientX-10)%document.getElementById("23").getAttribute("data-gridsizex"));
  var y = (this.event.clientY-10) - ((this.event.clientY-10)%document.getElementById("23").getAttribute("data-gridsizey"));
  console.log("X " + x);
  console.log("Y " + y);
//  for (var i = 0; i < marked.length; i++) {
    console.log(marked.viewportElement.getAttribute('x'));
    console.log(marked.viewportElement.getAttribute('y'));
    console.log(marked.viewportElement.getAttribute('id'));
    console.log(marked.getAttribute('x'));
    console.log(marked.getAttribute('y'));
    console.log(marked.getAttribute('id'));
    links = document.querySelectorAll("[data-source='" + marked.getAttribute("id") + "']");
    for (var j = 0; j < links.length; j++){
      links[j].setAttribute('x1',x+100);
      links[j].setAttribute('y1',y+25);
    } 
    links = document.querySelectorAll("[data-target='" + marked.getAttribute("id") + "']");
    for (var j = 0; j < links.length; j++){
      links[j].setAttribute('x2',x+100);
      links[j].setAttribute('y2',y+25);
    } 

		marked.parentNode.setAttribute('x',x);
		marked.parentNode.setAttribute('y',y);
		marked.setAttribute('data-xPos',Math.floor(this.event.clientX/document.getElementById("23").getAttribute("data-gridsizex")));
		marked.setAttribute('data-yPos',Math.floor(this.event.clientY/document.getElementById("23").getAttribute("data-gridsizey")));
//  }
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
  //temp fix
  if(x == null){
    return;
  }

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

// end from -> https://jaketrent.com/post/addremove-classes-raw-javascript/raw-javascript/

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