package com.practice.Array;

public class Avg_value_array {
	public static void main(String[] args) 
	{
		int[] a= {1,3,45,5,68,65,55,34,5,5,78,9};
		int sum=0;
		int avg;	
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];		
		}
		System.out.println("sum="+sum);   //373
		avg=sum/a.length;
		System.out.println("Avg="+avg);    //31
	}

}
