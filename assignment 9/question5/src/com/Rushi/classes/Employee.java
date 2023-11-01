package com.Rushi.classes;

import java.util.Scanner;

public abstract class Employee extends Person {
	private int id;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	public double calculateSalary() {
		return this.salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.print("ID:");
		this.id=sc.nextInt();
		System.out.print("Salary:");
		this.salary=sc.nextDouble();
	}

	@Override
	public String toString() {
		return String.format("%s\nID:%s\nSalary:%s",super.toString(),this.id,this.salary);
	}
	
}
