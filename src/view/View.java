package view;
import DTO.InspectionCheckList;

public class View {
	private InspectionCheckList checkList; 
	
	public View(){
		
		checkList = new InspectionCheckList();
	}
	
	public void checkListResult(){
		System.out.println("Start Inspection (pass / fail)");
		checkList.resultCheckList();
		
		
	} 
}
