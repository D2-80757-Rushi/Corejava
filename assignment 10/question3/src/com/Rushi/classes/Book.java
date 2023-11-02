package com.Rushi.classes;

public class Book implements Displayable {
	private String name;
	private int ISBN;
	private double price;
	public Book() {
	// TODO Auto-generated constructor stub
	}
	
	public Book(String name, int iSBN, double price) {
		this.name = name;
		ISBN = iSBN;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    public String toString()
    {
    	return (new StringBuilder().append("\nName:").append(this.name).append("\nISBN:").append(this.ISBN).append("\nPrice:").append(this.price)).toString();
    }
	@Override
	public void display() {
		System.out.println("Book Details:"+this.toString());
	}
}
