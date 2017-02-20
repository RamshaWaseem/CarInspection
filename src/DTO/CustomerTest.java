package DTO;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

	public void negetiveTestGetName() {
		Customer cust=new Customer();
		assertEquals(cust.getName(), null);
		System.out.println("TEST1");
	}

	public void TestGetName() {
		Customer cust=new Customer();
		assertEquals(cust.getName(),123);
	}
	public void testGetCarRegNo() {
		fail("Not yet implemented");
	}

}
