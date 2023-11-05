package com.Rushi.classes;

import java.util.Scanner;

public class Labour implements Employee {

	private double rate;
	private int hours;
	
	public Labour() {
		// TODO Auto-generated constructor stub
	}
	
	public Labour(double rate, int hours) {
		super();
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
	public double getSal() {
		return rate*hours;
	}
	@Override
	public double calcIncentives() {
		if(this.hours>300)
			return this.getSal()*0.05;
		else
			return 0.0;
	}
	public void accept(Scanner sc) {
		System.out.println("Enter Details of Labour:");
		System.out.print("Enter Rate:");
		this.rate=sc.nextDouble();
		System.out.print("Enter Hours:");
		this.hours=sc.nextInt();
	}

}
