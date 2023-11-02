package com.Rushi.tester;

import com.Rushi.classes.Book;
import com.Rushi.classes.Box;
import com.Rushi.classes.Car;
import com.Rushi.classes.Displayable;
import com.Rushi.classes.Person;

public class Program {

	public static <T> void printDisplayableBox(Box<? extends Displayable> b)
	{
		b.get().display();
	}
	public static <T> void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
	}
	public static void main(String[] args) {
		Box <Book> b1=new Box<>(new Book("Word Power Made Easy",1010105,120.15));
		
		Box<Person> p1=new Box<>(new Person("Jhon",1506,15));
		
		Box<Car> c1=new Box<>(new Car("Toyota Camry",2.2,12.56));
		
		Program.printDisplayableBox(b1);
		Program.printDisplayableBox(p1);

		Program.printAnyBox(b1);
		Program.printAnyBox(p1);
		Program.printAnyBox(c1);
	}

}
