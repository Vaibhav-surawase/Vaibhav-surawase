package com.oops.Generalization;

public class Vi implements I1
{
	 public void data()
	    {
	    	System.out.println("1.5 gb per day");
	    }
		public void audiocalling()
		{
			System.out.println("UL audiocalling");
		}
		public void validity()
		{
			System.out.println("24 days");
		}
		public static void sms()
		{
			System.out.println("100 sms per day");
		}

		public static void main(String[] args)
		{
			Vi.sms();  //Classname.methodname(); we can call directly to static method 
			
			jio j=new jio();
			j.audiocalling();
			j.data();
			j.validity();
			
			System.out.println();
			
			Vi v=new Vi();
			v.audiocalling();
			v.data();
			v.validity();
		}
}
