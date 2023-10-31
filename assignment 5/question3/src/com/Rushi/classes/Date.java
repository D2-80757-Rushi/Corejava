package com.Rushi.classes;

public class Date implements Cloneable {
	private int day;
	private int month;
	private int year;

	@Override
	public Object clone() throws CloneNotSupportedException {
		Date temp = (Date) super.clone();
		return temp;
	}

	public Date() {

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

}
