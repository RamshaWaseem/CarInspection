package controller;

import DTO.Customer;
import DTO.InspectionCheckList;
import model.Inspection;

public class InspectionSystem {
	
	
	/*public void showInspection(Inspection inspect){
		inspect.inspectVehicle();
	}*/
	public void cost(Inspection inspection){
		inspection.getCost();
	}
    public void inspectVehicle(Inspection inspect,Customer customer,InspectionCheckList checkList){
    	inspect.inspectVehicle(customer, checkList);
    }
}
