package Mapdemo;

import java.util.HashMap;

public class hashMapdemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> h= new HashMap<Integer, String>();
		h.put(1, "Java");
		h.put(2, "Ruby");
		h.put(3, "C#");
		h.put(8, "JavaScript");
		h.put(12, "C++");
		System.out.println("HashMap :"+h);
		h.replace(1, "C");
		System.out.println("New HashMap :"+h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());
		h.remove(3);
		System.out.println(h.entrySet());
		System.out.println(h.size());
		
		

	}

}
