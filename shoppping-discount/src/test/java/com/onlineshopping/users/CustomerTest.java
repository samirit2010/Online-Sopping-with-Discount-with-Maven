package com.onlineshopping.users;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

	// private Customer customer; 
	private boolean equal =true;
	private Customer customer;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		customer = new Customer();
    //    System.out.println("before");  
	}
	
	@Test
	public void testDiscountPer() {
		
		customer.setExperince(2);
		assertTrue(customer.discount()==5);
		assertEquals("Discont Set", 5, customer.discount()); 
	}
	
	@Test
	public void testName() {
		// Customer customer = new Customer();
		customer.setCustName("Name");
		assertTrue(customer.getUser().equals("Name"));
		assertEquals("Customer Name Set", "Name", customer.getUser()); 
	}
	
	@Test
	public void testId() {
	//	Customer customer = new Customer();
		customer.setCustId("1");
		assertTrue(customer.getUserId().equals("1"));
		assertEquals("Id Set", "1", customer.getUserId()); 
	}
	
	@Test
	public void testHashCode() {
		Customer	customer1 = new Customer(2, "1","Customer1");
		Customer	customer2 = new Customer(2,"1","Customer1");
	//	System.out.println(employee1.hashCode() == employee2.hashCode());
		Assert.assertEquals(equal, customer1.hashCode() == customer1.hashCode());
		assertEquals("Hash code same : ", true, customer2.hashCode() == customer2.hashCode()); 
	}
 
	
	
}
