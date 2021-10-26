cls

echo %JAVA_HOME%

if defined JAVA_HOME goto javadone
set JAVA_HOME=E:\Users\vsc\PhD\Projects\2019 User Study\Project\workspaceIDEgen\Java
set PATH=%PATH%;%JAVA_HOME%\bin
:javadone

if defined ANT_HOME goto antdone
set ANT_HOME=..\apache-ant-1.10.6
set PATH=%PATH%;%ANT_HOME%\bin
:antdone

set PROJECT=GoL06
@rem set PROJECT=GoL07
@rem set PROJECT=PacMan03
@rem set PROJECT=PacMan04
@rem set PROJECT=PacMan05
@rem set PROJECT=Music03
@rem set PROJECT=Music04

if ""%1""==""--Project"" (
    set PROJECT=%2
    shift
    shift
)

set my_ant_start=
:setupArgs
if ""%1""=="""" goto doneStart
set my_ant_start=%my_ant_start% %1
shift
goto setupArgs
:doneStart
rem ** Now we invoke ant **
ant -lib ..\Transformations -DprojectName=%PROJECT% -DprojectPoint=%PROJECT% %my_ant_start% && ..\Transformations\fnr.exe --cl --dir %PROJECT%\OutModels --fileMask "*.js" --find "and" --replace "&&"
