package com.practice.Important_Practice;
public class CountNoOfDigits
{
	public static void main(String[] args)
	{
		int num=123654;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
	
		System.out.println();
			System.out.println("Count="+count);
	}
	

}
