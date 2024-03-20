package practie1;

public class Test {
	
	public static void main(String[] args) {
		// it is for setter injecti
		
//		Billcollector bc = new Billcollector();
//		
//		//injecting CreditCard obj into BillCollector(Setter Injection)
//		bc.satPayment(new CreditCardPAyment());
//		
//		bc.collectPayment(1400.00);
	
	    System.out.println("=================================================");
	    
	    
	    Billcollector bc = new Billcollector(new CreditCardPAyment());
	    
	    bc.collectPayment(15000.00);
		
		
		 
	}

}
