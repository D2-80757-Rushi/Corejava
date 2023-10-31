package com.Rushi.Shapes;

public class Square extends Polygon {
	private double side;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public Square(double side) {
		super();
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public double calcArea() {
		return this.side*this.side;
	}
}
