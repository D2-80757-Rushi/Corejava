package com.Rushi.classes;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable{
	private String ISBN;
	private double price;
	private String authorName;
	private  int quantity;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String iSBN, double price, String authorName, int quantity) {
		super();
		ISBN = iSBN;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book Details Are:\nISBN:").append(ISBN).append("\nPrice:").append(price).append("\nAuthor Name:")
				.append(authorName).append("\nQuantity=").append(quantity);
		return builder.toString();
	}

	@Override
	public int compareTo(Object other) {
		double no1=Double.parseDouble(this.getISBN());
		Book b2=(Book)other;
		double no2 =Double.parseDouble(b2.getISBN());
		return Double.compare(no1, no2);	
	}
	public void accept(Scanner sc) {
		System.out.println("Enter Details of Book:");
		System.out.print("ISBN:");
		this.ISBN=sc.next();
		System.out.print("Price:");
		this.price=sc.nextDouble();
		System.out.print("Author Name:");
		this.authorName=sc.next();
		System.out.print("Quantity:");
		this.quantity=sc.nextInt();
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN, authorName, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(ISBN, other.ISBN);
	}
	
	
}
