package com.practice.logicalPrograms;

public class Star4 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{	
			 for(int k=4;k>i;k--)             //let k = space
			{
				System.out.print(" ");
			}
		
			for( int j=1;j<=i;j++ )
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
		
		
	     for(int i=5; i>=0; i--)
	     {	
		 for(int k=0;k<i;k++)
		 {
			System.out.print(" ");
		 }
	
		 for( int j=5;j>=i;j-- )
		 {
			System.out.print("*"+" ");
			
		}
		System.out.println();
}}
}
/*

*
**
***
****
*****















*/