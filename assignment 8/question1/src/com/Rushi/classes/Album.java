package com.Rushi.classes;

import java.util.Scanner;

public class Album extends Product {

	private String singer;
	private String musician;
	
	public Album() {
		this.setGST(10);
	}

	
	public Album(String title, double price, double gST, double discount, String singer, String musician) {
		super(title, price, gST, discount);
		this.setGST(10);
		this.singer = singer;
		this.musician = musician;
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
	@Override
	public void acceptData(Scanner sc) {
		System.out.println("Enter Details of Album:");
		super.acceptData(sc);
		System.out.print("Singer:");
		this.singer=sc.next();
		System.out.print("Muscician:");
		this.musician=sc.next();
		}
}
