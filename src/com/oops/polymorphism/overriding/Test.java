package com.oops.polymorphism.overriding;

public class Test 
{
	public static void main(String[] args)
	{
		Parent p= new Parent();
		System.out.println("**********This is from Parent class*****");
		p.bunglow();
		p.car();
		p.gold();
		p.land();
      
	    Child c =new Child();
	    System.out.println("**********this is from child class********");
	    c.bike();
	    c.bunglow();
	    c.car();
	    c.gold();
	    c.land();
	}

}
