package com.oops.Abstractclass;

public class Concreteclass extends Abstractclass
{
	int a=20, b=10;
    public void subtraction()
	{
		System.out.println("a-b="+(a-b));
	}
    public void multiplication()
	{
		System.out.println("axb="+(a*b));	
	}
    public void division()
	{
    	float c=20f, d=10f;
		System.out.println("a/b="+(c/d));		
	}
    public static void main(String[] args)
    {
    Concreteclass cc=new Concreteclass();
        cc.addition();
        cc.division();
        cc.multiplication();
        cc.subtraction();
    }
}
