package com.oops.Casting;

public class ExplicitCasting  
// converting higher to lower data type=Explicit Casting
{
	public static void main(String[] args) 
	{
		double a=10.72463d;
		float b=23.237f;
		long c=12l;
		int d=21;
		short e=21;
		byte f=127;
		
		b=(float)a; //a is type cast to b
		d=(int)c;
		
		System.out.println(b);
		System.out.println(d);
		
	}

}
