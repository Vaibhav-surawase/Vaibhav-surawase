package com.practice.logicalloops;

public class Dowhile2 
{
	public static void main(String[] args)
	{
		int marks=56;
		int passingmarks=40;
		do
		{
			if(marks>=passingmarks)
			{
				System.out.println("congratulations you are Pass");
			}
			else
			{
				System.out.println("your Marks are Less "+marks+" Next time You have to try better ");
			}
		}
		while(marks<passingmarks);
	
	}

}
