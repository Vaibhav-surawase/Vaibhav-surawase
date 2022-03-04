package com.practice.logicalPrograms;

public class NumDiv8and9
{
	/*
	 * 
	   public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i%8==0)
			{
				System.out.println(i);
			}
			System.out.println(i);
			
		}
	}

}
*/
	
public static void main(String[] args) 
{
	int[][] g= {{0,1,5,2},{3,4,6,7},{8,9,10,11},{12,12,14,15}};  //4X4 equal column
	int[][] a= {{0,1,2},{3,4,5,6,7},{8,9,10,11},{12,12,14,15}};  //4X unequal column
	
	int[][] f= new int[2][3];
	f[0][0]=0;
	f[0][1]=1;
	f[0][2]=2;
	            //f[0][3]=3;        // Extra
	            //f[0][4]=4;        // Extra
	f[1][0]=5;
	f[1][1]=6;
	f[1][2]=7;
	
//    System.out.println("a[]=");
 
	//  for 4X4 equal column
 
	System.out.println("g[i][j]=");
	for(int i=0; i<4; i++)
  {
  
  for(int j=0; j<4; j++)
  {
	  System.out.print(g[i][j]+" ");
  }
    System.out.println(" ");
}
 
//4X unequal column
  System.out.println("a[i][j]=");
  for(int i=0; i<4; i++)
  {
  
  for(int j=0; j<a[i].length; j++)
  {
	  System.out.print(a[i][j]+" ");
  }
    System.out.println(" ");
}
}
}
