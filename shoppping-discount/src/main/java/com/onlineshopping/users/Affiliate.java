package com.onlineshopping.users;
import java.util.Date;
/* Affiliate class is type of User  
 *  
 * @variable : discountPer for % of Discount for Employee  
 * @varible :  discount class use to calculate discount for product
 * 
 */
public class Affiliate implements User {

//	private int discountPer;
	
	private String affiliateId;
	private String name;
	
	/*
	 * public int getDiscountPer() { return discountPer; }
	 * 
	 * public void setDiscountPer() { this.discountPer = 10; }
	 */
	
	public Affiliate(String id, String name) {
		this.affiliateId=id;
		this.name=name;
		}
	
	public Affiliate() {
	//	this.discountPer=5;
	}
	
	public String getAffiliateId() {
		return affiliateId;
	}

	public void setAffiliateId(String affiliateId) {
		this.affiliateId = affiliateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + affiliateId.hashCode();
		result = prime * result + name.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Affiliate other = (Affiliate) obj;
		if (affiliateId != other.affiliateId)
			return false;
		if (name != other.name)
			return false;
		return true;
	}

/*
 * 	(non-Javadoc)
 * @see User#discount()
 * 
 * Give the percent of discount as per the User type
 */
	
public int discount() {
		return 10;
		
	}
}
