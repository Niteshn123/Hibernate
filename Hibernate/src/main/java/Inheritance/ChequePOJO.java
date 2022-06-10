package Inheritance;



public class ChequePOJO extends PaymentPOJO{
 private int chqNumber;
 private String bankName;
public ChequePOJO() {
	super();
}
public int getChqNumber() {
	return chqNumber;
}
public void setChqNumber(int chqNumber) {
	this.chqNumber = chqNumber;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
 
}
