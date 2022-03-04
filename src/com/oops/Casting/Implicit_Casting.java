package com.oops.Casting;

public class Implicit_Casting 
{
	public static void main(String[] args) 
	{
		short a =10;
		byte b=20;
		int c=30;
		long d=40;
		
		c=(int)a;   // short to int -->lower to higher DT ie.Implicit casting
	
		System.out.println(c);
		
	}

}
