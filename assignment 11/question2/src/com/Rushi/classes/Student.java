package com.Rushi.classes;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable {
	private int roll;
	private String name;
	private String city;
	private double marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, marks, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city);
	}

	@Override
	public int compareTo(Object other) {
		Student s=(Student) other;
		return this.roll-s.getRoll();
	}
	
}
