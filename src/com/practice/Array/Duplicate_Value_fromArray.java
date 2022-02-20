package com.practice.Array;

public class Duplicate_Value_fromArray 
{
	public static void main(String[] args) 
	{
		int[] a= {1,3,45,5,68,65,55,34,5,5,78,9};   //duplicate=repeated no=5,45 count(5)=3nos,45=2nos
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Number= "+a[i]);
			     	count++;
				}
			}
		}
		System.out.println("Count="+count);
	}

}
