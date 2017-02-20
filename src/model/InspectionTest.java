package model;

import static org.junit.Assert.*;
import org.junit.Test;


import junit.framework.TestCase;

public class InspectionTest {

	

	@Test
	public void negetiveTestGetCost() {
		   
		Inspection inspect=new Inspection();
		int value1=1000;
		int value2=600;
	
		assertNotEquals(inspect.getCost(), value1);
	
		
	}
	
	@Test
	public void positiveTestGetCost() {
		   
     
		
		
	}
	

}
