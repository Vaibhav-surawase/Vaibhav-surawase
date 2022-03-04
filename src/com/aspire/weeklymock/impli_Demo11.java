package com.aspire.weeklymock;

public class impli_Demo11 implements Demo11
{
	public void method1()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	 public void method2() 
	 {
		 int a=10;
		 int b=20;
		 System.out.println(a+b); 
	 }
public static void main(String[] args) 
{
	impli_Demo11 o=new impli_Demo11();
	o.method1();
	
}

}
