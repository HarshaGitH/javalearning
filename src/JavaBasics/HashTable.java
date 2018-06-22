package JavaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
	
		// HashTable is similar to the ArraylIst however the indexing is little diff
		
		Hashtable h = new Hashtable();
		h.put(1, "1Harsha");
		h.put(2, 2);
		
		System.out.println(h.size());
		
		System.out.println(h.get(1));
		
		
		//To restrict to particula datatye
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		
		Hashtable<String,Integer> h2 = new Hashtable<String,Integer>();
		h2.put("Har",100);
		
		

	}

}
