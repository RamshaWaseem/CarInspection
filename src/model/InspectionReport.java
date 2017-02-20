package model;

import DTO.Customer;
import DTO.InspectionCheckList;
import view.View;

public class InspectionReport {
	
	public void getInspectionReport(View view, Customer customer, InspectionCheckList checklist){
		System.out.println("*********** InspectionReport **********");
		System.out.println("Car owner's registration number : " + customer.getCarRegNo());
		System.out.println("Inspection Result :"); 
		System.out.println("Brakes : " + checklist.getBrakes());
		System.out.println(" Engine : " + checklist.getEngineCondition());
		System.out.println(" Door : " + checklist.getDoors());
		System.out.println("GearBox : " + checklist.getGearBox());
		System.out.println(" Light : " + checklist.getLights());
		System.out.println(" Wheels : " + checklist.getWheels());
		System.out.println("Inspector Name" + checklist.getInspectorName());
	}
}
