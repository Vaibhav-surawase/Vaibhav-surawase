package com.oops.polymorphism.overloading;

public class Overloading
{
  int a=10;
  public void addition()
  {
	  int b=10;
	  int c=a+b;
	  System.out.println(c);
  }
  public void addition(int d)
  {
	  int e=a+d;
	  System.out.println(e);
  }
  public void addition(int d, int c)
  {
	  int f=d+c;
	  System.out.println(f);
  }
}
