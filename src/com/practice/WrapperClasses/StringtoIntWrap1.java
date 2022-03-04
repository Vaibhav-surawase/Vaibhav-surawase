package com.practice.WrapperClasses;

public class StringtoIntWrap1 {
	public static void main(String[] args) {
		String s1="12345";  
//		String s1="Vai12345";     //java.lang.NumberFormatException: For input string: "Vai12345"
		Integer a=new Integer(s1);
		System.out.println(a);
		
		
	}

}
