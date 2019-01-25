package com.onlineshopping.discount;
import com.onlineshopping.payment.Payment;
import com.onlineshopping.products.Product;
import com.onlineshopping.users.User;

/* ShoppingApp class is used for calculate the bill   
 *  
 * @variable : We can check the type of User   
 * @varible :  Provide the information for the product
 * 
 */

public class ShoppingApp implements Payment {

	
	private User user;
	Product product;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/* Create the final bill calculation as per the user and type of Product   
	 *  
	 * Provide the info like Discount, Product Type and Price of every product   
	 * 
	 * Calculate the logic of static discount of 5 $ per every 100 $ 
	 * 
	 * @Return : Give the final amount of bill
	 */
	

	public int calculateBill() {
		int disc=this.user.discount();
		int price = this.product.getPrice();
		if(this.product.getProductType().equalsIgnoreCase("Non grocerry")) {
			disc=0 ;
		}
		price= price- (price*disc/100);
		
		int multiplOfHundrade= price/100;
	    int finalBill= price-STATICDISC*multiplOfHundrade;
		return finalBill;
	}

		public boolean paymentStatus() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	
}
