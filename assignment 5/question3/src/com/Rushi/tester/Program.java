package com.Rushi.tester;

import com.Rushi.classes.Date;
import com.Rushi.classes.Person;

public class Program {
//	Implement Date and Person class with their clone() methods as shown in notes. 
//	Ensure that when p1's birth date is modified, it doesn't affect p2's birth date.
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person(51, 151, new Date(15, 06, 2025));
		p1.display();
		Person p2 = (Person) p1.clone();
		p2.display();
		p1.setBirth(new Date(01, 01, 2000));
		p1.display();
		p2.display();
	}
}
