package com.practice.Array;

public class M2array
{
	public static void main(String[] args) 
	{
	  int [][]a={{1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
//	   1 2 3
//	   4 5 6 7
//	   8 9 10 11
//	   12 13 14 15    row=4, column=3-4;
	  
     for(int i=0;i<4;i++)
     {
    	for(int j=0; j<a[i].length;j++)
    	{
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
     }
  System.out.println();		
  System.out.println(a[0].length);
	}
 
}
