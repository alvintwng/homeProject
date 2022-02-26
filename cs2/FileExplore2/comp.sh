#  run in command prompt %: bash comp.sh

clear

javac -d build/classes src/file/exp/*.java 
sleep 4
cd build/classes

java file.exp.FileExplore2 /Users/antw/homeProject/cs2/FileExplore2/TestFolder
sleep 4
