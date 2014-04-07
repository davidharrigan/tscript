//print = function (x) { console.log(x); };
//var testThis = function() { this.xyz = 42; return this; };
//testThis.prototype = 42();
//testThis.prototype.printXYZ = function () { print(this.xyz); };
//F = function() { return this; }
F = 42;

this.x = 42;

print (this.x);

x = new testThis();
x.printXYZ();

x = new F();
x.f = testThis;
x.f();
print (x.xyz);

x = testThis();
x.a = 22;
print this.a;