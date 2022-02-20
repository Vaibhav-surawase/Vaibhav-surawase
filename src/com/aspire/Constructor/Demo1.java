package com.aspire.Constructor;

	public class Demo1  //defaultConstructor
{
	    int a;
	    int b;
	    int c;
	    float d;
		String StudentName; 
	    char e;
	                             //Default constructor which need not to write in class
	                             //It will be provided by JVM during program execution
	    Demo1()                  // constructor name=class name
	    {
	    	a=10;
	    	b=20;
	    	d=10.5f;
	    	e='A';
	    	StudentName="Vaibhav";
	    	
	    }
	  public void method()
	  {
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println(c);
	      System.out.println(d);
	      System.out.println(e);
	      System.out.println(StudentName);
	  }
	  public static void main(String[] args) 
	  {
		  Demo1 obj=new Demo1();
		  obj.method();
		  
		
	}
	}


