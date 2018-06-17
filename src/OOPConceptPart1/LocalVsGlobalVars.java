package OOPConceptPart1;

public class LocalVsGlobalVars {
	
	//Global variables or class variables
    int age =25;
	String name = "Harsha";
	public static void main(String args[]) {
		
		//To access global variable inthe main method object is needed
		
		LocalVsGlobalVars Glb = new LocalVsGlobalVars();
	    System.out.println(Glb.age);
	    String H = Glb.name;
	    
	    int i = 10; //LocalVariable
	    int age = 10;
	    System.out.println(age);
		
		
	}

}
