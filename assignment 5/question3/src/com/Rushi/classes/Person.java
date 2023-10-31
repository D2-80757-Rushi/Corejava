package com.Rushi.classes;

public class Person implements Cloneable {
	private int weight;
	private int height;
	private Date birth;

	public Object clone() throws CloneNotSupportedException {
		Person temp = (Person) super.clone();
		temp.birth = (Date) this.birth.clone();
		return temp;
	}

	public Person(int weight, int height, Date birth) {
		super();
		this.weight = weight;
		this.height = height;
		this.birth = birth;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void display() {
		System.out.println("Weight:" + weight + "\nHeight:" + height + "\nDate of Birth:" + birth);
	}
}
