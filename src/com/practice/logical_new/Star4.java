package com.practice.logical_new;
public class Star4 
{
//	0 1 0 1 0 1 0
//	0 1 0 1 0 1 0
//	0 1 0 1 0 1 0
//	0 1 0 1 0 1 0
//	0 1 0 1 0 1 0
	public static void main(String[] args) 
	{
		for( int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
			   System.out.print((i+j)%2+" ");  //Remember this
			}
			System.out.println();
		}		
	}
}
//1 1 1 1 1 
//0 0 0 0 0 
//1 1 1 1 1 
//0 0 0 0 0 
//1 1 1 1 1 
