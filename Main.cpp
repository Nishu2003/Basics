
  /*    Write a C++ Program to Find Size of int, float, double and char in 
  Your System Your output should look something like this
  Size of char: 1 byte Size of int: 4 bytes Size of float: 4 bytes Size of double: 8 bytes   */

#include<iostream>
#include <stdio.h>
using namespace std;


int
main ()
{
  int a;
  float b;
  double c;
  char d;
  cout << "Size of int is    : " << sizeof (a) <<"  byte"<< endl;
  cout << "Size of float is  : " << sizeof (b)<<"  byte"<< endl;
  cout << "Size of double is : " << sizeof (c)<<"  byte"<< endl;
  cout << "Size of char is   : " << sizeof (d)<<"  byte"<< endl;
  return 0;
}
