package com.Rushi.classes;

import java.util.Scanner;

public abstract class Product {
	private String title;
	private double price;
	private double GST;
	private double discount;

	public Product() {
		super();
	}
	
	public Product(String title, double price, double gST, double discount) {
		super();
		this.title = title;
		this.price = price;
		GST = gST;
		this.discount = discount;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getGST() {
		return GST;
	}
	
	public void setGST(double gST) {
		GST = gST;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double calculateBill() {
		double finalPrice=(this.price - this.price*(this.discount/100));
		finalPrice= finalPrice + finalPrice*(this.GST/100);
		return finalPrice;
	}
	public double calculateRevenue() {
		double revenue=(this.price - this.price*(this.discount/100));
		return revenue;
	}
	public double calculateGST() {
		double finalPrice=(this.price - this.price*(this.discount/100));
		return finalPrice*(this.GST/100);
	}
	
	public void acceptData(Scanner sc) {
		System.out.print("Title:");
		this.title=sc.next();
		System.out.print("Price:");
		this.price=sc.nextDouble();
		System.out.print("Discount:");
		this.discount=sc.nextDouble();
		}
}
