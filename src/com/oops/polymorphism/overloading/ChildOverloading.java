package com.oops.polymorphism.overloading;

public class ChildOverloading extends Overloading
{
	public void addition(int h, float i)
	  {
		 double j=h+i;
		  System.out.println(j);
	  }
 public static void main(String[] args) 
 {
	System.out.println("******Parent********");
	
		 Overloading ov=new Overloading();
		 
		 ov.addition();
		 ov.addition(10);
		 ov.addition(20, 30);
		 
    System.out.println("******Child********");
         
        ChildOverloading col=new ChildOverloading();
        col.addition();
        col.addition(20);
        col.addition(10, 20);
        col.addition(10, 12.50f);
 }
}



