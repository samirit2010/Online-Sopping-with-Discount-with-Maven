/**
 * 
 */
package com.onlineshopping.users;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author sammansu
 *
 */
public class EmployeeTest extends TestCase {
	
	private boolean equal =true;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	
        System.out.println("before");  
	}
	
	@Test
	public void testDiscountPer() {
		Employee employee = new Employee("1","Emp1");
		assertTrue(employee.discount()==30);
		assertEquals("Discont Set", 30, employee.discount()); 
	}
	
	@Test
	public void testName() {
		Employee employee = new Employee();
		employee.setName("Name");
		assertTrue(employee.getName().equals("Name"));
		assertEquals("Name Set", "Name", employee.getName()); 
	}
	
	@Test
	public void testId() {
		Employee employee = new Employee();
		employee.setEmployeeId("1");
		assertTrue(employee.getEmployeeId().equals("1"));
		assertEquals("Id Set", "1", employee.getEmployeeId()); 
	}
	
	@Test
	public void testHashCode() {
		Employee	employee1 = new Employee("1","Emp1");
		Employee	employee2 = new Employee("1","Emp1");
	//	System.out.println(employee1.hashCode() == employee2.hashCode());
		Assert.assertEquals(equal, employee1.hashCode() == employee2.hashCode());
		assertEquals("Hash code same : ", true, employee1.hashCode() == employee2.hashCode()); 
	}

}
