# run  %: . ./sng.sh file.exp.FileExplore2 /Users/antw/homeProject/cs2/FileExplore2/TestFolder

javac -d build/classes src/file/exp/*.java 
sleep 4
cd build/classes
java $1 $2
sleep 4

