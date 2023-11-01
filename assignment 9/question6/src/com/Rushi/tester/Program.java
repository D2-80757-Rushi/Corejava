package com.Rushi.tester;

import java.util.Scanner;

import com.gaurav.classes.Person;

public class Program {
	public static int Menu(Scanner sc)
	{
		System.out.println("0.EXIT");
		System.out.println("1.ACCEPT PERSON");
		System.out.println("2.DISPLAY ALL PEOPLE");
		System.out.print("3.FIND A PERSON BY NAME:");
		int choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfPersons;
		System.out.print("How Many Persons Do You Want:");
		noOfPersons=sc.nextInt();
		Person arr[]=new Person [noOfPersons];
		int index=0;
			int choice;
			while ((choice = Menu(sc)) != 0) {
				switch (choice) {
				case 1://ADD PERSON
					if(index<arr.length)
					{
						arr[index]=new Person();
						arr[index].accept(sc);
						index++;
						break;
					}
					else
					{
						System.out.println("CANNOT ADD MORE PERSON");
					}
					break;
				case 2:	//DISPLAY ALL PEOPLE
					for(int i=0;i<arr.length;i++)
					{
						System.out.println("Details of Person Are:\n"+arr[i]);
					}		
				case 3:	//FIND PERSON BY NAME
					System.out.print("Enter Name To Search:");
					String name=sc.next();
					for(int i=0;i<arr.length;i++)
					{
						if(name==arr[i].getName())
						{
							System.out.println("Person Found at Index:"+i);
						}
					}
					break;
				default:
						System.out.println("INVALID CHOICE");
					break;
				}	
			System.out.println("Thank You..!");
			sc.close();
		}
	}
}
