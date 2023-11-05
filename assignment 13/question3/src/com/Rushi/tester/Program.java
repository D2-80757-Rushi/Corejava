package com.Rushi.tester;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.Rushi.classes.Book;
//In above assignment use LinkedHashSet instead of HashSet.
//If any book with duplicate isbn is added, what will happen? Books are stored in which order?
//ANS:Duplicates Do not get added in Set
//ANS:Books are stored in the order they are inserted.
public class Program {
	public static void main(String[] args) {
		Set<Book> set=new LinkedHashSet<Book>();
		System.out.println(set.add(new Book("103",99,"Niraj",100)));	//return true
		System.out.println(set.add(new Book("102",89,"Omkar",150)));	//return true
		System.out.println(set.add(new Book("104",91,"Rohit",750)));	//return true
		System.out.println(set.add(new Book("119",91,"Manoj",750)));
		System.out.println(set.add(new Book("105",91,"Manth",750)));
		System.out.println(set.add(new Book("108",91,"Appaa",750)));
		System.out.println(set.add(new Book("101",91,"Shrya",750)));
		System.out.println(set.add(new Book("101",91,"Xreya",750)));
		System.out.println(set.add(new Book("101",91,"Zreya",750)));
		System.out.println(set);
		System.out.println("--------------------------");
		Iterator<Book>itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
