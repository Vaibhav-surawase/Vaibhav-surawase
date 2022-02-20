package com.oops.keyword.this_super;

public class parent
{
	int a=1000;     
	int b=2000;
	int i=3000;     //non static Global Variables
	
	public void m1()
	{
		int c=5; // non static Local variable
	
		System.out.println("Non Static Global variable from same class a="+this.a);
		System.out.println("Non Static Global variable from same class b="+this.b);
		System.out.println("Non Static Global variable from same class i="+this.i);
		System.out.println("Non Static Local variable from same class c="+c);
	}
	

}
