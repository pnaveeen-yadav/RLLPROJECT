package com.java.cms;

public class Restaurant {
	
	private int restaurantId  ;
	private String restaurantName;
	private String restaurantCity;
	private String restaurantBranch;
	private String restaurantEmail;
	private String restaurantContactNo;

	
	
	public int getrestaurantId () {
		return restaurantId ;
	}
	public void setrestaurantId (int restaurantId ) {
		this.restaurantId  =restaurantId ;
	}
	public String getrestaurantName() {
		return restaurantName;
	}
	public void setrestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getrestaurentCity() {
		return restaurantCity;
	}
	public void setrestaurantCity(String restaurantCity) {
		this.restaurantCity = restaurantCity;
	}
	public String getrestaurantBranch() {
		return restaurantBranch;
	}
	public void setrestaurantBranch(String restaurantBranch) {
		this.restaurantBranch = restaurantBranch;
	}
	public String getrestaurantEmail() {
		return restaurantEmail;
	}
	public void setrestaurantEmail(String restaurantEmail) {
		this.restaurantEmail =restaurantEmail;
	}
	
	public String getrestaurentContactNo() {
		return restaurantContactNo;
	}
	public void setrestaurantContactNo(String restaurantContactNo) {
		this.restaurantContactNo=restaurantContactNo;
	}
	
	@Override
	public String toString() {
		return "Restaurant [restaurantId =" + restaurantId  + ",restaurantName="+restaurantName+", restaurantCity=" + restaurantCity+ ", restaurantBranch="
				+ restaurantBranch + ", restaurantEmail=" + restaurantEmail +", restaurantContactNo=" + restaurantContactNo
				+ "]";
	}


}
