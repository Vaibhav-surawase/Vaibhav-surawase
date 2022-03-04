package com.practice.Important_Practice;

import java.util.Scanner;

public class pali_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
    	String num="AFBA";
		String rev=" ";
		String o_num=num;
		for (int i=num.length()-1;i>=0; i--)
		{
			rev=rev+num.charAt(i);
			
		}
		if(rev.equals(o_num))
		{
			System.out.println(rev+" is  palindrome string");
		}
		else
		{
			System.out.println(rev+" is not palindrome string");
		}
		
	}

}
