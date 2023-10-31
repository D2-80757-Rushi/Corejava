package com.Rushi.classes;

public class SalarisedEmployee extends Employee{
	private double weeklySalary;
	
	public SalarisedEmployee() {
		super();
	}

	public SalarisedEmployee(String firstName, String lastName, int socialSecurityNumber,double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary=weeklySalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double calculateEarnings() {
		return weeklySalary*4;
	}
}
