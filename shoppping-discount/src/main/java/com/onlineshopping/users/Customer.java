package com.onlineshopping.users;
import java.util.Date;

/* Employee class is type of User  
 *  
 * @variable : associatePeriod is time duration of customer associated with Shopping  
 * @varible :  discount class use to calculate discount for product
 * 
 */

public class Customer implements User {

	private int associatePeriod;
//	private int discountPer;
	private String custName;
	private String custId;

	/*
	 * public int getDiscountPer() { return discountPer; } public void
	 * setDiscountPer(int discountPer) { this.discountPer = discountPer; }
	 */
	public Customer() {
	}
	
	public Customer(int experience,String name,String id) {
		this.associatePeriod= experience;
		this.custName=name;
		this.custId=id;
		//this.discountPer=5;
	}
	
	public int getExperince() {
		return associatePeriod;
	}

	public void setExperince(int experince) {
		this.associatePeriod = experince;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/*
	 * 	(non-Javadoc)
	 * @see User#discount()
	 * 
	 * Give the percent of discount as per the User type
	 */	
	
	
	public int discount() {
		if(associatePeriod>=2)
		return 5;
		else return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custId.hashCode()+ custName.hashCode();
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
		Customer other = (Customer) obj;
		if (custId != other.custId)
			return false;
		if (custName != other.custName)
			return false;
		if (associatePeriod != other.associatePeriod)
			return false;
		return true;
	}
	
	
}
