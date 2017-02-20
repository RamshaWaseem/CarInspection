package DTO;
import java.util.Scanner;

public class InspectionCheckList {
	private String inspectionCompany;
    private String inspectorName;
    private String engineCondition;
    private String wheels;
    private String brakes;
    private String lights;
    private String gearBox;
    private String doors;
    private Scanner userName;
    
    public InspectionCheckList(){
    	inspectionCompany = "ABC";
    	userName=new Scanner(System.in);
    }
    public String getInspectionCompany(){
        return inspectionCompany;
    }
    
    public String getInspectorName(){
        return inspectorName;
    }
    
    public void setInspectorName(){
    	  System.out.println("Enter Inspector Name : ");
    	  inspectorName = userName.next();
    }
    
    public String getEngineCondition() {
		return engineCondition;
	}
    public void setEngineCondition() {
		System.out.println("Enter Engine condition :");
		engineCondition = userName.next();
	}
	
	public String getWheels() {
		return wheels;
	}
	public void setWheels() {
		System.out.println("Enter Wheels condition :");
		wheels = userName.next();
	}
	public String getBrakes() {
		return brakes;
	}
	public void setBrakes() {
		System.out.println("Enter Brakes Condition :");
		brakes = userName.next();
	}
	public String getLights() {
		return lights;
	}
	public void setLights() {
		System.out.println("Enter Light Condition :");
		lights = userName.next();
	}
	public String getGearBox() {
		return gearBox;
	}
	public void setGearBox() {
		System.out.println("Enter gearbox Condition :");
		gearBox = userName.next();	}
	
	public String getDoors() {
		return doors;
	}
	public void setDoors() {
		System.out.println("Enter doors Condition :");
		doors = userName.next();
	}


	public void resultCheckList(){
		setInspectorName();
		setGearBox();
		setDoors();
		setLights();
		setBrakes();
		setWheels();
		setEngineCondition();
	}
}
