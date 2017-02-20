package DTO;
import java.util.Scanner;

public class Customer {
	
	private CreditCardInfo credits;
	private String name;
	private String address;
	private String carRegNo;
	private Scanner userInput;
	
	public Customer() {
		credits = new CreditCardInfo();
		userInput = new Scanner(System.in);
	}
	public String getName() {
		return name;
	}
	
	public void setCustomerName(){
	       System.out.println("Enter Name");
	        name = userInput.next();
	 }
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCarRegNo() {
		return carRegNo;
	}
	public void setCarRegNo() {
		System.out.println("Enter car registration number : ");
		carRegNo = userInput.next();
	}

	public void enterCreditCardInfo(){
		System.out.println("Name  : "+ name);
		System.out.println("Insert your Card in the machine :");
		System.out.println("Enter pin code");
        credits.setPinNo(userInput.nextInt());
	}
	
	

}
