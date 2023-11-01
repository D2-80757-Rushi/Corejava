package com.Rushi.classes;

import java.util.Scanner;

public class Toy extends Product {

	private String ageGroup;
	private String type;
	
	public Toy() {
		this.setDiscount(5);
	}
	
	public Toy(String title, double price, double gST, double discount, String ageGroup, String type) {
		super(title, price, gST, discount);
		this.setDiscount(5);
		this.ageGroup = ageGroup;
		this.type = type;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}

	@Override
	public double getGST() {
		// TODO Auto-generated method stub
		return super.getGST();
	}

	@Override
	public void setGST(double gST) {
		// TODO Auto-generated method stub
		super.setGST(gST);
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return super.getDiscount();
	}

	@Override
	public void setDiscount(double discount) {
		// TODO Auto-generated method stub
		super.setDiscount(discount);
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return super.calculateBill();
	}

	@Override
	public double calculateRevenue() {
		// TODO Auto-generated method stub
		return super.calculateRevenue();
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter Details of Toy:");
		super.acceptData(sc);
		System.out.print("Age Group:");
		this.ageGroup=sc.next();
		System.out.print("Type:");
		this.type=sc.next();
		}
	
}
