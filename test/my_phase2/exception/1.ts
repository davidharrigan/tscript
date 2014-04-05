var o = 42;

try {
	throw o;
} catch (e) {
	print o;
}

o = "throw";
var x = 42;
try {
	throw o;
}
catch (e) {
	print x;
}

o = "throw";
var x = 42;
try {
	throw o;
}
finally {
    
}
