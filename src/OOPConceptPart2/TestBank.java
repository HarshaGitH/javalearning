package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		//Static variable can be referenced without creating an object
		System.out.println(USbank.minBal);
		
		
		//Run time polymorphism
		HsbcBank hs = new HsbcBank();
		hs.carloan();
		hs.credit();
		hs.debit();
		hs.moneytransfer();
		
		//Dynamic polymorphism
		
		USbank us = new HsbcBank();
		us.credit();
		us.debit();
		us.moneytransfer();
		//Cannot implement the Hsbc methods only common methods can be done
		
		
		

	}

}
