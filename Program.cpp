/* Write a C++ Program to find the product of
two numbers entered by the User Your Output should look 
something like this Enter two numbers: 3.4 5.5 Product = 18.7 */

#include<iostream>
#include <stdio.h>
using namespace std;


int
main ()
{
  float a;
  float b;
  
  cout << "Enter the value of first number :  ";
  cin>>a;
  
  cout << "Enter the value of second number :  ";
  cin>>b;
  
  cout<<endl;
  
  cout<<"The product of "<<a<<" and "<<b<<" is : "<<a*b;
  return 0;
}
