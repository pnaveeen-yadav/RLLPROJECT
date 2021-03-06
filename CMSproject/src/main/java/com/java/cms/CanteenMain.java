package com.java.cms;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CanteenMain {
	
static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("---------------");
			System.out.println("1. Show Restaurant ");
			System.out.println("2. Search Restaurant");
			System.out.println("3. Show Menu");
			System.out.println("4. Search Menu");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				showRestaurant();
				break;
			case 2 : 
				try {
					searchRestaurant();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3 :
				showMenu();
				break;
			case 4 :
				searchMenu();
			case 5 : 
				return;
			}
		} while(choice!=5);
	}
	private static void searchMenu() {
		int mid;
		System.out.println("Enter MenuId  ");
		mid = sc.nextInt();
		Menu menu = new MenuDAO().searchMenu(mid);
		System.out.println(menu);
		
	}
	private static void showMenu() {
		// TODO Auto-generated method stub
		
	}
	public static void searchRestaurant() throws ClassNotFoundException, SQLException {
		int rid;
		System.out.println("Enter Restaurant id   ");
		rid = sc.nextInt();
		Restaurant restaurant = new RestaurantDAO().searchRestaurant(rid);
		System.out.println(restaurant);
	}
	public static void showRestaurant() {
		try {
			List<Restaurant> restaurantList = new RestaurantDAO().showRestaurant();
			for (Restaurant restaurant : restaurantList) {
				System.out.println(restaurant);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
