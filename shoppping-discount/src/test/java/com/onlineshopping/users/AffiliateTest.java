
package com.onlineshopping.users;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;


public class AffiliateTest extends TestCase {

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
		
		Affiliate affiliate = new Affiliate(); 
		assertTrue(affiliate.discount()==10);
		assertEquals("Discont Set", 10, affiliate.discount()); 
	}
	
	@Test
	public void testName() {
		Affiliate affiliate = new Affiliate(); 
		affiliate.setName("Name");
		assertTrue(affiliate.getUser().equals("Name"));
		assertEquals("Affiliate Name Set", "Name", affiliate.getUser()); 
	}
	
	@Test
	public void testId() {
		Affiliate affiliate = new Affiliate(); 
		affiliate.setAffiliateId("1");
		assertTrue(affiliate.getUserId().equals("1"));
		assertEquals(" Affiliate Id Set", "1", affiliate.getUserId()); 
	}
	
	@Test
	public void testHashCode() {
		Affiliate	affiliate1 = new Affiliate("1","Affiliate1");
		Affiliate	affiliate2 = new Affiliate("1","Affiliate1");
	//	System.out.println(employee1.hashCode() == employee2.hashCode());
		Assert.assertEquals(equal, affiliate1.hashCode() == affiliate1.hashCode());
		assertEquals("Hash code same : ", true, affiliate1.hashCode() == affiliate2.hashCode()); 
	}
}
