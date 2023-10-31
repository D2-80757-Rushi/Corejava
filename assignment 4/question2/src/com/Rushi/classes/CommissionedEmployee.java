package com.Rushi.classes;

import java.util.Scanner;

public class CommissionedEmployee extends Employee {
	private int grossSales;
	private double commisionRate;
	
	public CommissionedEmployee() {
		
	}
	public CommissionedEmployee(String firstName, String lastName, int socialSecurityNumber, int grossSales,
			double commisionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	@Override
	public void acceptData(Scanner sc)
	{
		System.out.print("Enter First Name:");
		this.setFirstName(sc.next());
		System.out.print("Enter Last Name:");
		this.setLastName(sc.next());
		System.out.print("Enter SSN:");
		this.setSocialSecurityNumber(sc.nextInt());
		System.out.print("Enter Gross Sales:");
		this.setGrossSales(sc.nextInt());
		System.out.print("Enter Commision Rate:");
		this.setCommisionRate(sc.nextDouble());
	}
	@Override
	public double calculateEarnings() {
		return this.grossSales*this.commisionRate;
	}

}
