# DSMEditorGenerator
In model-driven engineering (MDE), it is customary to generate editors for domain-specific languages (DSL).
This software allows users to customize the interaction with generated domain-specific modeling (DSM) editors.
The goal of this tool is to introduce user experience (UX) practices in the development of DSM editors.
The user has to define the DSL metamodel and concrete syntax, but also three additional models: the interface model, the interaction model, and the event mapping model.
All models are defined in the Eclipse Modeling Framework (EMF) as Ecore models.
It is assumed that the concrete syntax is graphical only, thus models are manipulated in a canvas.

* DSL metamodel: a class diagram showing the concepts, their properties, and their relations in the domain. For example, if the DSL is to construct family trees, the metamodel would consists of Person with a Name and Genre and Children associations to other Person.
* DSL graphical concrete syntax: assigns visualizations to each element of the metamodel. In the family tree example, a Person is rendered by an icon showing a male or female depending on the genre and a label below it to display his name. The children relation is represented as an arrow from a parent to a child.
* Interface model: defines the elements of the GUI and their layout. For the family tree example, we can have two layers. A canvas holds the model in concrete syntax. A toolbar has two buttons to create a male and female person.
* Interaction model: defines the behavior of the editor. It consists of cause-effect rules where, if a condition on the GUI is true and an specific event happens, then the effect will modify the GUI accordingly. For example, if the user selects the male button and clicks on the canvas, it creates an instance of a Person at that location. Another rule can be if the user right clicks on a person P, drags the cursor to another person C and releases the mouse, it creates a parent relation from P to C.
* Event mapping model: maps I/O events to a specific platform and implementation. For example we map the "select" event defined in the rules to a left mouse click. We can also map it to other interaction streams, like an Arduino board.


## Contents
This repository contains the source code of the DSM editor generator. It also contains examples of editors that are output by the tool along with all the required models. Finally, it also contains the data set and results of a performance evaluation of the generator.
