package com.practice.conditionalstatements;

public class Switchstatement2 
{
	// cash withdrawl =cw, mini statements=ms, mo banking registration=mb;balance check=bc
	public static void main(String[] args) 
	{
		String input="mb";
		switch(input)
		{
		case "cw":
		    System.out.println("Cash withdral");	
		    break;
			
		case "ms":
			System.out.println("mini statement");
			break;
		case "mb":
			System.out.println(" Mo banking Regs");
			break;
		case "bc":
		    System.out.println ("checking acc balance");
			
			
		}
	}

}
