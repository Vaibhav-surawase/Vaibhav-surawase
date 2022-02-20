package com.practice.conditionalstatements;

public class Nestedif2 
{
	public static void main(String[] args) 
	{
		String UN="Vaibhav";
		String PWD="Vai@123";
		
	 if(UN=="Vaibhav")
	 {
		 System.out.println("entered username is correct");
		
		 
		 if(PWD=="Vai@123")
		 {
			 System.out.println("entered Password is correct");
			 System.out.println("Login Successfully");
		 }
		 else
		 {
			 System.out.println("please enter correct password");
		 }
	 }
	 else
	 {
		 System.out.println("Please enter coorect username");
	 }
		
		
	}

}
