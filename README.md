# DSMEditorGenerator
In model-driven engineering (MDE), it is customary to generate editors for
domain-specific languages (DSL). This software allows users to customize the
interaction with generated domain-specific modeling (DSM) editors. The goal
of this tool is to introduce user experience (UX) practices in the
development of DSM editors. The user has to define the DSL metamodel and
concrete syntax, but also three additional models: the interface model, the
interaction model, and the event mapping model. All models are defined in the
Eclipse Modeling Framework (EMF) as Ecore models. It is assumed that the
concrete syntax is graphical only, thus models are manipulated in a canvas.

* *DSL metamodel:* a class diagram showing the concepts, their properties,
   and their relations in the domain. For example, if the DSL is to construct
   family trees, the metamodel would consists of Person with a Name and Genre
   and Children associations to other Person.
    - In the presented projects this is encoded in the `mappinglib.js` files
* *DSL graphical concrete syntax:* assigns visualizations to each element of
   the metamodel. In the family tree example, a Person is rendered by an icon
   showing a male or female depending on the genre and a label below it to
   display his name. The children relation is represented as an arrow from a
   parent to a child.
    - In the presented projects this is encoded in the `mappinglib.js` files
* *Interface model:* defines the elements of the GUI and their layout. For
   the family tree example, we can have two layers. A canvas holds the model
   in concrete syntax. A toolbar has two buttons to create a male and female
   person.
* *Interaction model:* defines the behavior of the editor. It consists of
   cause-effect rules where, if a condition on the GUI is true and an
   specific event happens, then the effect will modify the GUI accordingly.
   For example, if the user selects the male button and clicks on the canvas,
   it creates an instance of a Person at that location. Another rule can be
   if the user right clicks on a person P, drags the cursor to another person
   C and releases the mouse, it creates a parent relation from P to C.
    - a textual syntax is provided in the `interactionTxt` files in the form
      `<RuleName> # <NodeName> |(<focus>:<InteractionElementType>:<ElementName>:<ElementValue>)* # --<event>--> # <NodeName> | <focus>:<InteractionElementType>:<ElementName>:<ElementValue>)* #`
      with `_` serving as a null or don't care value
* *Event mapping model:* maps I/O events to a specific platform and
   implementation. For example we map the "select" event defined in the rules
   to a left mouse click. We can also map it to other interaction streams,
   like an Arduino board.
    - a textual syntax is provided in the `mappingTxt` files in the form
      `<MappingType> # <Event|Operation> # <Expression to be mapped to>`
      with `_` serving as a null or don't care value


## Contents
This repository contains the source code of the Modeling IDE generator. It also
contains examples of editors that are output by the tool along with all the
required models. 

## Structure of the repository
* eclipseEditorsWorkspace (project files for the Eclipse ditors of the used DSLs)
    - ca.udem.iro.geodes.deploy (the compiled Eclipe editor plugins to be placed in the dropins folder of the used Eclipse instalation)
    - ca.udem.iro.geodes.interaction.interaction (project folders for the interaction model reflexive editor)
    -  ca.udem.iro.geodes.interaction.interaction.textualsyntax (project folders for the XText version of the interaction model editor - this version requires its own metamodel to make the editor behave in a natural way)
    -  ca.udem.iro.geodes.interaction.layout (project folders for the free form layout model reflexive editor - currently not in used as it requires a layout rendering engine)
    -  ca.udem.iro.geodes.interaction.layoutRel (project folders for the relative positioning layout model reflexive editor - it preserves and reuses the natural behaviour of HTML)
    -  ca.udem.iro.geodes.interaction.mapping (project folders for the mapping model reflexive editor)
* modelingIDEgenerator (all the generation resources used to generate modeling IDEs)
    - Examples (examples of diferent applications and patterns of the use of the Modeling IDE Generator)
    - Models (meta-model dependencies for the standalone execution)
    - Transformations (source code of the Modeling IDE Generator)

## Standalone Installation requirements (Windows)
* Java 1.8 or greater installed
* Chrome browser or equivalent (Firefox, Internet Explorer ... ,
  are not supported by SCCD)
