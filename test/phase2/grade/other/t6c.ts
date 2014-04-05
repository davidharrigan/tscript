

var i;
var j;

i = 1;
j = 1;

outer: while (1)
{
  if (i == 6) break;
  print i;
  i = i + 1;
  if (i > 1) continue outer;
  print 43;
}

