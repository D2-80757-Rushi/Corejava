package com.gaurav.tester;
import java.util.Scanner;

import com.gaurav.classes.*;
public class Program {
	public static int Menu(Scanner sc) {
		System.out.println("0.EXIT");
		System.out.println("1.CALCULATE SALARY OF HOURLY EMPLOYEE");
		System.out.println("2.CALCULATE SALARY OF COMMISSIONED EMPLOYEE");
		System.out.println("3.CALCULATE SALARY OF BASE + COMISSIONED EMPLOYEE");
		System.out.print("ENTER YOUR CHOICE:");
		int choice=sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		Employee obj;
		Scanner sc=new Scanner(System.in);
		int choice;
		while((choice=Menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				//CALCULATE SALARY OF HOURLY EMPLOYEE
				obj=new HourlyEmployee();
				obj.acceptData(sc);
				System.out.println("Total Earnings:"+obj.calculateEarnings());
				break;
			case 2:
				//CALCULATE SALARY OF COMMISSIONED EMPLOYEE
				obj=new CommissionedEmployee();
				obj.acceptData(sc);
				System.out.println("Total Earnings:"+obj.calculateEarnings());
				break;
			case 3:
				//CALCULATE SALARY OF BASE + COMISSIONED EMPLOYEE
				obj=new BasePlusCommissionedEmployee();
				obj.acceptData(sc);
				System.out.println("Total Earnings:"+obj.calculateEarnings());
				break;
			default:
				System.out.println("INVALID CHOICE !!!");
				break;
			}
		}

	}

}
