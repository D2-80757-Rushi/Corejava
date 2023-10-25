package com.app.geometry;

import java.util.Scanner;

public class TestPoint{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y co-ordinates for point1");
		Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter x and y co-ordinates for point2");
		Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());
		
		String point1 = p1.getDetails();
		System.out.println(point1);
		
		String point2 = p2.getDetails();
		System.out.println(point2);
		
		if(!p1.isEqual(p2)) {
			System.out.println(p1.calculateDistance(sc, p2));
		}
		else {
			System.out.println("Points are equal");
		}
	}
}


