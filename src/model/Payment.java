package model;

import controller.InspectionSystem;
import DTO.Customer;


public class Payment {
	
		private int cost;

		private int balance;



		public int getCost() {

		return cost;

		}

		public void setCost(int cost) {

		this.cost = cost;

		}


		public void CustInfo(Customer customer) {

		  customer.getName();
		  customer.getCarRegNo();
		}

		public int getBalance() {

		return balance;

		}

		public void setBalance(int balance) {

		this.balance = balance;

		}


		  public boolean paymentAuthorization(Customer card,InspectionSystem cost) {

		      return true;

		  }	 



}
