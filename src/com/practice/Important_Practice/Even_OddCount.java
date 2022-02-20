package com.practice.Important_Practice;
public class Even_OddCount 
{
	public static void main(String[] args) 
	{
		int num=12345;
		int even_count=0;
		int odd_count=0;
		while(num>0)          //once try with for loop
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("No Of Even Count="+even_count);
		System.out.println("No Of Odd Count="+odd_count);
	}

}
