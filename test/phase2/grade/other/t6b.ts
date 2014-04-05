
var i;
var j;

i = 1;
j = 1;

outer: while (1)
{
  print i;
  i = i + 1;
  if (i == 6) break outer;
}

