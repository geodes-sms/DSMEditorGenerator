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
This repository contains the source code of the DSM editor generator. It also
contains examples of editors that are output by the tool along with all the
required models. Finally, it contains the data set and results of a
performance evaluation of the generator. The provided code, examples and
tests can be used as a standalone or in eclipse

* As a standalone version is provided, the eclipse version is only provided
  for legacy reason as it was the actual version used.

## Structure of the repository
* apache-ant-1.10.6 (windows Apache Ant dependencies for the standalone
  execution)
* Eclipse (files to run in eclipse)
    - dropins (plugins to be installed in eclipse)
    - workspace (workspace projects to be imported)
* Examples (examples configured for the standalone execution)
* Models (meta-model dependencies for the standalone execution)
* Performance_test (tests configured for standalone execution and the results
  used in the article)
* PortablePython27 (portable version of python2.7 with SCCD dependencies
  installed)
* Transformations (source code of the DSM editor generator)


## Standalone Installation requirements (Windows)
* Java 1.8 or greater installed
* Chrome browser or equivalent (Firefox, Internet Explorer ... ,
  are not supported by SCCD)
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
* Epsilon plug-in version 1.4 or greater (available in eclipse marketplace)
* Python 2.7 (https://www.python.org/download/releases/2.7/)
* SCCD 0.9 (https://msdl.uantwerpen.be/git/simon/SCCD/src/master)
* Chrome browser or equivalent (Firefox, Internet Explorer ... ,
  are not supported by SCCD)

## How to use the DSM editor generator in Eclipse
* Follow requirements Installation procedures
* Place dependency plugins (`/Eclipse/dropins`) in your eclipse dropin folder
* Import transformation2scd project into your workspace
    - Eclpise may say that 'src' folder is missing, as it may set it as a
      java using project. It is not the case so no 'src' files are actualy
      required. This error can be ignored.
* Import examples (`/Eclipse/workspace`) into workspace
* Inside `/Test <Example_Name>/` run `<Example_Name>Run.launch`
    - For example names, GoL06, Music04 and PacMan05 can be selected
* Find and replace in `/Test <Example_Name>/OutModels/<Example_Name>.js` all
  instances of `and` for `&&`
* Open `/Test <Example_Name>/OutModels/<Example_Name>.html` in a browser

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

* GoL06 - The following controls are provided as a toolbar :
  Run game of life, turn off light in arduino (arduino not provided)
  Click on the canvas to add a live cell to the model.
  Click on a live cell to remove that cell from the model.
  Click on run game button to simulate execution (as it is not connected to
  a model transformation back end it will not produce changes just simulate
  internal events as a conclusion of the "simulation")

## Performance test results

* Results_data is the actual data used in the article, where all values are the
      average of 10 runs of that same test.
    - Test Seed  - separates the different tests along with the number of rules
    - Number of rules - rules present in the test
    - Number of alpha nodes - alpha nodes present on the generated RETE network
    - Generate Initial Statechart Time - time in ms of generating initial
      statechart from the layout model
    - Generate Initial Statechart Memory - memory in MB of generating initial
      statechart from the layout model
    - RETE Setup Time - portion of time in ms of the refinement process
      dedicated to creating the RETE network
    - Refine Satechart Time - total time in ms to refine the statechart with
      the provided interactions
    - Refine Satechart Memory - total memory in MB to refine the statechart
      with the provided interactions
    - Serialize Statechart Time - time in ms to serialize the generated
      statechart into a format compilable by SCCD
    - Serialize Statechart Memory - memory in MB to serialize the generated
      statechart into a format compilable by SCCD
    - Number of States - number of states in the generated statechart
    - Number of transitions - number of transitions in the generated statechart
    - Configuration History Size - number of state configurations evaluated by
      the RETE network during the refinement process
    - Number of rule applications - total number of times some rule was
      applied during the refinement process

* Tests/Results is the collection of results of the standalone execution as
  a CSV in the following order
    - identification of the test
    - time in ms of generating the initial statechart from the layout model
    - time in ms to refine the statechart with the provided interactions
    - time in ms of applying a corrective transformation on the statechart
      (as SCCD does not correctly support transitions from an outer state to
      its inner states this transition is converted to all equivalent
      inner to inner state combinations. As this was both very small and
      outside of the scope of the presented work, but rather a platform
      specific step, it was ignored )
    - time in ms to convert the format of the statechart into a compilable
      statechart
    - full time in ms of the test execution

* Memory values where manually collected
* RETE Setup Time is collected by running the tests with a version that
  halts right after the RETE network is finished
