package com.sunbeam.p1;

import java.util.Scanner;

public class InvoiceTest {
	static int choice;
	public static int menu() {
		System.out.println("-----------Hardware Store------------");
		System.out.println("1.Add Part");
		System.out.println("2.Calculate Amount");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Invoice invoice = new Invoice();
		int choice;
		double amount = 0;
		while(true) {
			choice = menu();
			switch(choice) {
			case 1:
				System.out.println("Enter the partno: ");
				invoice.setPartNumber(sc.next());
				System.out.println("Enter the Part description: ");
				invoice.setPartDescription(sc.next());
				System.out.println("Enter the prize: ");
				invoice.setItem(sc.nextInt());
				System.out.println("Enter the Qty: ");
				invoice.setQty(sc.nextInt());
				amount = invoice.calculate();
				break;
			case 2:
				System.out.println("Total genrated amount: "+amount);
				break;
			default:
				System.out.println("Invalid Choice");
				
			}			
		}
	}
}
