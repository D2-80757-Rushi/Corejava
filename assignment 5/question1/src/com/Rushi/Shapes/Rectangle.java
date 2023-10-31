package com.Rushi.Shapes;

public class Rectangle extends Polygon {
	private double length;
	private double breadth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	@Override
	public double calcArea() {
		return this.length*this.breadth;
	}
	
}
