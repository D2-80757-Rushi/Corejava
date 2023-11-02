package com.Rushi.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.Rushi.classes.Book;

public class Program {
    public static int menu(Scanner sc) {
        int choice = 0;
        System.out.println("0.EXIT");
        System.out.println("1.ADD NEW BOOK IN LIST");
        System.out.println("2.DISPLAY ALL BOOKS IN FORWARD ORDER");
        System.out.println("3.DELETE BOOK OF GIVEN ID");
        System.out.println("4.SEARCH BOOK IN LIBRARY");
        System.out.println("5.DELETE ALL BOOKS IN LIST");
        System.out.println("6.DISPLAY NO OF BOOKS IN LIBRARY");
        System.out.print("ENTER YOUR CHOICE:");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        ArrayList <Book> library = new ArrayList<Book>();
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:// ADD NEW BOOK IN LIST
                	Book b1=new Book();
                	b1.accept(sc);
                	library.add(b1);
                    System.out.println("ADDED NEW BOOK SUCCESSFULY !");
                    break;
                case 2:// DISPLAY ALL BOOKS IN FORWARD ORDER
                	Collections.sort(library);
                    Iterator<Book> itr = library.iterator();
                    while (itr.hasNext()) {
                        Book temp = itr.next();
                        System.out.println(temp);
                    }
                    break;
                case 3:// DELETE BOOK OF GIVEN ID
                	System.out.print("Enter Which Book to Delete:");
                    String id1 = sc.next();
                    Book temp1 = new Book();
                    temp1.setISBN(id1);
                    if (library.contains(temp1)) {
                        library.remove(temp1);
                    	System.out.print("Deleted Book Successfully:");
                    }
                    else {
                        System.out.println("Book with given ID Not Found");
                    }
                    break;
                case 4:// SEARCH
                    System.out.print("Enter Which Book to Search:");
                    String id2 = sc.next();
                    Book temp2 = new Book();
                    temp2.setISBN(id2);
                    if (library.contains(temp2)) {
                        System.out.println("Book with given ID Found");
                    }
                    else {
                        System.out.println("Book with given ID Not Found");
                    }
                    break;
                case 5:// DELETE ALL
                    System.out.println("Do You Really Want To Delete ?:");
                    System.out.print("Enter 1 to Delete All:");
                    int temp3 = sc.nextInt();
                    if (temp3 == 1) {
                        library.clear();
                    }
                    break;
                case 6:// DISPLAY TOTAL NO
                    System.out.println("Total No of Books:" + library.size());
                    break;
                default:
                    System.out.println("INVALID CHOICE ENTER AGAIN !");
                    break;
            }
        }
    }
}
