package com.Rushi.classes;

import java.util.Objects;
import java.util.Scanner;

public abstract class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void acceptData(Scanner sc) {
		System.out.print("Name:");
		this.name=sc.next();
		System.out.print("Age:");
		this.age=sc.nextInt();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Name=" + name + "\nAge=" + age;
	}
	
	
	
}
