package com.src;

public class Customer {
	static int id;
	static String name;
	 static int giftprice;
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static  int getGiftprice() {
		return giftprice;
	}
	public void setGiftprice(int giftprice) {
		this.giftprice = giftprice;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(int id, String name,int giftprice) {
		super();
		this.id = id;
		this.giftprice = giftprice;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer[id=" + id + ", name=" + name + ", giftprice=" + giftprice + "]";
				
	}
	
	

	
	

}
