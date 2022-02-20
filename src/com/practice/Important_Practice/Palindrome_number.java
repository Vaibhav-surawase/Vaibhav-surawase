package com.practice.Important_Practice;

import java.util.Scanner;

public class Palindrome_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);         //scanner class object
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int orginal_num=num;
		int rev=0;
				while(num!=0)
				{
					rev=rev*10+num%10;
					num=num/10;
				}
		if(orginal_num==rev)
		{
			System.out.println(orginal_num+" is palindrome number");
		}
		else
		{
			System.out.println(orginal_num+" is not apalindrome number");
		}	
			
	}   

}
