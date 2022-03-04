package com.aspire.Constructor;

public class Stud_1 
{
	String Name;
	int Rollnum;
	
	public Stud_1(String Name, int Rollnum)
	{
	  this.Name=Name;
	  this.Rollnum=Rollnum;
	}
	public void method1()
	{
		System.out.println("Student Name= "+Name);
		System.out.println("Student Roll Number= "+Rollnum);
	}
//	public static void main(String[] args)
//	{
//		Stud_1 m=new Stud_1("Vaibhav",101);
//		m.method1();
//		
//		Stud_1 m1=new Stud_1("Avinash",102);
//		m1.method1();
//		
//		Stud_1 m11=new Stud_1("Sagar",103);
//		m11.method1();
//		
//		Stud_1 m111=new Stud_1("Dhananjay",102);
//		m111.method1();
//	}

}
