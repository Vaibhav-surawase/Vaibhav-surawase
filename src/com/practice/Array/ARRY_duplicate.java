package com.practice.Array;

public class ARRY_duplicate 
{
	public static void main(String[] args)
    {
		int []a= {1,2,3,4,5,6,7,8,2,3,4};
                                                       //	find duplicate num=??

        int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
					count++;
				}
			}
		
	    }
		   System.out.println();
           System.out.println(count);
}
}