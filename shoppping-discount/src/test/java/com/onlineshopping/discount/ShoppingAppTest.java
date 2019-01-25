package com.onlineshopping.discount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import com.onlineshopping.products.Product;

public class ShoppingAppTest {

	protected void setUp() throws Exception {
		//	super.setUp();
		
	        System.out.println("before");  
		}
	
	@Test
	public void testProdut() {
		Product	product1 = new Product("pen","grocerry",50);
		assertEquals("Set Product Name :", "pen", product1.getProductName()); 
		assertEquals("Set Product Type :", "grocerry", product1.getProductType()); 
		assertEquals("Set Product Price :", 50, product1.getPrice());
	}
}
