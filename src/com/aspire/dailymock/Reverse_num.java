package com.aspire.dailymock;
import java.util.Scanner;
public class Reverse_num {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
		int num=1234;  //4321
		int rev=0;
		for(;num!=0;)
		{                
			rev=rev*10+num%10; 
			num=num/10;			
		}
		System.out.println(rev);
		
		
		
		
		
		
		
//		while(num!=0)
//		{                
//			rev=rev*10+num%10; 
//			num=num/10;			
//		}
//		System.out.println(rev);
		
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(num);
//		StringBuilder rev1=sbl.reverse();
//		System.out.println("rev="+rev1);
		
		
		
		
	}
}
