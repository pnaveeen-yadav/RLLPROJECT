package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public Restaurant searchRestaurant(int restaurantId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurant where restaurantId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, restaurantId);
		ResultSet rs = pst.executeQuery();
		Restaurant restaurant = null;
		if (rs.next()) {
			restaurant = new Restaurant();
			restaurant.setrestaurantId(rs.getInt("restaurentId"));
			restaurant.setrestaurantName(rs.getString("restaurentName"));
			restaurant.setrestaurantCity(rs.getString("restaurantCity"));
			restaurant.setrestaurantBranch(rs.getString("restaurantBranch"));
			restaurant.setrestaurantEmail(rs.getString("restaurantEmail"));
			restaurant.setrestaurantContactNo(rs.getString("restaurantContactNo"));
		}
		return restaurant;
	}
	
	public List<Restaurant> showRestaurant() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurent ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		Restaurant restaurant = null; 
		while(rs.next()) {
			restaurant = new Restaurant();
			restaurant.setrestaurantId(rs.getInt("restaurantId"));
			restaurant.setrestaurantName(rs.getString("restaurantName"));
			restaurant.setrestaurantCity(rs.getString("restaurantCity"));
			restaurant.setrestaurantBranch(rs.getString("restaurantBranch"));
			restaurant.setrestaurantEmail(rs.getString("restaurantEmail"));
			restaurant.setrestaurantContactNo(rs.getString("restaurantContactNo"));
			restaurantList.add(restaurant);
		}
		return restaurantList; //leaveDetails
	}


}
