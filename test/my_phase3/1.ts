var x;
x = function(x) {return this;};
x.a = 42;

print(42);

var F;
F = new x();
print(F.a);