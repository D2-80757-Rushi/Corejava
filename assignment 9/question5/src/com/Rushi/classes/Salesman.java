package com.Rushi.classes;

import java.util.Scanner;

public class Salesman extends Employee {
	public int target;
	public double commision;
	
	public Salesman() {
		// TODO Auto-generated constructor stub
	}
	
	public Salesman(String name, int age, int id, double salary, int target, double commision) {
		super(name, age, id, salary);
		this.target = target;
		this.commision = commision;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	@Override
	public double calculateSalary() {
		return this.getSalary()+(this.commision*this.target);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}

	@Override
	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary);
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.print("Target:");
		this.target=sc.nextInt();
		System.out.print("Commision:");
		this.commision=sc.nextDouble();
	}
	@Override
	public String toString() {
		return String.format("%s\nTarget:%s\nCommision:%s",super.toString(),this.target,this.commision);
	}	
	
}
