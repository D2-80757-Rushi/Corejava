package com.Rushi.classes;

import java.util.Scanner;

public class Labour extends Employee {
	private double rate;
	private int hours;
	public Labour() {
	}
	public Labour(String name, int age, int id, double salary, double rate, int hours) {
		super(name, age, id, salary);
		this.rate = rate;
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public double calculateSalary() {
		return this.rate*this.hours;
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
		System.out.print("Name:");
		super.setName(sc.next());
		System.out.print("Age:");
		super.setAge(sc.nextInt());
		System.out.print("ID:");
		super.setId(sc.nextInt());
		System.out.print("Rate:");
		this.rate=sc.nextDouble();
		System.out.print("Hours:");
		this.hours=sc.nextInt();
		this.setSalary(0);
	}
	@Override
	public String toString() {
		return String.format("%s\nRate:%s\nHours:%s",super.toString(),this.rate,this.hours);
	}
}
