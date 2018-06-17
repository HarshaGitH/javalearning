package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
	
		// Array declaration
		//Disadavntages of an arra 
		//Size is fixed static array
		//stores only similar  datatypes--To overcome we use collections
		
		int i[] = new int[4];
	 // int []i = new int[4];
	    i[0]=10;
	    i[1]=20;
	    i[2]=30;
	    i[3]=40;
			
	//if we try to access i[4] array index out of bound exception
		System.out.println(i[1]);
		
	//to get length of array
		System.out.println(i.length);
	
	//print all the values of array
			for(int j =0;j<i.length;j++) {
			System.out.println(i[j]);
			
		}
			
    //String array string is not an data type its a class
	
			String S[] = new String[2];
			S[0]="hAR";
			S[1]="hR";
			
			System.out.println(S[0]);
			System.out.println(S[1]);
			System.out.println(S.length);

//Object array I can store different data types-- Integer,string  others in the same array
		
		Object ob[] = new Object[8];
		ob[0]= "Tom";
		ob[1]=1;
		ob[2]=12.45;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
