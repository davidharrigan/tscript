#!/bin/bash

#
# tar up the Tscript files
#
# it places the created tar file in the directory that contains the
# tscript directory (the root of the distribution)
#
# this script needs to be run from the directory where it is stored,
# which is tscript/bin
#

cd ../..
tar cvf tscript.tar ./tscript/bin ./tscript/README ./tscript/scripts ./tscript/src ./tscript/test

cd tscript/bin
