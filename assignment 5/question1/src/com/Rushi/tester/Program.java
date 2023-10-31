package com.Rushi.tester;
import java.util.Scanner;

import com.Rushi.Shapes.*;
public class Program {
	public static int Menu(Scanner sc)
	{
		System.out.println("0.EXIT");
		System.out.println("1.CACULATE AREA OF TRIANGLE");
		System.out.println("2.CACULATE AREA OF RECTANGLE");
		System.out.println("3.CACULATE AREA OF SQUARE");
		System.out.print("ENTER YOUR CHOICE:");
		int choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		BoundedShape ref;
		Scanner sc=new Scanner(System.in);
		int choice;
		while((choice=Menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				System.out.println("Enter Details of Triangle");
				System.out.print("Enter Side-1:");
				double a=sc.nextDouble();
				System.out.print("Enter Side-2:");
				double b=sc.nextDouble();
				System.out.print("Enter Side-3:");
				double c=sc.nextDouble();
				ref=new Triangle(a,b,c);
				System.out.println("Area Of Tringle:"+ref.calcArea());
				break;
			case 2:
				System.out.println("Enter Details of Rectangle");
				System.out.print("Enter Length:");
				double l=sc.nextDouble();
				System.out.print("Enter Breadth:");
				double br=sc.nextDouble();
				ref=new Rectangle(l,br);
				System.out.println("Area Of Rectangle:"+ref.calcArea());
				break;
			case 3:
				System.out.println("Enter Details of Square");
				System.out.print("Enter Side:");
				double d=sc.nextDouble();
				ref=new Square(d);
				System.out.println("Area Of Square:"+ref.calcArea());
				break;
			default:
				System.out.println("INVALID CHOICE ENTER AGAIN");
				break;
			}
		}
		System.out.println("Thank You..!");
		sc.close();
	}

}
