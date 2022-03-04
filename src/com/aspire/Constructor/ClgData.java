package com.aspire.Constructor;
public class ClgData 
{
	 String Name;             //non-Static method
	 int Rollnum;
	 static String Clgname;   //Static method
	 static String principal;
	 
	 public ClgData(String string, int i, String string2, String string3) 
	 {
      this.Name=Name;
      this.Rollnum=Rollnum;
	 }

	public void clginfo()
	 {
		 System.out.println(Name);
		 System.out.println(Rollnum);
		 System.out.println(Clgname);
		 System.out.println(principal);		
	 }
}	 
    
	

