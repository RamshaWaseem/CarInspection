package controller;
import model.Payment;
import DTO.Customer;
import controller.InspectionSystem;


public class PaymentSystem {

	public void authorization(Payment payment,Customer card,InspectionSystem cost){
	   payment.paymentAuthorization(card, cost);
	}
}
