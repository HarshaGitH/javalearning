package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
	
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		//Sum happens from left to right in order.
		//+ is a concatenation operator for strings
		//println is used to print in the new line
		//print is used print on the same line
		
		System.out.println(a+b);  //300
		
		System.out.println(x+y);  //HelloWorld
		
		System.out.println(a+b+x+y); //300HelloWorld
		
		System.out.println(x+y+a+b); //HelloWorld100200
		
		System.out.println(x+y+(a+b));//HelloWorld300
		
		System.out.println(a+b+x+y+a+x+b+y);//300HelloWorld100Hello300World
		
		System.out.println(a+b+x+y+a+b);//300HelloWorld100200
		
		System.out.println(c+d);//22.66
		
		System.out.println(x+y+c+d);//HelloWorld12.3310.33
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
