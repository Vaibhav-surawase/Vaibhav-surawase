package com.practice.Important_Practice;

public class Primenum
{
	public static void main(String[] args) 
	{
		int num=4;

		if(num==1 || num==2)
		{
			System.out.println(" num is not prime num");
		}
		
		else
		{
			
			int count=0;
			for(int i=2; i<=(num/2); i++)
			{
				if(num%i==0)
				{
					System.out.println("num is not prime num");
				 count=1;
				break;	
				}
			}
			if(count==1)
			{
				System.out.println("num is prime num");
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
