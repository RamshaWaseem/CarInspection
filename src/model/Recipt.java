package model;

import DTO.Customer;


public class Recipt {
	
	public void receipt(Customer customer, Inspection cost){
		System.out.println(" **********RECEIPT********** ");
		System.out.println("Owner name = " + customer.getName());
		System.out.println("Car Registration Number = " + customer.getCarRegNo());
		System.out.println("Amount = " + cost.getCost());
		
	}

}
