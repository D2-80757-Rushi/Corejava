package com.Rushi.classes;

import java.util.Scanner;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private int socialSecurityNumber;

	public Employee() {
		
	}

	public Employee(String firstName, String lastName, int socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public void acceptData(Scanner sc)
	{
		System.out.print("Enter First Name:");
		this.firstName=sc.next();
		System.out.print("Enter Last Name:");
		this.lastName=sc.next();
		System.out.print("Enter SSN:");
		this.socialSecurityNumber=sc.nextInt();
	}

	public abstract double calculateEarnings();
	
}