* Apache Ant 1.10.6
* Python 2.7 (https://www.python.org/download/releases/2.7/)
* SCCD 0.9 (https://msdl.uantwerpen.be/git/simon/SCCD/src/master)
* Maintain the file structure provided, it should run as is, as all remaining
  dependencies are resolved by relative path for better portability

## Standalone Installation requirements (Linux)
* Java 1.8 or greater installed
* Chrome browser or equivalent (Firefox, Internet Explorer ... ,
  are not supported by SCCD)
* Apache Ant 1.10.6
* Python 2.7 (https://www.python.org/download/releases/2.7/)
* SCCD 0.9 (https://msdl.uantwerpen.be/git/simon/SCCD/src/master)
* make sure any AntRun.sh file has execution permitions as they may be lost
  during the packaging and unpackaging process
    - this can be done with 'chmod +x RunAnt.sh'

## How to use the DSM editor generator in Standalone
* Follow requirements installation procedures
* In the folder `/Examples` run  `RunAnt --Project <Example_Name>`
    - In Windows use RunAnt.bat, in Linux use RunAnt.sh
    - For example names, GoL06, Music04 and PacMan05 can be used (names with
	  spaces are not supported)
    - Additional ant parameters can be passed at the end of the command line
      such as `clean` to remove all the generated files for a fresh execution
* In the folder `/Performance_test/tests` run `RunAnt`
    - In Windows use RunAnt.bat, in Linux use RunAnt.sh
    - to configure what tests are performed inside the script change the loop
      parameter. in the windows version a full execution is provided, just
      uncomment the last two commented lines. These are commented for any
      initial test of the configuration, as the full configuration can take
      many hours. 

## Eclipse Installation requirements
* Eclipse Oxigen (https://www.eclipse.org/downloads/packages/release/oxygen/3a/eclipse-modeling-tools)
    - Any Oxigen version is supported by the launch files, for other versions
      of Eclipse the launch files should be reconfigured by hand. We do not
      provide support for this, as a standalone version is provided

## How to use Eclipse to edit the diferent required models
* Follow requirements Installation procedures
* Place dependency plugins (`/eclipseEditorsWorkspace/ca.udem.iro.geodes.deploy/plugins`) in your eclipse dropin folder
* make a copy of the folder <EditorTemplate> and rename the base folder and the files in InModel from <EditorTemplate> to the name of your Modeling IDE
* open the newly created and renamed folder in Eclipse
* open and edit the files in InModel
* to generate run the comandline script with the name of the your Modeling IDE as specified in the standlalone procedure

## Example requirements
* Chrome browser or equivalent (Firefox, Internet Explorer ... ,
  are not supported by SCCD)
* Unicode fonts for best viewing (such as Segoe UI Symbol or similar)

## How to use the example DSM edtiors
* In `/Examples/<Example_Name>/OutModels/`
* Open `<Example_Name>.html` in a browser
    - For example names, GoL06, Music04 and PacMan05 can be selected

* Music04 - The following controls are provided as a toolbar :
  new model (resets the canvas), full note, half note, quarter note,
  eighth note, timed length.
  Select note length in toolbar. Use keys [Q,W,E,R,T,Y,U] as input.

* PacMan05 - The following controls are provided as a toolbar :
  new model (resets the canvas), pacman (can only be instantiated inside a
  grid node), ghost (can only be instantiated inside a grid node), food (can
  only be instantiated inside a grid node), grid node, score digit.
  Select language elements to instantiate, click on canvas or grid node to
  instantiate.
  Right click to view properties of element.
  Use [Esc] key to exit properties tab.
  Use [Del] to remove last selected instance.

* GoLToolbar - The following controls are provided as a toolbar :
  Run game of life, turn off light in arduino (arduino not provided)
  Click on the canvas to add a live cell to the model.
  Click on a live cell to remove that cell from the model.
  Click on run game button to simulate execution (as it is not connected to
  a model transformation back end it will not produce changes just simulate
  internal events as a conclusion of the "simulation")
	
## Development documentation
The file [documentation.md](documentation.md) has the detailed information of the architecture of the provided tools, a description of each file and their purpose in the overall tool.  
