package com.practice.logical_practice;

public class Star 
{
	public static void main(String[] args)
	{
//	  	 *
//		* *
//	   * * *
//	  * * * *    row =4, spaces=3-1 column= i
	 for(int r=1; r<=5;r++)
	 {
		 for (int s=4; s>=r; s--)
		 {
			 System.out.print(" ");
		 }
		 for (int st=1; st<=r; st++)
		 {
			 System.out.print("*"+" ");
		 }
		 
	     System.out.println();
	 }
	 
	 for (int r1=1; r1<=4; r1++)
	 {
		 for (int s=1; s<=r1 ; s++)
		 {
			 System.out.print(" ");
		 }
		 for (int st=4; st>=r1; st--)
		 {
			 System.out.print("*"+" ");
		 }  
		 System.out.println();
	 }
		
		
		
		
	 
		
	}

}
