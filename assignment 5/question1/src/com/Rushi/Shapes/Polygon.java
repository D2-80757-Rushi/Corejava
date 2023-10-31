package com.Rushi.Shapes;

public abstract class Polygon extends BoundedShape {
	private int noOfSides;
	public Polygon() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNoOfSides() {
		return noOfSides;
	}

	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}
}
