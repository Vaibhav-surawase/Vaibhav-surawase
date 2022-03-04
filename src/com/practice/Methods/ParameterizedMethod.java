package com.practice.Methods;


import java.util.Scanner;

public class ParameterizedMethod
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ParameterizedMethod a=new ParameterizedMethod();
        a.addition(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
    public int addition(int a, int b, int c)
    {
        int d = a + b + c;
        System.out.println(d);
        return d;
    }
}
