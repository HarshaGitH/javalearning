package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		
		//Static polymorpism or Runtime Poly -- Java will decide at the time of compilation to which method to refer to
		BMW B = new BMW();
		
		// B.start is method overiden it will exectue the Child class method
		B.start();
		
		// B.stop is a method from the  Car class
		B.stop();
		
		//B.engine is from the grand parent Vehicle class
		B.engine();
		
		System.out.println("---------------------------------");
		
		
		// Car object can get only the car class methods
		Car C = new Car();
		C.start();
		C.stop();
		System.out.println("---------------------------------");
		
		
		//Top casting child to parent class variable
		//Dynamic polymorphis - Run time 
		//Only overriden and parent class methods can be accessed
		
		Car A = new BMW();
		A.start();
		
		//DownCasting -- Class casting exception
		BMW B1 = (BMW)new Car();

	}

}
