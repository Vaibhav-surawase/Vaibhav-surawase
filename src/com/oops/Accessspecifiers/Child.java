package com.oops.Accessspecifiers;

public class Child extends Parent
{
	public static void main(String[] args)
    { 
		Parent p=new Parent();
        p.m1();
        p.m2();
        p.m3();
  //    p.m4();  ---> private method not available outside class
		
		
    }
}
