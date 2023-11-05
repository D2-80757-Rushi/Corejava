package com.Rushi.classes;

import java.util.Scanner;

public class Manager implements Employee {

	private double basicSalary;
	private double dearanceAllowance;
	
	public Manager() {
		
	}
	
	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		return basicSalary+dearanceAllowance;
	}
	@Override
	public double calcIncentives() {
		// TODO Auto-generated method stub
		return basicSalary*0.2;
	}
	public void accept(Scanner sc) {
		System.out.println("Enter Details of Manager:");
		System.out.print("Enter Basic Salary:");
		this.basicSalary=sc.nextDouble();
		System.out.print("Enter Dearance Allowance:");
		this.basicSalary=sc.nextDouble();
	}

}
