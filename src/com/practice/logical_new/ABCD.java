package com.practice.logical_new;
public class ABCD 
{
//	A B C D E
//	A B C D E
//	A B C D E
//	A B C D E
//	A B C D E
 public static void main(String[] args)
 {
	 for (char i='A';i<='E'; i++)
	 {
		 for (char j='A';j<=i; j++)
		 {
			 System.out.print(j+" ");
		 }
		 System.out.print("\n");
	 }
	
}
}
