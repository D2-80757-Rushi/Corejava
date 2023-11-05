package com.Rushi.tester;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.Rushi.classes.Book;
//In above assignment use TreeSet instead of LinkedHashSet.
//Use natural ordering for the Book.
//If any book with duplicate isbn is added, what will happen?
//Duplicates do not get added in the set
//Books are stored in which order?
//Books are sorted according to the Natural Order.
public class Program {
	public static void main(String[] args) {
		Set<Book> set=new TreeSet<Book>();
		set.add(new Book("103",99,"Niraj",100));	//return true
		set.add(new Book("102",89,"Omkar",150));	//return true
		set.add(new Book("104",91,"Rohit",750));	//return true
		set.add(new Book("119",91,"Manoj",750));
		set.add(new Book("105",91,"Manth",750));
		set.add(new Book("108",91,"Appaa",750));
		set.add(new Book("101",91,"Shrya",750));
		set.add(new Book("101",91,"Xreya",750));
		set.add(new Book("101",91,"Zreya",750));
		System.out.println("--------------------------");
		Iterator<Book>itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
