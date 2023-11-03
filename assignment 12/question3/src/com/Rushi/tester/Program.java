package com.Rushi.tester;

//add, delete, ﬁnd, sort, edit
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.Rushi.classes.Employee;

public class Program {
    public static int menu(Scanner sc) {
        int choice = 0;
        System.out.println("0.EXIT");
        System.out.println("1.ADD EMPLOYEE");
        System.out.println("2.DELETE EMPLOYEE");
        System.out.println("3.FIND EMPLOYEE");
        System.out.println("4.SORT EMPLOYEE LISY BY ID");
        System.out.println("5.DELETE ALL EMPLOYEE RECORDS");
        System.out.println("6.EDIT EMPLOYEE");
        System.out.println("7.DISPLAY ALL EMPLOYEES");
        System.out.print("ENTER YOUR CHOICE:");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        List<Employee> record = new LinkedList<Employee>();
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:// ADD EMPLOYEE
                    Employee temp = new Employee();
                    temp.accept(sc);
                    record.add(temp);
                    System.out.println("Employee Added Successfully !");
                    break;
                case 2:// DELETE EMPLOYEE
                    System.out.println("Enter Details for Deleting Employee");
                    System.out.print("Employee ID:");
                    int id = sc.nextInt();
                    Employee temp2=new Employee();
                    temp2.setId(id);
                    if(record.remove(temp2))
                    	System.out.println("Deleted Employee Successfully");
                    else
                    	System.out.println("Employee With Given ID Not Found");
                    break;
                case 3:// FIND EMPLOYEE
                	System.out.println("Enter Details for Searching Employee");
                    System.out.print("Employee ID:");
                    int id2 = sc.nextInt();
                    Employee temp3=new Employee();
                    temp3.setId(id2);
                    if(record.contains(temp3))
                    {
                    	int index=record.indexOf(temp3);
                    	System.out.println("Employee Found at "+index);
                    	System.out.println("Employee Details:"+record.get(index));
                    }
                    else
                    {
                    	System.out.println("Employee Not Found");
                    }
                    break;
                case 4:// SORT EMPLOYEE LISY BY ID
                	System.out.println("Sorted Employee List By ID Successfully");
                	Collections.sort(record);
                    break;
                case 5:// DELETE ALL
                	System.out.println("Do You Really Want To Delete All Records ?");
                	System.out.println("1.YES");
                	System.out.println("2.NO");
                	System.out.print("Enter Your Choice:");
                	int choice2=sc.nextInt();
                	if(choice2==1 || choice2==2)
                	{
                		if(choice==1)
                			record.clear();
                	}
                    break;
                case 6:// EDIT EMPLOYEE
                	System.out.print("Enter Employee ID to be modified: ");
                	int id3 = sc.nextInt();
                	Employee key = new Employee();
                	key.setId(id3);
                	int index = record.indexOf(key);
                	if(index == -1)
                	{
                		System.out.println("Employee not found.");
                	}
                	else
                	{
	                	Employee oldEmp = record.get(index);
	                	System.out.println("Employee Found: " + oldEmp);
	                	System.out.println("Enter new information for the Employee");
	                	Employee newEmp = new Employee();
	                	newEmp.accept(sc);
	                	record.set(index, newEmp);
                	}
                    break;
                case 7://DISPLAY ALL
                	for(int i=0;i<record.size();i++)
                	{
                		Employee temp4=record.get(i);
                		System.out.println("[       "+i+"       ]"+temp4);
                	}
                default:
                    System.out.println("INVALID CHOICE ENTER AGAIN !");
                    break;
            }
        }
    }
}
