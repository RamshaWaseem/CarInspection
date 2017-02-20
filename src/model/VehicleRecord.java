package model;

import view.View;
import DTO.Customer;
import DTO.InspectionCheckList;

public class VehicleRecord {
	
	public void saveRecord(Customer customer, View result, InspectionCheckList inspector){
		System.out.println("********** RECORD **********");
		System.out.println("Vehicle number = " + customer.getCarRegNo());
		System.out.println("Description");
		result.checkListResult();
		inspector.getInspectorName();
		
		
		
	}

}
