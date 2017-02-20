


public class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  //creating objects for controllers.
	  controller.Printer print = new controller.Printer();
	  controller.InspectionSystem inspection=new controller.InspectionSystem();
	  controller.PaymentSystem payment=new controller.PaymentSystem();
	  //creating objects for the classes in models
	  model.QNumber number = new model.QNumber();
	  model.Recipt receipt = new model.Recipt();
	  model.Inspection inspect = new model.Inspection();
	  model.InspectionReport report = new model.InspectionReport();
	  model.Payment pay=new model.Payment();
	  //creating objects of the classes of DTO
	  DTO.InspectionCheckList checkList = new DTO.InspectionCheckList();
	  DTO.Customer cust=new DTO.Customer();
	  //creating object of view
	  view.View result =new view.View();
      // generating Queue number
	  number.incrementMethod();
	  //entering customer
	  cust.setCustomerName();
      //entering carRegistrationNumber
	  cust.setCarRegNo();
      cust.getName();
      //Customer enters credit card details
      cust.enterCreditCardInfo();
      //customer get the inspection cost
      inspection.cost(inspect);
      payment.authorization(pay, cust, inspection);
      //printing the Receipt
      print.printReciept(receipt, cust, inspect);
      //Inspector perform Inspection
      inspection.inspectVehicle(inspect, cust, checkList);
      //printing the report 
      print.printInspectionReport(report, cust, checkList, result);
      
      
    	  
	  
		
	}

}
