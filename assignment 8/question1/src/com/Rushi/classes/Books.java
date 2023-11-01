package com.Rushi.classes;

import java.util.Scanner;

public class Books extends Product {
private int ISBN;
private String subject;

public Books() {
	super();
	this.setGST(0);
}
public Books(int iSBN, String subject) {
	super();
	this.setGST(0);
	ISBN = iSBN;
	this.subject = subject;
}
@Override
public String getTitle() {
	return super.getTitle();
}
@Override
public void setTitle(String title) {
	super.setTitle(title);
}
@Override
public double getPrice() {
	return super.getPrice();
}
@Override
public void setPrice(double price) {
	super.setPrice(price);
}
@Override
public double getGST() {
	return super.getGST();
}
@Override
public void setGST(double gST) {
	super.setGST(gST);
}
@Override
public double getDiscount() {
	return super.getDiscount();
}
@Override
public void setDiscount(double discount) {
	super.setDiscount(discount);
}
@Override
public double calculateBill() {
	return super.calculateBill();
}
@Override
public double calculateRevenue() {
	return super.calculateRevenue();
}
@Override
public void acceptData(Scanner sc) {
	System.out.println("Enter Details of Book:");
	super.acceptData(sc);
	System.out.print("ISBN:");
	this.ISBN=sc.nextInt();
	System.out.print("Subject:");
	this.subject=sc.next();
	}

}
