package com.practice.logical_new;

public class Star2 
{
	public static void main(String[] args)
	{
//		1 2 3 4 5
//		6 7 8 8 9
//		10 11 12 13 14
//		15 16 17 18 19
		
//		1 2 3 4 
//		5 6 7 8 
//		9 10 11 12 
//		13 14 15 16 
//		17 18 19 20 

		for(int i=1;i<=5; i++)
		{
			for(int j=1;j<=4; j++)
			{
				System.out.print((i-1)*4+j+" ");
			}
			System.out.println();
		}
		
	}

}
