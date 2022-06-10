package Inheritance;



public class CreditCardPaymentPOJO extends PaymentPOJO{
	
	private String ccType;

	public CreditCardPaymentPOJO() {
		super();
	}

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	

}
