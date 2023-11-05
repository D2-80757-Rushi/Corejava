package com.Rushi.tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.Rushi.classes.Book;

//Store few books (hardcoded values with the Book class in previous assignment -- 
//with equals() and without Comparable) in a HashSet
//and display them using Iterator. If any book with duplicate isbn is added, what will happen?
//ANS: Book is Added in Set even if we have written compareTo method which compares the ISBNs
//Books are stored in which order?
//ANS: Books are Stored in Random Order
//Solve duplicate ISBN problem.
//ANS: By Using equals()+hashcode()
public class Program {
	public static void main(String[] args) {
		Set<Book> set=new HashSet<Book>();
		System.out.println(set.add(new Book("103",99,"Niraj",100)));	//return true
		System.out.println(set.add(new Book("102",89,"Omkar",150)));	//return true
		System.out.println(set.add(new Book("104",91,"Rohit",750)));	//return true
		System.out.println(set.add(new Book("104",91,"Baaje",120)));	//return false
		System.out.println(set);
		System.out.println("--------------------------");
		Iterator<Book>itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
