package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
	//Functions and methods both are same
		
		
		//Object cannot hold static methods.
		FunctionsInJava obj = new FunctionsInJava();
		obj.mtd1();
		System.out.println(obj.mtd2());
		System.out.println(obj.mtd3(10, 2));
		
		
		
//main method is void because we never return a value
	}

	//Non Static methods	
	// Void means no return in the method
	
	//There are 3 types of methods
	
	
	//1. No Input, No output return type is void
	public  void mtd1() {
		System.out.println("mtd1");
	}
	
	//2.No Input, some output return Type is Datatype-Int
	public int mtd2() {
		int x = 10;
		int y = 12;
		int z = x + y;
		return z;
	}
	
	//3.Some Input,some output
	public int mtd3(int a,int b) {
		int c = a/b;
		return c;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
