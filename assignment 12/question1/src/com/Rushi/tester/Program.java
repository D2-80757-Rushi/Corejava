package com.Rushi.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.gaurav.classes.Book;

public class Program {
    public static int menu(Scanner sc) {
        int choice = 0;
        System.out.println("0.EXIT");
        System.out.println("1.ADD NEW BOOK IN LIST");
        System.out.println("2.DISPLAY ALL BOOKS IN FORWARD ORDER");
        System.out.println("3.SEARCH BY ISBN");
        System.out.println("4.DELETE A BOOK AT INDEX");
        System.out.println("5.DELETE A BOOK WITH GIVEN ISBN");
        System.out.println("6.DELETE A BOOK WITH GIVEN AUTHOR NAME");
        System.out.println("7.SORT BOOKS IN ASCENDING ORDER");
        System.out.println("8.SORT BOOKS BY PRICE IN DESCENDING ORDER");
        System.out.println("9.REVERSE THE LIST");
        System.out.print("ENTER YOUR CHOICE:");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
    	class BooksPriceDescComparator implements Comparator<Book>
    	{
			public int compare(Book b1, Book b2) {
				int diff=Double.compare(b1.getPrice(), b2.getPrice());
				return -diff;
			}	
    	}
    	int choice;
        Scanner sc = new Scanner(System.in);
        List <Book> library = new ArrayList<Book>();
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:// ADD NEW BOOK IN LIST
                	Book b1=new Book();
                	b1.accept(sc);
                	int index=library.indexOf(b1);
                	if(index==-1)
                	{
                		System.out.println("Book Not in Library, Added new Book");
                		library.add(b1);
                	}
                	else
                	{
                		System.out.println("Book already in library, Modifying Quantity");
                		Book ref=library.get(index);
                		ref.setQuantity(ref.getQuantity()+b1.getQuantity());
                		System.out.println("New Quantity:"+ref.getQuantity());
                	}
                    break;
                case 2:// DISPLAY ALL BOOKS IN FORWARD ORDER
                	//Way 1
//                    Iterator<Book> itr = library.iterator();
//                    while (itr.hasNext()) {
//                        Book temp = itr.next();
//                        System.out.println(temp);
//                    }
                	//Way 2
                    for(int i=0;i<library.size();i++)
                    {
                    	System.out.println("Book Details:"+library.get(i).toString());
                    }
                    break;
                case 3:// SEARCH BY ISBN
                	System.out.print("Enter ISBN to Search:");
                    String id2 = sc.next();
                    Book temp2 = new Book();
                    temp2.setISBN(id2);
                    if (library.contains(temp2))
                    {
                        System.out.println("Book with given ID Found");
                    }
                    else
                    {
                        System.out.println("Book with given ID Not Found");
                    }
                	break;
                case 4:// DELETE A BOOK AT INDEX
                    System.out.print("Enter Index to Delete:");
                    int index2=sc.nextInt();
                    if(index2<0 || index2>library.size()-1)
                    {
                    	System.out.println("Wrong Index");
                    }
                    else
                    {
                    	Book b2=library.remove(index2);
                    	System.out.println("Deleted Book Successfully:"+b2);
                    }
                    break;
                case 5:// DELETE A BOOK WITH GIVEN ISBN
                	System.out.print("Enter ISBN to Delete:");
                    String id3 = sc.next();
                    Book temp3 = new Book();
                    temp3.setISBN(id3);
                    int index3=library.indexOf(temp3);
                    if(index3==-1)
                    	System.out.println("Book Not Found");
                    else
                    	library.remove(index3);
                    break;
                case 6:// DELETE A BOOK WITH GIVEN AUTHOR NAME
                	System.out.print("Enter Author Name to Delete Book:");
                	String author=sc.next();
                	boolean flag=false;
                    for(int i=0;i<library.size();i++)
                    {
                    	Book temp4=library.get(i);
                    	if(temp4.getAuthorName().equals(author))
                    	{
                    		library.remove(i);
                    		flag=true;
                    	}
                    }
                    if(flag==false)
                    {
                    	System.out.println("Book With Given Author Not Found");
                    }
                    break;
                case 7://SORT BOOKS IN ASCENDING ORDER
                	Collections.sort(library);
                	System.out.println("Books Sorted In Ascending Order Successfully");
                	break;
                case 8://SORT BOOKS BY PRICE IN DESCENDING ORDER
                	Collections.sort(library, new BooksPriceDescComparator());
                	System.out.println("Books Sorted In Price High to Low Order Successfully");
                	break;
                case 9://REVERESE THE LIST
                	Collections.reverse(library);
                	break;
                default:
                    System.out.println("INVALID CHOICE ENTER AGAIN !");
                    break;
            }
        }
    }
}
