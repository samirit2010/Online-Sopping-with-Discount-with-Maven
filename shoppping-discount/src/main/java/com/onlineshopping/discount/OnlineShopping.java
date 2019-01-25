package com.onlineshopping.discount;
import com.onlineshopping.products.Product;
import com.onlineshopping.users.Customer;
import com.onlineshopping.users.Employee;
import com.onlineshopping.users.User;

/* OnlineShopping class is used for calculate the bill by help of ShoppingApp class as per the provided info of the User and Product   
 *  
 * 
 */

public class OnlineShopping  {

	public static void main(String args[]) {
		
		// Provide the info of User
		
		User employee = new Employee();
		User customer = new Customer(2,"Customer1","1");
		
		// Provide the information of Product
		Product nonGrocProd = new Product();
		nonGrocProd.setPrice(1000);
		nonGrocProd.setProductType("Non grocerry");
		
		
		ShoppingApp app = new ShoppingApp();
		
		//Give the input of User and Product  
		app.setUser(employee);
		app.setProduct(nonGrocProd);
		// Display the calculation of final bill for particular product and User
		System.out.println(" Non groc_ Employee Final Bill  "+ app.calculateBill());

		Product grocProd = new Product();
		grocProd.setPrice(2000);
		grocProd.setProductType("grocerry");

		
		app.setUser(customer);
		app.setProduct(grocProd);
		
		// Display the calculation of final bill for particular product and User
		System.out.println(" Groc_ Employee Final Bill  "+ app.calculateBill());
		
		
	}
}
