package com.Rushi.tester;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import com.Rushi.classes.Student;
//Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest possible time.
//Do we need to write equals() and hashCode() in Student class?
//ANS:	No we do not need to have equals() and hashCode() in student class
//		as we java already has equalsa and hascode method in Integer class which is being used as a key
public class Program {
	public static int menu(Scanner sc){
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD STUDENT IN HASHMAP");
		System.out.println("2.SEARCH STUDENT IN HASHMAP");
		System.out.print("ENTER YOUR CHOICE:");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		Map<Integer,Student> map=new HashMap<Integer,Student>();
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:	//ADD A STUDENT
				Student temp=new  Student();
				temp.accept(sc);
				Student previous=map.put(temp.getRoll(), temp);
				if(previous==null)
				{
					System.out.println("No Previous Student was found with this RollNo");
					System.out.println("Student Added to HashMap Successfully !");
					System.out.println("Student Details:\n"+temp);
				}
				else
				{
					System.out.println("Student Was found With Provided RollNo");
					System.out.println("Student will be Replaced");
					System.out.println("Previous Student Details:"+previous);
				}
				break;
			case 2:	//SEARCH STUDENT BY ROLLNO
				System.out.print("Enter Roll No:");
				int roll=sc.nextInt();
				Student searched=map.get(roll);
				if(searched==null)
				{
					System.out.println("Student Not Found");
				}
				else
				{
					System.out.println("Student Found");
					System.out.println("Student Details:+\n"+searched);
				}
			default:
				break;
			}
		}
	}
}
