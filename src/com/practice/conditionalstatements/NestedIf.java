package com.practice.conditionalstatements;

public class NestedIf 
{
	public static void main(String[] args)
	{
		int age=40;
		String Gender="male";
		if(age>=18)
		{
			if(Gender=="male" && age<30)
			{
				System.out.println("valid for apply Govt Job");
				System.out.println("but can be voter");
			}
			else
			{
				System.out.println("candidate  not able to apply for govt job");
				System.out.println("but can be voter");
			}
		}
		else
		{
			System.out.println("Not a valid age for Voter");
		}
	}

}