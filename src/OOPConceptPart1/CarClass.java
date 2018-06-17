package OOPConceptPart1;

public class CarClass {
	
	//What is class-- Its an entity and methods and variable are its properties
	
	//Variables declares at class level are Global or Class variables
	
	int wheel;
	int model;
	
	
	

	public static void main(String[] args) {
		
		//Creation of object and the GlobalVariables are common to a & b
		
		CarClass a = new CarClass(); // a-Object Reference variable right side- its the object creation.
		CarClass b = new CarClass();
		CarClass c = new CarClass();
         
		a.model = 2014;
		a.wheel = 4;
		
		b.model=2015;
		b.wheel=4;
		
		c.model =2017;
		c.wheel = 4;
		
		System.out.println("Before shifting the refences");
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(b.model);
		
		System.out.println("After shifting the refences");
		a=b; // 2015
		b=c; // 2017
		c=a; // 2015
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		
		
		
		
		
	}

}
