package OOPConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {
	
		// Wrapper class is basically the DataType conversion.
		
		String x = "100";
		System.out.println(x + 20);// 10020
		
		//String to integer Conversion
		int 	i = 	Integer.parseInt(x);
        System.out.println(i + 20);//120
        
        //String to double conversion
         String s = "12.33";
         double j =   Double.parseDouble(s);
         System.out.println(j);
         
        // String to boolean
          String b = "true";
         boolean k =    Boolean.parseBoolean(b);
         System.out.println(k);
         
        // Integer to string conversion
         int l = 200;
         System.out.println(l+30);//230
         String m = String.valueOf(l);
         System.out.println(m+30);//20030
         
        // string to Int with mixed in string
         
         String n = "100A";
         int o =   Integer.parseInt(n);
        System.out.println(o);// Number format exception
        
	}

}
