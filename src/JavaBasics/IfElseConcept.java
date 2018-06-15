package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a>b) {
			System.out.println("A is greater than b");
		}
		else {
			System.out.println("B is greater than a");
		}
		
		//Comparison operators
		// < > <= >= == !=
		
		int c = 40;
		int d = 50;
		
		if (c == d) {
			System.out.println("C is equal to D");
			
		}else {
			System.out.println("C is NOT equal to D");
		}
		
		
		
		int a1 = 800;
		int a2 = 500;
		int a3 = 300;
	
		
		if (a1>a2 && a1>a3) {
			System.out.println("A1");
		} else {
			if(a2>a1 && a2>a3) {
				System.out.println("A2");
			}
			
			else {System.out.println("A3");
				
			}
		}
		

	}

}
