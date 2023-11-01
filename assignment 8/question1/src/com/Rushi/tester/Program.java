package com.Rushi.tester;

import java.util.Scanner;

import com.Rushi.classes.Album;
import com.Rushi.classes.Books;
import com.Rushi.classes.Product;
import com.Rushi.classes.Toy;

public class Program {
	public static int Menu(Scanner sc) {
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD BOOK");
		System.out.println("2.ADD ALBUM");
		System.out.println("3.ADD TOY");
		System.out.println("4.GENERATE BILL");
		System.out.print("ENTER YOUR CHOICE:");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Product arr[]=new Product [5];
		int index=0;
		Scanner sc=new Scanner(System.in);
			int choice;
			while ((choice = Menu(sc)) != 0) {
				switch (choice) {
				case 1:// ADD BOOK
					if(index<arr.length)
					{
						arr[index]=new Books();
						arr[index].acceptData(sc);
						index++;
					}
					else
					{
						System.out.println("CART IS FULL!!!");
					}
					break;
				case 2:// ADD ALBUM
					if(index<arr.length)
					{
						arr[index]=new Album();
						arr[index].acceptData(sc);
						index++;
					}
					else
					{
						System.out.println("CART IS FULL!!!");
					}
					break;
				case 3:// ADD TOY
					if(index<arr.length)
					{
						arr[index]=new Toy();
						arr[index].acceptData(sc);
						index++;
					}
					else
					{
						System.out.println("CART IS FULL!!!");
					}
					break;
				case 4:// GENERATE BILL
					double totalBillInclusiveGST=0;
					double totalGST=0;
					double totalRevenue=0;
					for(int i=0;i<index;i++)
					{
						totalBillInclusiveGST=totalBillInclusiveGST+arr[i].calculateBill();
						totalGST=totalGST+arr[i].calculateGST();
						totalRevenue=totalRevenue+arr[i].calculateRevenue();
					}
					System.out.println("Total Bill Inculding GST:"+totalBillInclusiveGST);
					System.out.println("Total GST Amount:"+totalGST);
					System.out.println("Total Reveneue (BILL-GST):"+totalRevenue);
					break;
				default:
					System.out.println("INVALID CHOICE ENTER AGAIN");
					break;
				}
			}
			System.out.println("Thank You..!");
			sc.close();
		}
	}
