
var i;
var j;

i = 1;
j = 1;

outer: while (1)
{
  print i;
  while (1)
  {
    print i + j;
    break outer;
    print 42;
  }
  print 42;
}
print 3;
print 4;
print 5;

