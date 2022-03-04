package com.practice.Methods;

public class ReturnMethod
{
    public static void main(String[] args)
    {

        ReturnMethod.method1();
    }
    public static int method1()
    {
      int a = 10;
      int b = 5;

      int c=a+b;
      System.out.println("c="+c);
      return c;


    }

}
