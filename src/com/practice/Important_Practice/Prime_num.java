package com.practice.Important_Practice;
public class Prime_num 
//2 3 5 7 11 17 19  prime num
//1 4 6 8 9 non prime num
{ 
	public static void main(String[] args) 
	{
		int num=13;
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

}
