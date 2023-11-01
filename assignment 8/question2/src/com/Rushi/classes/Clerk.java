package com.Rushi.classes;

import java.util.Scanner;

public class Clerk extends Employee {

	public Clerk() {
		super();
	}
	
	public Clerk(String name, int age, int id, double salary) {
		super(name, age, id, salary);
	}
	@Override
	public double calculateSalary() {
		return super.calculateSalary();
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public void setId(int id) {
		super.setId(id);
	}

	@Override
	public double getSalary() {
		return super.getSalary();
	}

	@Override
	public void setSalary(double salary) {
		super.setSalary(salary);
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
	}

	@Override
	public String toString() {
		return super.toString();
	}	
	
}
