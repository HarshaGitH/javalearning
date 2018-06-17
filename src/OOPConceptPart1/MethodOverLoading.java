package OOPConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading ob = new MethodOverLoading();
		ob.m1();
		ob.m1(10);
		ob.m1(5, 6);
		
		MethodOverLoading.main();
		

	}

	
	//New method cannot be created inside a method & There cannot be two methods of same name & Same arguments type.
	//Method overloading is a concept of two or more methods in the same class having same methodNames but different arguments is called method overloading.
   
	
	
	//Can we overload main method - Yes we can
	
	public  static  void main() {
		System.out.println("Main");
	}
	
	
   public void m1() {
	   System.out.println("m1- No args");
   }
   
  
   public void m1(int i) {
	   System.out.println("m1- 1 args");
	   System.out.println(i);
	   
   }
   
   public void m1(int k, int l) {
	   System.out.println("m1- 2 args");
	   System.out.println(k);
	   System.out.println(l);
	   
   }









}
