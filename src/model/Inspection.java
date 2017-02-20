package model;

import DTO.Customer;
import DTO.InspectionCheckList;

public class Inspection {
	private int cost;
	
	
	public Inspection(){
		cost = 1000;
	}
	
	public int getCost(){
		return cost;
	}

	public void inspectVehicle(Customer customer, InspectionCheckList checkList){
		customer.getCarRegNo();
		checkList.resultCheckList();
	}
}
