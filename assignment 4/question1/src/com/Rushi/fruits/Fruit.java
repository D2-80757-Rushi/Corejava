package com.Rushi.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit() {
		this.setFresh(true);
	}
	
	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
		this.setFresh(true);
	}

	public  String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public String taste()
	{
		return "no specific taste";
	}
	public String toString() {
		return "\nFruit:"+this.getClass().getSimpleName()+"\nColor:"+this.getColor()+"\nWeight:"+this.getWeight()+"\nName:"+this.getName()+"\nisFresh:"+this.isFresh();
	}
	public void acceptData(Scanner sc)
	{
		System.out.println("Enter "+this.getClass().getSimpleName()+" Details:");
		System.out.print("Color:");
		this.color=sc.next();
		System.out.print("Weight:");
		this.weight=sc.nextDouble();
		System.out.print("Name:");
		this.name=sc.next();
	}
}
