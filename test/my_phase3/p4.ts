var x;

if (isNaN(x))
{
  print (43);
}

x = x + NaN;

if (isFinite(x))
{
  print (42);
}
