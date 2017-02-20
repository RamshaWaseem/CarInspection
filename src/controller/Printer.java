package controller;

import model.InspectionReport;
import model.Recipt;
import DTO.Customer;
import model.Inspection;
import DTO.InspectionCheckList;
import view.View;
//import model.Recipt;
//import model.InspectionReport;


public class Printer {
	public void printReciept(Recipt recipt, Customer customer, Inspection cost){
		recipt.receipt(customer, cost);
	}
	
	public void printInspectionReport(InspectionReport report, Customer customer, InspectionCheckList checklist, View view ){
		report.getInspectionReport(view, customer, checklist);
		
	}
}