package com.practice.Important_Practice;

import java.util.Scanner;

public class Print_primeNum 
{

//		 print the prime number from 1 to 100
//		 prime num--> 2, 3, 5, 7, 11, 13, 17, 19, 23
//		 non prime --> 0, 1, 4, 6, 8, 9, 10
		
		public static void  main(String[] args) 
		{
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			int count=0;
			if(num>1)
			{
				for (int i=2; i<=num; i++)
				{
					if(num%i==0);
					count++;
				}
				if (count==2)  // 1 itself, 1  FOR DIVISIBLE BY 1
				{
					System.out.println(num+" is a prime num ");
				}
				else
				{
					System.out.println(num+" is not a prime num ");
				}
			}
			else
			{
				System.out.println(num+" is not a prime num ");
			}
			
		
		}

	
	/* int num=13;
	int count=0;

	if(num>1)
	{
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
				count++;              //   divisible by 1 and  itself
		}
		if(count==2)
		{
			System.out.println(num +" is prime number");
		}
		else
		{
			System.out.println(num +" is non prime num"); 
		}
		
	}
	else
	{
		System.out.println(num +" is non prime num");
	}
		

	}
	*/
}

	

