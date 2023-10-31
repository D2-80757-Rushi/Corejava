package com.Rushi.classes;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private double hoursWorked;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String firstName, String lastName, int socialSecurityNumber,double hourlyWage,double hoursWorked) {
		super(firstName, lastName, socialSecurityNumber);
		this.hourlyWage=hourlyWage;
		this.hoursWorked=hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
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
		System.out.print("Enter Hourly Wage:");
		this.setHourlyWage(sc.nextDouble());
		System.out.print("Enter Hours Worked:");
		this.setHoursWorked(sc.nextDouble());
	}
	

	@Override
	public double calculateEarnings() {
		if(this.hoursWorked<40)
		{
			return this.hourlyWage*this.hoursWorked;
		}
		else
		{
			return (this.hourlyWage*40+(this.hoursWorked-40)*1.5*this.hourlyWage);
		}
	}

}
