#!/bin/bash

#
# build the Tscript system
#
# this script needs to be run from the directory where it is stored,
# which is tscript/bin
#

# first make sure the generated parser is up to date
cd ..
cd src/ts/parse
make --silent
cd ../../..

# now compile the system

javac -g -cp src:build/lib/antlr.jar -d build/packages -Xlint:unchecked src/ts/Main.java

# now run javadoc
javadoc -classpath build/packages:build/lib/antlr.jar -d build/html -use -package -quiet -doctitle "ts" src/ts/*.java src/ts/parse/*.java src/ts/support/*.java src/ts/tree/*.java src/ts/tree/visit/*.java

cd bin
