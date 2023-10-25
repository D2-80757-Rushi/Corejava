package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		return "("+this.x + " ,"+this.y+")";
	}
	
	public boolean isEqual(Point2D point) {
		if((this.x == point.x) && (this.y == point.y)) {
			return true;
		}
		else {
			return false;
		}
	}
	public double calculateDistance(Scanner sc,Point2D p2) {
		double distance = Math.sqrt(Math.pow((p2.x - this.x),2) + Math.pow((p2.y - this.y),2));
		return distance;
	}
}
	


