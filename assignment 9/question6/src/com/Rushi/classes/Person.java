package com.Rushi.classes;

import java.util.Scanner;

enum EGENDER{
	MALE,FEMALE,NA
}
public class Person {
	private String name;
	private int age;
	private EGENDER gender;
	public Person(){
		
	}
	public Person(String name,int age, EGENDER gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private void menu(Scanner sc) {
		System.out.println("1.MALE");
		System.out.println("2.FEMALE");
		System.out.print("ENTER YOUR CHOICE:");
		int choice=sc.nextInt();
		if(choice==1)
			this.gender=EGENDER.MALE;
		else if(choice==2)
			this.gender=EGENDER.FEMALE;
		else
			this.gender=EGENDER.NA;
	}
	public void accept(Scanner sc)
	{
		System.out.println("Enter Details of Person:");
		System.out.print("Name:");
		this.name=sc.next();
		System.out.print("Age:");
		this.age=sc.nextInt();
		System.out.print("Gender:\n");
		this.menu(sc);
	}
	public String toString()
	{
		return "Name:"+this.name+"\nAge:"+this.age+"\nGender:"+this.gender;
	}
}
