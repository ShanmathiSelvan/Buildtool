package com.maven1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashSet <Integer> hs = new HashSet<>();
	hs.add(12);
	hs.add(1);
	hs.add(null);
	hs.add(3);
	hs.add(1);
	System.out.println(hs);
	
	ArrayList <Integer> ar = new ArrayList<>();
	ar.addAll(hs);
	System.out.println(ar);
	
	LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	lhs.add(23);
	lhs.add(89);
	lhs.add(21);
	lhs.add(1);
	lhs.add(null);
	lhs.add(null);
	System.out.println(lhs);
	//lhs.first()
	
	ArrayList <Integer> ar1 = new ArrayList<>();
	ar1.add(12);
	ar1.add(21);
	ar1.add(13);
	ar1.add(1);
	System.out.println("ArrayList is  : " +ar1);
	
	LinkedHashSet <Integer> l = new LinkedHashSet<>(ar1);
	System.out.println("LinkedHashSet "+l);
	

	HashSet <Integer> h=new HashSet<>(ar1);
	System.out.println("HashSet "+h);
	
	
	
	
	
	TreeSet<Integer> t = new TreeSet<>();
	t.add(12);
	t.add(2);
	t.add(4);
	t.add(1);
	
	t.add(12);
	System.out.println("TreeSet "+t);
	
	HashSet<Integer> hs1 = new HashSet<>();
	hs1.add(89);
	hs1.add(34);
	hs1.add(23);
	hs1.add(10);
	hs1.add(null);
	System.out.println("hashSet order is "+hs1);
	
	
	}
	

}
