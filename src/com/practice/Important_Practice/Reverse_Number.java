package com.practice.Important_Practice;

import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String[] args) 
	{
		//v		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=1234;
//		int num=sc.nextInt();          //1 2 3 4-----> 4 3 2 1 
		// 1. Algorithm approach
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;  //4     43  432  4320 4321
			num=num/10;          //123 12    1   1
		}
		System.out.print("Reverse number is: "+rev);
		
		// 2 nd approach
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		sbl.reverse();
	//	System.out.print("Reverse number is: "+rev);
	}

}
