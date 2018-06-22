package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//Any data can be added for the below arraylist
		ArrayList ar = new ArrayList();
		ar.add(20);
		ar.add("Harsha");
		
		System.out.println(ar.size());
		
		ar.add('H');
		
		System.out.println(ar.size());
		
		ar.add("Kiran");
		
		System.out.println(ar.get(1));
		
		
		System.out.println("--------------");
		
		// to print all the  values
		
		for(int i=0; i<ar.size();i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		
		//To restrict to particular datatype
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(5);
		ar1.add(10);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Harsha1");
		
		
		
		
		
		
		
		
		

	}

}
