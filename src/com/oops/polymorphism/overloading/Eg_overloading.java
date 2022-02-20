package com.oops.polymorphism.overloading;

public class Eg_overloading
{ 
 //Method name is Same,arguments diff, data types also diff, order of argu diff
	public void payment ()
	{
		System.out.println("payment option on any ecommerce website: ");
	}
	public void payment (String COD)
	{
		System.out.println("payment option: Cash on delivery");
	}
	public void payment (String nb, int a)
	{
		System.out.println("payment option: Net banking");
	}
	public void payment (int b, String upi)
	{
		System.out.println("payment option: upi");
	}
	
	public static void main(String[] args)
	{
		Eg_overloading ov=new Eg_overloading();
		ov.payment();
		ov.payment("CON");
		ov.payment(2,"nb");
		ov.payment("UPI", 3);
	}
}
