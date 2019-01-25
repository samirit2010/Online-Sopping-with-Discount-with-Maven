package com.onlineshopping.products;

import org.junit.Test;

import com.onlineshopping.users.Employee;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class ProductTest extends TestCase {

	private boolean equal =true;
	
	protected void setUp() throws Exception {
		//	super.setUp();
		
	        System.out.println("before");  
		}
	
	
	@Test
	public void testProductName() {
		Product product = new Product();
		product.setProductName("Pen");
	//	assertTrue(employee.discount()==30);
		assertEquals("Set Product Name :", "Pen", product.getProductName()); 
	}
	
	@Test
	public void testProductType() {
		Product product = new Product();
		product.setProductType("Non grocerry");
	//	assertTrue(employee.discount()==30);
		assertEquals("Set Product Type :", "Non grocerry", product.getProductType()); 
	}
	
	@Test
	public void testProductPrice() {
		Product product = new Product();
		product.setPrice(12);
		assertEquals("Set Product Price :", 12, product.getPrice());
	}
	
	@Test
	public void testHashCode() {
		Product	employee1 = new Product("pen","grocerry",50);
		Product	employee2 = new Product("pen","grocerry",50);
	//	System.out.println(employee1.hashCode() == employee2.hashCode());
		Assert.assertEquals(equal, employee1.hashCode() == employee2.hashCode());
		assertEquals("Hash code same : ", true, employee1.hashCode() == employee2.hashCode()); 
	}
	
	@Test
	public void testProductEqual() {
		Product	employee1 = new Product("pen","grocerry",50);
		Product	employee2 = new Product("pen","grocerry",50);
		assertEquals("Product Equal : ", true, employee1.equals(employee2));
	}
	
	@Test
	public void testProductEqual1() {
		Product	employee1 = new Product("pen","grocerry",50);
		Product	employee2 = null;
		assertEquals("Product Equal : ", false, employee1.equals(employee2));
	}
	
	@Test
	public void testProductEqual2() {
		Product	employee1 = new Product("pen","grocerry",50);
		Product	employee2 = new Product("Pencil","grocerry",50);
		assertEquals("Product Equal : ", false, employee1.equals(employee2));
	}
	
	@Test
	public void testProductEqual3() {
		Product	employee1 = new Product("pen","grocerry",50);
		Product	employee2 = new Product("pen","Non grocerry",50);
		assertEquals("Product Equal : ", false, employee1.equals(employee2));
	}
	
	@Test
	public void testProductEqual4() {
		Product	employee1 = new Product("pen","grocerry",50);
		Product	employee2 = new Product("pen","grocerry",60);
		assertEquals("Product Equal : ", false, employee1.equals(employee2));
	}
}
