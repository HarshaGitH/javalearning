package OOPConceptPart1;

public class StaticAndNon {

	
	String h = "Static";
	static int i = 10;
	
	
	public static void main(String[] args) {
		
		//How to call static methods and variables
		//Direct calliing can be done with call name yes you can acces the method with onject but not s good practice
		
        int k = StaticAndNon.i;
	    System.out.println(k);
	    StaticAndNon.Test1();
	    
	    //datatype variable can also be called directly
	    int f = i;
	    System.out.println(i);
	    
	    //Nonstatic always should be 

	}
	
	
	
	
	
	public static void Test1() {
		System.out.println("Static");
	}

	public  void Test2() {
		System.out.println("Non -Static");
	}
	
	
}
