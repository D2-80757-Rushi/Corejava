package com.Rushi.tester;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import com.Rushi.classes.Book;
//Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time.
//Do we need to write equals() and hashCode() in Book class?
//We need to write equals() and hashCode() only in String class as it is key of the HashSet and Book is Value
//Therefore we do not need equals() and hashCode() in Book Class.

public class Program {
	public static int menu(Scanner sc){
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD BOOK IN HASHMAP");
		System.out.println("2.SEARCH BOOK IN HASHMAP");
		System.out.print("ENTER YOUR CHOICE:");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		Map<String,Book> map=new HashMap<String,Book>();
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:	//ADD A BOOK
				Book temp=new  Book();
				temp.accept(sc);
				Book previous=map.put(temp.getISBN(), temp);
				if(previous==null)
				{
					System.out.println("No Previous Book was found with this ISBN");
					System.out.println("Book Added to HashMap Successfully !");
					System.out.println("Book Details:\n"+temp);
				}
				else
				{
					System.out.println("Book Was found With Provided ISBN");
					System.out.println("Book will be Replaced");
					System.out.println("Previous Book Details:"+previous);
				}
				break;
			case 2:	//SEARCH BOOK BY ISBN
				System.out.print("Enter ISBN:");
				String ISBN=sc.next();
				Book book=map.get(ISBN);
				if(book==null)
				{
					System.out.println("Book Not Found");
				}
				else
				{
					System.out.println("Book Found");
					System.out.println("Book Details:+\n"+book);
				}
			default:
				break;
			}
		}
	}
}
