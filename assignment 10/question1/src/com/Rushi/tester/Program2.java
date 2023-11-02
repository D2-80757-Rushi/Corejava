package com.Rushi.tester;

import com.Rushi.classes.Box;
import com.Rushi.classes.Clerk;
import com.Rushi.classes.Employee;
import com.Rushi.classes.Labour;
import com.Rushi.classes.Salesman;

public class Program2 {

	public static void main(String[] args) {
		Box <Employee> b1=new Box<>(new Labour("Majdoor",23,101,50025.98,100.25,4));
		System.out.println("Salary:"+ b1.getSalary());
		
		Box <Employee> b2=new Box<>(new Salesman("Seller", 55, 202, 10000, 5, 1000));
		System.out.println("Salary:"+ b2.getSalary());
		
		Box<Employee> b3=new Box<>(new Clerk("Chaprasi",48,303,15500));
		System.out.println("Salary:"+ b3.getSalary());
	}
}
