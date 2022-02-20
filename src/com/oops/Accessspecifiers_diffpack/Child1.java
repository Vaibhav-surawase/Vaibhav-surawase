package com.oops.Accessspecifiers_diffpack;
import com.oops.Accessspecifiers.Parent;
public class Child1 extends Parent
{ 
	public static void main(String[] args) {
		Child1 c=new Child1();
		c.m1();
		c.m3();
		// private and default methods are not available outside package
	}



}
