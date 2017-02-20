package DTO;

public class CreditCardInfo {
	private String creditCardNo;
	private int pinNo;
	private String expireDate;
	private int cvc;
	
	public String getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	
	public int getCvc(){
		return cvc;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	
	
}
