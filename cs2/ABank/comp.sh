# Command Prompt % . ./comp.sh

clear

javac -d build/classes src/com/bank/*.java

cd build/classes

java com.bank.ABank 

cd ../../
