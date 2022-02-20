package com.aspire.dailymock;
import java.util.Scanner;
public class Palindroime_num {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num=");		
		int num=sc.nextInt();  //1234
		int Org_num=num;
		int rev=0;
		while(num!=0)
		{                 
			rev=rev*10+num%10; //4 43 4321
      		num=num/10;   //123 12 1
		}
		if(Org_num==rev)
		{
			System.out.println(Org_num+" is palindrome num");
		}
		else
		{
			System.out.println(Org_num+"  is not Palindrome ");
		}
	}

}
