package com.Rushi.classes;

import java.lang.Comparable;
import java.util.Scanner;
public class Employee implements Comparable<Employee>{
	private int id;
    private String name;
    private double monthlySalary;
    
	public Employee() {
	}

	public Employee(int id, String name, double monthlySalary) {
		super();
		this.id = id;
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	public void accept(Scanner sc) {
		System.out.println("Enter Employee Details:");
		System.out.print("ID:");
		this.id=sc.nextInt();
		System.out.print("Name:");
		this.name=sc.next();
		System.out.print("Monthly Salary:");
		this.monthlySalary=sc.nextDouble();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id ;
	}
	@Override
	public int compareTo(Employee other) {
		return this.id-other.getId();
	}

	@Override
	public String toString() {
		return "\nID:" + id + "\nName:" + name + "\nMonthlySalary:" + monthlySalary;
	}
    
}
