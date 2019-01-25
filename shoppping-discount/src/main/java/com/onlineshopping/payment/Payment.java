package com.onlineshopping.payment;

public interface Payment {

	public static final int STATICDISC = 5;
	public int calculateBill();
	public boolean paymentStatus(); 
}
