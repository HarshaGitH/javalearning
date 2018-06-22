package OOPConceptPart2;

public class HsbcBank implements USbank , BrazilBank {
	
	
	// This class must implement all the methods of the Interface
	public void credit() {
		System.out.println("Credit");
	}
	
	public void debit() {
		System.out.println("Debit");
	}
	
	public void moneytransfer() {
		System.out.println("MonryTransfer");
	}
	
	public void carloan() {
		System.out.println("Carloan");
	}

	
	public void mf() {
		
		System.out.println("Brazil bankCarloan");
	}
	

}
