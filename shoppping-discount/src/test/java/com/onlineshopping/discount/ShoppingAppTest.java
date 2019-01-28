package com.onlineshopping.discount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import com.onlineshopping.products.Product;
import com.onlineshopping.users.Affiliate;
import com.onlineshopping.users.Customer;
import com.onlineshopping.users.Employee;
import com.onlineshopping.users.User;

import junit.framework.TestCase;

public class ShoppingAppTest extends TestCase  {

	protected void setUp() throws Exception {
			 super.setUp();
		}
	
	@Test
	public void testProdut() {
		Product	product1 = new Product("pen","grocerry",50);
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		assertEquals("Set Product Name :", "pen", app.getProduct().getProductName()); 
		assertEquals("Set Product Type :", "grocerry", app.getProduct().getProductType()); 
		assertEquals("Set Product Price :", 50, app.getProduct().getPrice());
	}
	
	@Test
	public void testEmployeeUser() {
		User empUser = new Employee("1","Employee1");
		ShoppingApp app = new ShoppingApp();
		app.setUser(empUser);
		//Product	product1 = new Product("pen","grocerry",50);
		assertEquals("Set Employee Name :", "Employee1",app.getUser().getUser()); 
		assertEquals("Set Employee Id :", "1", app.getUser().getUserId()); 
	}
	
	@Test
	public void testAffilateUser() {
		User affiUser = new Affiliate("10","Affilate1");
		ShoppingApp app = new ShoppingApp();
		app.setUser(affiUser);
		assertEquals("Set Affiliate Name :", "Affilate1",  app.getUser().getUser()); 
		assertEquals("Set Affiliate Id :", "10", app.getUser().getUserId()); 
	}
	@Test
	public void testCustomerUser() {
		Customer custUser = new Customer();
		custUser.setCustId("100");
		custUser.setCustName("CustomerName");
		custUser.setExperince(2);
		ShoppingApp app = new ShoppingApp();
		app.setUser(custUser);
		assertEquals("Set Product Name :", "CustomerName", app.getUser().getUser()); 
		assertEquals("Set Product Type :", "100", app.getUser().getUserId());
		Customer cust = (Customer)app.getUser();
		assertEquals("Set Product Price :", 2, cust.getExperince());
	}
	
	@Test
	public void testCalculateBillEmp() {
		Product	product1 = new Product("Saop","grocerry",50);
		User empUser = new Employee("1","Employee1");
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		app.setUser(empUser);
		assertEquals("Set Product and Employee and Calculate Bill :", 35, app.calculateBill()); 
		System.out.println(" Calculate Bill for Employee for Grocerry :   "+app.calculateBill());
	}
	
	@Test
	public void testCalculateBillEmp1() {
		Product	product1 = new Product("Cycle","Non grocerry",766);
		User empUser = new Employee("1","Employee1");
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		app.setUser(empUser);
		assertEquals("Set Product and Employee and Calculate Bill with non-grocerry Items :", 731, app.calculateBill());
		System.out.println(" Calculate Bill for Employee for Non Grocerry :   "+app.calculateBill());
	}
	
	@Test
	public void testCalculateBillCust() {
		Product	product1 = new Product("Saop","grocerry",70);
		Customer custUser = new Customer();
		custUser.setCustId("100");
		custUser.setCustName("CustomerName");
		custUser.setExperince(3);
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		app.setUser(custUser);
		assertEquals("Set Product and Customer and Calculate Bill with grocerry Items :", 67, app.calculateBill());
		System.out.println(" Calculate Bill for Customer for Grocerry :   "+app.calculateBill());
	}
	@Test
	public void testCalculateCust1() {
		Product	product1 = new Product("Cycle","Non grocerry",7660);
		Customer custUser = new Customer();
		custUser.setCustId("100");
		custUser.setCustName("CustomerName");
		custUser.setExperince(3);
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		app.setUser(custUser);
		assertEquals("Set Product and Customer and Calculate Bill with non-grocerry Items :", 7280, app.calculateBill());
		System.out.println(" Calculate Bill for Customer for Non Grocerry :   "+app.calculateBill());
	}
	
	@Test
	public void testCalculateBillCustExp() {
		Product	product1 = new Product("Saop","grocerry",70);
		Customer custUser = new Customer();
		custUser.setCustId("100");
		custUser.setCustName("CustomerName");
		custUser.setExperince(1);
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		app.setUser(custUser);
		assertEquals("Set Product and Customer and Calculate Bill with non-grocerry Items with less than 2 years :", 70, app.calculateBill());
		System.out.println(" Calculate Bill for Customer for Grocerry with less than 2 year Experience :   "+app.calculateBill());
	}
	@Test
	public void testCalculateCustExp1() {
		Product	product1 = new Product("Cycle","Non grocerry",7660);
		Customer custUser = new Customer();
		custUser.setCustId("100");
		custUser.setCustName("CustomerName");
		custUser.setExperince(1);
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		app.setUser(custUser);
		assertEquals("Set Product and Customer and Calculate Bill with non-grocerry Items with less than 2 years :", 7280, app.calculateBill());
		System.out.println(" Calculate Bill for Customer for Non Grocerry with less than 2 years Experience :   "+app.calculateBill());
	}
	@Test
	public void testCalculateBillAffiliate() {
		Product	product1 = new Product("Saop","grocerry",50);
		User affiUser = new Affiliate("10","Affilate1");
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		app.setUser(affiUser);
		assertEquals("Set Product and Affiliate with grocerry Items :", 45, app.calculateBill());
		System.out.println(" Calculate Bill for Affiliate for Grocerry :   "+app.calculateBill());
	}
	
	@Test
	public void testCalculateBillEmpAffiliate() {
		Product	product1 = new Product("Cycle","Non grocerry",766);
		User empUser = new Affiliate("1","Affilate1");
		ShoppingApp app = new ShoppingApp();
		app.setProduct(product1);
		app.setUser(empUser);
		assertEquals("Set Product and Affiliate  with non-grocerry Items :", 731, app.calculateBill());
		System.out.println(" Calculate Bill for Affiliate for Non Grocerry :   "+app.calculateBill());
	}
	
}
