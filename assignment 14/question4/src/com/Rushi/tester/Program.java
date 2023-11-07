package com.Rushi.tester;
import com.Rushi.classes.*;

import java.util.Scanner;

public class Program{
	
	public static int menu(Scanner sc){
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD");
		System.out.println("2.SUBTRACT");
		System.out.println("3.MULTIPLY");
		System.out.println("4.DIVIDE");
		System.out.print("ENTER YOUR CHOICE:");
		choice=sc.nextInt();
		return choice;
	}
	static void calculate(double a, double b, Aritmetic op) {
		double result =op.calc(a, b);	//calc is an abstact method in Functional Interface Aritmetic
		System.out.println("Result:"+result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x,y=0;
		int choice;
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:	//ADD
				System.out.print("Enter num1:");
				x=sc.nextDouble();
				System.out.print("Enter num2:");
				y=sc.nextDouble();
				Program.calculate(x, y, (a,b)-> a+b );
				break;
			case 2:	//SUBTRACT
				System.out.print("Enter num1:");
				x=sc.nextDouble();
				System.out.print("Enter num2:");
				y=sc.nextDouble();
				Program.calculate(x, y, (a,b)-> a-b );
				break;
			case 3://MULTIPLY
				System.out.print("Enter num1:");
				x=sc.nextDouble();
				System.out.print("Enter num2:");
				y=sc.nextDouble();
				Program.calculate(x, y, (a,b)-> a*b );
				break;
			case 4: //DIVIDE
				System.out.print("Enter num1:");
				x=sc.nextDouble();
				System.out.print("Enter num2:");
				y=sc.nextDouble();
				Program.calculate(x, y, (a,b)-> a/b );
				break;
			default:
				System.out.println("INVAILD CHOICE ENTER AGAIN!");
				break;
			}
		}
	}
}
