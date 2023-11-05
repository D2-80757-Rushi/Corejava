package com.Rushi.classes;

import java.util.Scanner;

public class Clerk implements Employee {
	private double salary;
	
	public Clerk() {
		
	}
	public Clerk(double salary) {
		super();
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double getSal() {
		return this.salary;
	}
	public void accept(Scanner sc) {
		System.out.println("Enter Details of Clerk:");
		System.out.print("Enter Salary:");
		this.salary=sc.nextDouble();
	}
}
