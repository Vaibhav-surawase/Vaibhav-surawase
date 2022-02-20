package com.practice.collection.list;

import java.util.Collection;
import java.util.HashSet;

import java.util.LinkedHashSet;

public class Set {
	public static void main(String[] args) {
		int a[]= {1,12,3,4,41,5,6,4};
		String n[]= {"vaibhav", "surawase", "dhananjay", "avi", "sagar", "vedant"};
		HashSet hs=new HashSet();
		for(int i=0;i<a.length-1;i++)
		{
			hs.add(a[i]);
		}
		for(Object b:n)
		{
			hs.add(b);
		}
		System.out.print(hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		for(int b:a)
		{
			lhs.add(b);
		}
		for(int i=0;i<a.length-1;i++)
		{
			lhs.add(n[i]);
		}
		System.out.print(lhs);
		System.out.println();
	}

}
