package com.onlineshopping.users;
import java.util.Date;

/* Employee class is type of User  
 *  
 * @variable : discountPer for % of Discount for Employee  
 * @varible :  discount class use to calculate discount for product
 * 
 */

public class Employee implements User {

	private int discountPer;
	
	private String employeeId;
	private String name;
	
	public Employee(String empId,String name) {
		this.employeeId=empId;
		this.name=name;
	//	this.discountPer = 30;
	}
	public Employee() {
		
	}
	
	public String getUser() {
		return name;
	}
	public String getUserId() {
		return employeeId;
	}
	/*
	 * public String getName() { return name; }
	 */

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public String getEmployeeId() { return employeeId; }
	 */

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	/*
	 * 	(non-Javadoc)
	 * @see User#discount()
	 * 
	 * Give the percent of discount as per the User type
	 */
		
		public int discount() {
			return 30;
		}
		
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId.hashCode();
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
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (name != other.name)
			return false;
		return true;
	}

	
	
	/*
	 * public int getDiscountPer() { return discountPer; }
	 */
	
	/*
	 * public void setDiscountPer(int discountPer) { this.discountPer = discountPer;
	 * }
	 */
	

	

	
	
}

