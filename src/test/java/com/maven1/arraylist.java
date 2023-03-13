package com.maven1;

import java.util.ArrayList;
import java.util.LinkedList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> arr= new ArrayList<String>();
         arr.add("Python");
         arr.add("Padhumai");
         arr.add(1,"Aadhav");
         arr.add(3, "Pappu");
         
         System.out.println(arr);
		//arr.remove(3);
		//System.out.println(arr);
		arr.remove("Pappu");
		System.out.println(arr);
		
		int a[]= {4,7,8,9};
		System.out.println(a[2]);
		
		for( int i:a) {
			System.out.println(i);
		}
		
		System.out.println("=======");
		int b[]=new int [5];
		b[1]=22;
		b[2]=44;
		b[3]=35;
		b[4]=45;
		System.out.println(b[0]);
		b[0]=10;
		System.out.println("elemnt at 0th index "+b[0]);
		
		for (int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		
		//arr.removeAll(arr);
		arr.clear();
		System.out.println(arr);
		System.out.println("=======");
		ArrayList<String> d= new ArrayList<String>();
		d.add("Elephant");
		d.add("Dog");
		d.add("Blue Whale");
		d.add("Dog");
		d.add(null);
		d.add(null);
		d.remove(0);
		System.out.println(d);
		System.out.println(d.indexOf("Dog"));
		System.out.println(d.lastIndexOf("Dog"));
		
		System.out.println("=====");
		LinkedList <String> w= new LinkedList<>();
		w.add("Rabbit");
		w.add("Penguin");
		w.add("Dolphin");
		w.add("Banana");
		w.add(null);
		w.add("Banana");
		w.add(null);
		w.remove();
		System.out.println(w.indexOf("Banana"));
		System.out.println(w.lastIndexOf("Banana"));
		System.out.println(w);
		
	}

}
