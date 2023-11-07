package com.Rushi.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Rushi.classes.User;
import com.Rushi.classes.UserDao;

public class Program {
    public static int menu(Scanner sc) {
        int choice;
        System.out.println("\n0.EXIT");
        System.out.println("1.INSERT AN USER");
        System.out.println("2.UPDATE AN USER");
        System.out.println("3.DELETE AN USER");
        System.out.println("4.DISPLAY ALL USERS");
        System.out.print("ENTER YOUR CHOICE:");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDao userDao=new UserDao();
        int choice;
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1: 
                {
                	System.out.println("Enter Details of User:");
                	System.out.print("First Name:");
                	String first_name=sc.next();
                	System.out.print("Last Name:");
                	String last_name=sc.next();
                	System.out.print("Email:");
                	String email=sc.next();
                	System.out.print("Password:");
                	String password=sc.next();
                	System.out.print("DOB(DD-MM-YYYY):");
                	String dob=sc.next();
                	System.out.print("Status:");
                	int status=sc.nextInt();
                	System.out.print("Role:");
                	String role=sc.next();
                	User u=new User(0,first_name,last_name,email,password,dob,status,role);
                	int count=userDao.addNew(u);
                	if(count>0)
                		System.out.println("Inserted User Successfully");
                	else
                		System.out.println("Unable to Insert User");
                }
                    break;
                case 2:   
                {
                	System.out.print("Enter ID of User to Update:");
                	int id=sc.nextInt();
                	System.out.print("First Name:");
                	String first_name=sc.next();
                	System.out.print("Last Name:");
                	String last_name=sc.next();
                	System.out.print("Email:");
                	String email=sc.next();
                	System.out.print("Password:");
                	String password=sc.next();
                	System.out.print("DOB(DD-MM-YYYY):");
                	String dob=sc.next();
                	System.out.print("Status:");
                	int status=sc.nextInt();
                	System.out.print("Role:");
                	String role=sc.next();
                	User u=new User(id,first_name,last_name,email,password,dob,status,role);
                	int count=userDao.updateByID(u);
                	if(count >0)
                		System.out.println("Updated user Details Successfully");
                	else
                		System.out.println("Unable to Update User Details");
                }
                	
                    break;
                case 3:
                {
                	System.out.print("Enter ID of User to Delete:");
                	int id=sc.nextInt();
                	int count=userDao.deleteById(id);
                	if(count>0)
                		System.out.println("Deleted Use with ID:"+id);
                	else
                		System.out.println("Unable to Delete User");
                }
                    break;
                case 4: 
	                {
	                	List <User> list=null;
	                	list=userDao.findAllUsers();
	                	if(list.size()>0)
	                		list.forEach(e->System.out.println(e));
	                	else
	                		System.out.println("List is Empty");
	                }
                    break;
                default:
                    break;
            }
        }
    }
}
