package com.practice.Important_Practice;
public class Even_odd {
public static void main(String[] args) {
	int num=12345;
	int oddc=0;
	int ecount=0;
	while(num>0)
	{   
		int rem=num%10;
		if(rem%2==0)
		{
			ecount++;
		}
		else
		{
			oddc++;
		}
		num=num/10;
	}
	System.out.println(ecount);
	System.out.println(oddc);
}
}
