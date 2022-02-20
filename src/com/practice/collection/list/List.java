package com.practice.collection.list;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List 
{
	public static void main(String[] args) 
	{
/*	 ArrayList al = new ArrayList();
	 al.add("Vaibhav");
	 al.add(1, "SURAWASE");
	 al.add(40);
	 al.add(50.5f);
	 al.add("ATI PUNE");
	 al.add('A');

	 System.out.println(al);
	 System.out.println(al.contains('A'));
	 System.out.println(al.get(1));
	 System.out.println(al.indexOf(40));
	 System.out.println(al.lastIndexOf('A'));

	 for (Object a:al)
	 {
		 System.out.print(a+", ");
	 }
		System.out.println();
	 
	 for (int i=0; i<=al.size()-1; i++)
	 {
		 System.out.print(al.get(i)+", ");  // Remember
	 }
	 System.out.println();

     Iterator itr = al.iterator();
	 while (itr.hasNext())                     //Remember
	 {
		 System.out.print(itr.next()+", ");
	 }
	 System.out.println();
	 
	 ListIterator li=al.listIterator();
	while(li.hasNext())
	{
		System.out.print(li.next()+", ");
	}
	System.out.println("This is forward Direction");
	
	 ListIterator lir=al.listIterator(al.size());
	 while(lir.hasPrevious())
	 {
		 System.out.print(lir.previous()+", ");
	 }
	System.out.println("This is Backward Direction");
*/
		LinkedList ll=new LinkedList();
		ll.add("Vaibhav");
		ll.add(1233424836);
		ll.add("abc@gmail.com");
		ll.add('A');
		ll.add(98.5f);
		ll.add(null);
		ll.add(98.5f);
		ll.add(null);
		ll.add("Nagar");
		System.out.println(ll);                         //[Vaibhav, 1233424836, abc@gmail.com, A, 98.5, null, 98.5, null, Nagar]
		System.out.println(ll.size());                  //9
		System.out.println(ll.isEmpty());               //false
		System.out.println(ll.indexOf('A'));            //3
		System.out.println(ll.lastIndexOf(98.5f));      //6		
		ll.add(50);                                     // 50 num added
		System.out.println(ll);
	 	ll.remove(3);                                   // 3 rd index removed
	 	System.out.println(ll);
		ll.remove("abc@gmail.com");
		System.out.println(ll);
		ll.remove(98.5f);                               // this will hide 1st 98.5 value
		System.out.println(ll);
		ll.set(1, "Surawase");                          // replace to exsisting place
		System.out.println(ll);
	for(Object a1:ll)
	{
		System.out.print(a1+", ");
	}
	System.out.println();

	Iterator itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+", ");              // Forward direction
	}
	System.out.println();
	ListIterator lit=ll.listIterator(ll.size());
	while(lit.hasPrevious())
	{
		System.out.print(lit.previous()+", ");    //Reverse Direction by using ListIterator
	}
	System.out.println();
	
	
	
	
	}
	
}
