package com.Rushi.classes;

public class Person implements Displayable{
	private String name;
	private int id;
	private int age;
	public Person() {

	}
	public Person(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
    {
    	return (new StringBuilder().append("\nName:").append(this.name).append("\nID:").append(this.id).append("\nAge:").append(this.age)).toString();  
    }
	@Override
	public void display() {
		System.out.println("Person Details:"+this.toString());
	}	
}
