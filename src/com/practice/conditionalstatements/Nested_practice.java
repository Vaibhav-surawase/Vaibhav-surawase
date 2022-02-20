package com.practice.conditionalstatements;

public class Nested_practice 
{
	public static void main(String[] args) 
	{
		String Un="vaibhav";
		String pw="Abc@123";
	    if(Un=="vaibhav")
	    {
		  if(pw=="Abc@1234")
		  {
			  System.out.println("Password & Username enterd correct");
		  }
		  else 
		  {
			  System.out.println("You have Entered Wrong password ");
		  }
	    }
	    else
	    {
		   System.out.println("Enterd Username is wrong ");
	    }
		
	}

}
