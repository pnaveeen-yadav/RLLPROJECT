package com.java.cms;

public class Menu {
	
	private int menuId  ;
	private int restaurantId;
	private String ItemName;
	private String MenuType;
	private int Calories;
    private int price;

	
	
	public int getmenuId () {
		return menuId ;
	}
	public void setmenuId (int menuId ) {
		this.menuId  =menuId ;
	}
	public int getrestaurentId() {
		return restaurantId;
	}
	public void setrestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	public String getMenuType() {
		return MenuType;
	}
	public void setMenuType(String MenuType) {
		this.MenuType =MenuType;
	}
	
	public int getcalories() {
		return Calories;
	}
	public void setCalories(int Calories) {
		this.Calories=Calories;
	}
    public int getprice() {
        return price;
    }
    public void setprice(int Price){
         this.price=Price;
    }
	
	@Override
	public String toString() {
		return "menu [menuId =" + menuId  + ",menuId="+menuId+", restaurantId=" + restaurantId+ ", ItemName="
				+ ItemName + ", MenuType=" + MenuType +", Calories=" + Calories
				+ ",Price="+ price +"]";
	}

}
