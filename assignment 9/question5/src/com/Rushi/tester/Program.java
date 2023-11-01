package com.gaurav.tester;

import java.util.Scanner;

import com.gaurav.classes.Clerk;
import com.gaurav.classes.Labour;
import com.gaurav.classes.Person;
import com.gaurav.classes.Persons;
import com.gaurav.classes.Salesman;

public class Program {
	public static int Menu(Scanner sc) {
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD EMPLOYEES");
		System.out.println("2.CALCULATE AVG SALARY OF ALL SALESMANS");
		System.out.println("3.CALCULATE AVG SALARY OF ALL CLERKS");
		System.out.println("4.CALCULATE AVG SALARY OF LABOURS");
		System.out.print("ENTER YOUR CHOICE:");
		choice = sc.nextInt();
		return choice;
	}
	public static int subMenu(Scanner sc)
	{
		int choice;
		System.out.println("0.BACK");
		System.out.println("1.ADD CLERK");
		System.out.println("2.ADD LABOUR");
		System.out.println("3.ADD SALESMAN");
		System.out.print("ENTER YOUR CHOICE:");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfEmployees;
		System.out.print("How Many Employees Do You Have:");
		noOfEmployees=sc.nextInt();
		Person arr[]=new Person [noOfEmployees];
		int index=0;
			int choice;
			while ((choice = Menu(sc)) != 0) {
				switch (choice) {
				case 1:// ADD EMPLOYEES
					if(index<arr.length)
					{
						int choice2;
						while((choice2 = subMenu(sc)) != 0)
						{
							switch (choice2) {
							case 1:	//ADD CLERK
									arr[index]=new Clerk();
									arr[index].acceptData(sc);
									index++;
								break;
							case 2:	//ADD LABOUR
								arr[index]=new Labour();
								arr[index].acceptData(sc);
								index++;
							break;
							case 3:	//ADD SALESMAN
								arr[index]=new Salesman();
								arr[index].acceptData(sc);
								index++;
							break;
							default:
								System.out.println("INVALID CHOICE");
								break;
							}
						}
					}
					else
					{
						System.out.println("CANNOT ADD MORE EMPLOYEES");
					}
					break;
				case 2:// CALCULATE AVG SALARY OF ALL SALESMANS
					System.out.println("Average Salary of All Salesman:"+Persons.averageSalSalesman(arr));
					break;
				case 3:// CALCULATE AVG SALARY OF ALL CLERKS
					System.out.println("Average Salary of All Salesman:"+Persons.averageSalClerks(arr));
					break;
				case 4:// CALCULATE AVG SALARY OF ALL LABOURS
					System.out.println("Average Salary of All Salesman:"+Persons.averageSalLabours(arr));
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
