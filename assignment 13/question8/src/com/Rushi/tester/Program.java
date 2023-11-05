package com.gaurav.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gaurav.classes.Clerk;
import com.gaurav.classes.Employee;
import com.gaurav.classes.Labour;
import com.gaurav.classes.Manager;

public class Program {
	public static int menu(Scanner sc){
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD MANAGER");
		System.out.println("2.ADD LABOUR");
		System.out.println("3.ADD CLERK");
		System.out.println("4.CALCULATE TOTAL SALARY OF ALL EMPLOYEES");
		System.out.print("ENTER YOUR CHOICE:");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		List<Employee> records= new ArrayList<Employee>();
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:	//ADD A MANAGER
				Manager m=new Manager();
				m.accept(sc);
				records.add(m);
				break;
			case 2:	//ADD LABOUR
				Labour l=new Labour();
				l.accept(sc);
				records.add(l);
				break;
			case 3:	//ADD CLERK
				Clerk c=new Clerk();
				c.accept(sc);
				records.add(c);
				break;
			case 4:	//CALCULATE TOTAL SALARY OF ALL EMPLOYEES
				System.out.println("Total Employee Salary:"+Employee.calcTotalIncome(records)); 
				break;
			default:
				break;
			}
		}
	}
}