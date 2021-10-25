#!/bin/bash
clear
PROJECT=GoLSingle

if [ "$1" = "--help" ]
then
	echo "To compile a modeling editor use"
	echo ""
	echo "./RunAnt.sh [Options] [Project name] [Compilation arguments]]"
	echo ""
	echo "Options - if no options are provided the execution will run by default on"
	echo "  on project $PROJECT"
	echo ""
	echo "  --Project  - to compile a specific project"
	echo "  --help     - for this help instructions"
	echo ""
	echo "Project name - is the name of the folder and files of the project being "
	echo "  compiled (e.g. MindMap)"
	echo ""
	echo "Compilation arguments - are arguments passed to select individual steps of"
	echo "  compilation or to clean the generated files in the project. If no"
	echo "  arguments are passed the execution will run with the default argument of "
	echo "  compile these arguments can be:"
	echo ""
	echo "  generateHTMLinterface - to only generate the interface html file"
	echo ""
	echo "  generateSccd          - to only generate the SCCD statechart"
	echo ""
	echo "  compile               - to fully generate and compile modeling environment"
	echo ""
	echo "  statistics            - to fully generate and compile modeling environment"
	echo "                          outputing execution times"
	echo ""
	echo "  genInteractionXMI     - to process the textual interaction file to the"
	echo "                          format used in the generation process"
	echo ""
	echo "  genMapping            - to process the textual mapping file to the format"
	echo "                          used in the generation process"
	echo ""
	echo "  clean                 - to delete all generated output files"
	echo ""
	echo "  nuke                  - to delete all generated files"
	echo ""
else

if [ "$1" = "--Project" ]
then
    PROJECT=$2
    shift
    shift
fi

ant -lib ../Transformations -DprojectName=$PROJECT -DprojectPoint=$PROJECT "$@"
wait
sed -i 's/and/\&\&/g' $PROJECT/OutModels/$PROJECT.js

fi