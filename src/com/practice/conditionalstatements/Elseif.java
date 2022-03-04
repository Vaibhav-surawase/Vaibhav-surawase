package com.practice.conditionalstatements;

public class Elseif
{
	public static void main(String[] args)
	{
		float marks=80.26f;
		float passmark=40f;
		
	
	    if(marks>75)
		{
			System.out.println("Result : Pass with First class Dist");
		}
		else if(marks>60)
		{
			System.out.println("Result : Pass with First class");
		}
		else if(marks>55)
		{
			System.out.println("Result: Pass with Higher second class");
		}
		else if(marks>passmark)
		{
			System.out.println("Result: pass");
		}
		else 
		{
			System.out.println(" Result : failed");
		}
		
	}

}
