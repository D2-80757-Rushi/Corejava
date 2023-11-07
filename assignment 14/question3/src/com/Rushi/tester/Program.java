package com.Rushi.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Program {
	public static int countIf(List<String>list,Predicate<String> cond) {
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			if(cond.test(list.get(i)))
				count++;
		}
		return count;
	}
	public static int menu(Scanner sc){
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD STRING TO ARRAY");
		System.out.println("2.COUNT OF STRINGS WITH LENGTH MORE THAN 6 IN ARRAY:");
		System.out.print("ENTER YOUR CHOICE:");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		List<String> list=new ArrayList<String>();
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:	//ADD A STRING TO ARRAY
				System.out.print("Enter String:");
				String st=sc.next();
				list.add(st);
				break;
			case 2:	//COUNT OF STRINGS WITH LENGTH MORE THAN 6 IN ARRAY:
				System.out.println("COUNT OF STRINGS WITH LENGTH MORE THAN 6 IN ARRAY:"+Program.countIf(list, c -> c.length()>6));
			default:
				break;
			}
		}
	}
}
