package com.aspire.dailymock;
public class Swapping_1 {
	public static void main(String[] args)
	{
		int a=10, b=20;
		System.out.println("intially= "+a+"  "+b);
//		int c=a; //10
//		a=b; //20
//		b=c;  //10
//		System.out.println("Fianlly= "+a+" "+b);
	
		int c=a*b;        //200
		a= c/a;          //20
		b= c/b;		
		System.out.println("Fianlly= "+a+" "+b);
	}

}
