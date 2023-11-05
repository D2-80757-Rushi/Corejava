package com.Rushi.tester;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.Rushi.classes.Book;
//In above assignment, Use TreeSet to store all books in descending order of price.
//Natural ordering for the Book should be isbn (do not change it). Display
//them using iterator() and descendingIterator().
//Doing so will cause natural ordering to be disturbed and then elements will be added
//according to the specified comparator but in this case items with duplicate isbn will be added
//but those iitems with same price will not be added in the set.
public class Program {
	
	public static void main(String[] args) {
		class BookPriceDescComparator implements Comparator<Book>{
			@Override
			public int compare(Book b1, Book b2) {
				return -Double.compare(b1.getPrice(), b2.getPrice());
			}	
		}
		Set<Book> set=new TreeSet<Book>(new BookPriceDescComparator());
		set.add(new Book("103",99,"Niraj",100));	//return true
		set.add(new Book("102",89,"Omkar",150));	//return true
		set.add(new Book("104",10,"Rohit",750));	//return true
		set.add(new Book("119",181,"Manoj",70));
		set.add(new Book("105",81,"Manth",150));
		set.add(new Book("108",21,"Appaa",5));
		set.add(new Book("101",991,"Shrya",990));
		set.add(new Book("101",31,"Xreya",230));
		set.add(new Book("101",71,"Zreya",710));
		System.out.println("--------------------------");
		Iterator<Book>itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
