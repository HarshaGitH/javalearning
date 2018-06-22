package OOPConceptPart2;



// Extends is Inheritance Car is the parent class BMW is the child class-- BMW has inherited all the methods from Car Class
public class BMW extends Car{

	
// Start method is the same name and same argumument of Child class on execution child class method is considered this is method over riding concept	

	public void start() {
		System.out.println("BMW --- Start");
	}
	
	
	public void theft() {
		System.out.println("BMW --- tHEFT");
	}
}
