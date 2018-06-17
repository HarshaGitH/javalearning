package OOPConceptPart1;

public class CallByValueNRef {

	public static void main(String[] args) {
		CallByValueNRef obj = new CallByValueNRef();
		
		obj.sum(10, 20); // Call by Value
		
//Call by refernce is possible in java
	}

	
	
	public int sum(int a, int b) {
		int c = a +b;
		return c;
		
	}
}
