package com.oops.Abstractclass;

public abstract class Abstractclass 
{
	int a=20;
	int b=12;
	public void addition()	   //complete/concrete method
	{
		int add;
		add=a+b;
		System.out.println("Add="+add);
	}
	abstract public void subtraction();		//incomplete/abstract method
	abstract public void multiplication();
	abstract public void division();

}
