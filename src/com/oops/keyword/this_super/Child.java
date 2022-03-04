package com.oops.keyword.this_super;

public class Child extends parent
{
	int a=100;
    public void m2()
    {
	 int k=20;
	  
	 System.out.println(k);
	 System.out.println(this.a);

	 System.out.println(super.a);
	 System.out.println(super.b);
	 
    }
    public static void main(String[] args)
    {
    	Child c=new Child();
    	c.m1();
    	c.m2();
		
	}

}