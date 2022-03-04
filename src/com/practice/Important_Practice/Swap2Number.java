package com.practice.Important_Practice;

public class Swap2Number 
{
	
	public static void main(String[] args) 
	{
		int a=10, b=20;
		int c;
		System.out.println("Before Swaping numbers="+a+"  "+b);
//		int t=a;
//		a=b;                     //20
//		b=t;                     //10
//		System.out.println("After Swaping numbers= "+a+" "+b);
//		
		System.out.println();
//		2nd Approach
		c=a*b;                 //200 
		a=c/a;                 //10
		b=c/b;		
		System.out.println("After Swaping numbers= "+a+"  "+b);
	}
	
	

}
