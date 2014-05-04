var x = function(a, b) {
    this.a = a;
    this.b = b;
    return this;
};

var F = new x(1,2);
var S = new x(3,4);
print F.a;
print F.b;
print S.a;
print S.b;
print F.a;
print F.b;
