package com.aspire.Constructor;
public class NewClass 
{
	int a;
	String s;

//	NewClass()
//	{
//		 a=10;
//		 s="Vaibhav";
//	}
	public void m1()
	{
		System.out.println(a);
		System.out.println(s);
	}
	public static void main(String[] args) {
    NewClass o = new NewClass();	
    o.m1();
	}
}

