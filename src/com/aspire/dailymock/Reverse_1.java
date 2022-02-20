package com.aspire.dailymock;

public class Reverse_1
{
	public static void main(String[] args) 
	{
		String Name="ABCD";
	    String rev=" ";
	    for(int i=Name.length()-1;i>=0;i--)
	    {
	    	rev=rev+Name.charAt(i);
	    }
		System.out.println(rev);
	}

}
