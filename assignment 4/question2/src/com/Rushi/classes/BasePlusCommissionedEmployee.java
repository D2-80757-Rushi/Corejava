package com.Rushi.classes;

import java.util.Scanner;

public class BasePlusCommissionedEmployee extends CommissionedEmployee {

	private double baseSalary;
	
	public BasePlusCommissionedEmployee(String firstName, String lastName, int socialSecurityNumber, int grossSales,
			double commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		this.baseSalary = baseSalary;
	}
	public BasePlusCommissionedEmployee() {
		// TODO Auto-generated constructor stub
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
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
		System.out.print("Enter Base Salary:");
		this.setBaseSalary(sc.nextDouble());
	}

	@Override
	public double calculateEarnings() {
		return (this.getGrossSales()*this.getCommisionRate()+this.baseSalary);
	}

}
