package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public Menu showMenuById(int menuId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Menu where menuId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, (int) menuId);
		ResultSet rs = pst.executeQuery();
		Menu menu = null;
		if (rs.next()) {
			menu = new Menu();
			menu.setmenuId(rs.getInt("menuId"));
            menu.setrestaurantId(rs.getInt("restaurentId"));
			menu.setItemName(rs.getString("itemName"));
			menu.setMenuType(rs.getString("menuType"));
			menu.setCalories(rs.getInt("Calories"));
			menu.setprice(rs.getInt("price"));
		}
		return menu;
	}
	
	public List<Menu> showMenu(int restaurantId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Menu ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Menu> menuList = new ArrayList<Menu>();
		Menu menu = null; 
		while(rs.next()) {
			menu = new Menu();
			menu.setmenuId(rs.getInt("menuId"));
            menu.setrestaurantId(rs.getInt("restaurentId"));
			menu.setItemName(rs.getString("itemName"));
			menu.setMenuType(rs.getString("menuType"));
			menu.setCalories(rs.getInt("Calories"));
			menu.setprice(rs.getInt("price"));
			menuList.add(menu);
		}
		return menuList; //leaveDetails
	}

	public Menu searchMenu(int mid) {
		// TODO Auto-generated method stub
		return null;
	}


}
