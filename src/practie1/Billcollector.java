package practie1;

public class Billcollector {
	
	private Ipayment payment;
	
	public void satPayment(Ipayment payment)
	{
		this.payment = payment; 
	}
	
	public Billcollector() {
		super();
	}

	public Billcollector(Ipayment payment) {
		super();
		this.payment = payment;
	}

	public void collectPayment(Double amount)
	{
		String status = payment.pay(amount);
		
		System.out.println(status);
		   
	}

}
