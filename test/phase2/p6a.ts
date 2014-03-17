//print = function (x) { console.log(x); };

print(0);

var n;
var j;

n = 5;
j = 10;

x:while (n > 0)
{
  print(1999);
  print(n);
  while (j > 0)
  {
    print(n); print(j);
    if (n + j == 14)
    {
      j = 0;
      continue x;
    }
    j = j - 1;
  }
  print(1066);
  n = n - 1;
}

