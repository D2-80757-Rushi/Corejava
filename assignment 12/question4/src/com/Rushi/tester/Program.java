package com.Rushi.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import com.Rushi.classes.Employee;

public class Program {

    public static int menu(Scanner sc) {
        int choice = 0;
        System.out.println("0.EXIT");
        System.out.println("1.ADD NEW EMPLOYEE");
        System.out.println("2.REMOVE EMPLOYEE");
        System.out.println("3.PEEK TOPMOST EMPLOYEE");
        System.out.print("ENTER YOUR CHOICE:");
        choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
    	class EmployeeDescSalaryComparator implements Comparator<Employee>{
			@Override
			public int compare(Employee one, Employee two) {
				return -Double.compare(one.getMonthlySalary(), two.getMonthlySalary());
			}
    	}
        Queue<Employee> records = new PriorityQueue<Employee>(new EmployeeDescSalaryComparator());
        Scanner sc = new Scanner(System.in);
        int choice;
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:// ADD NEW EMPLOYEE
                	Employee temp = new Employee();
                    temp.accept(sc);
                    records.offer(temp);
                    System.out.println("Employee Added Successfully !");
                    break;
                case 2:// REMOVE EMPLOYEE
                	Employee removed=records.poll();
                	System.out.println("Removed Employee"+removed);
                    break;
                case 3://PEEK FRONTMOST EMPLOYEE
                	Employee peeked=records.peek();
                	System.out.println("FrontMost Employee"+peeked);
                default:
                    System.out.println("INVALID CHOICE ENTER AGAIN !");
                    break;
            }
        }

    }
}
