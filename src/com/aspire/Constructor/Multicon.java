package com.aspire.Constructor;

public class Multicon
{
	   int a;
	   int b;
	   
  public Multicon()
  {
	    a=10;
	    b=20;	     
  }
  public Multicon(int c, int d)
  {
	  a=c;
	  b=d;
  }
  public Multicon(int e, int f, int g)
  {
	  a=e+f;            //30
	  b=f-g;            //-10       
  }
  public void Addition()
  {
	  System.out.println("a+b= "+(a+b));
  }
  public void Subtraction()
  {
	  System.out.println("a-b= "+(a-b));
  }
  
  
}
