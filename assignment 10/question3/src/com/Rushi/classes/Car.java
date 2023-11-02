package com.Rushi.classes;

public class Car{
	private String name;
	private double engineCapacity;
	private double milage;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String name, double engineCapacity, double milage) {
		super();
		this.name = name;
		this.engineCapacity = engineCapacity;
		this.milage = milage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public String toString() {
		return (new StringBuilder().append("\nName:").append(this.name).append("\nEngineCapacity:").append(this.engineCapacity).append("\nMilage:").append(this.milage)).toString();
	}
}
