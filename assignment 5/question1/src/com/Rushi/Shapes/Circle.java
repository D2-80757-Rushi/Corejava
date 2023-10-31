package com.Rushi.Shapes;

public class Circle extends BoundedShape {
	double radius;
	public Circle() {
		
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		
		return 0;
	}

}
