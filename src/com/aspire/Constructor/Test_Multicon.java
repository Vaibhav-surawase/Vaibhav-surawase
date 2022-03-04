package com.aspire.Constructor;

public class Test_Multicon 
{
	public static void main(String[] args) 
	{
		Multicon m=new Multicon();
		m.Addition();
		m.Subtraction();
		
		Multicon m1=new Multicon(10,20);
		m1.Addition();
		m1.Subtraction();
		
		Multicon m11=new Multicon(10,20,30);
		m11.Addition();
		m11.Subtraction();
	}

}
