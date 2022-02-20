package com.practice.Important_Practice;

import java.util.Scanner;

public class Palindrome_string 
{
	public static void main(String[] args) 
	{   Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String= ");
	    String s=sc.next();
		//String s="ABCD";
		String org=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(org.equalsIgnoreCase(rev))                                              //querry
//		if(org==rev)
		{
			System.out.print(org+" is a Palindrome String");
		}
		else
		{
			System.out.print(org+" is not palindrone String");
		}
	}

}
