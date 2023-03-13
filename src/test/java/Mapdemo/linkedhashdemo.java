package Mapdemo;

import java.util.LinkedHashMap;

public class linkedhashdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();
		l.put(23, "Shanma");
		l.put(12, "Pappu");
		l.put(10, "Pottery");
		l.put(null, null);
		l.put(null, "Hari");
		l.put(2, "Hari");
		l.put(2, "Sheela");
		l.put(3, null);
		l.put(5, "Sheela");
		System.out.println("LinkedHashMap " + l);
		System.out.println("Keys in map are "+l.keySet());
		System.out.println(l.values());
		System.out.println(l.entrySet());
		//key -once null ,no dup
		//value- many null,many dupl

	}

}
