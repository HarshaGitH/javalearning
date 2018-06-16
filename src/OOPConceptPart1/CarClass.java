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
         
		a.model = 2014;
		a.wheel = 4;
		
		System.out.println(a.model);
		
		b.model=2015;
		b.wheel=4;
	}

}
