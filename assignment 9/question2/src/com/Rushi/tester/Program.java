package com.Rushi.tester;

import java.util.Scanner;

//Write methods to perform following string conversions.
//Bank Of Maharashtra --> BOM
//this is string --> This Is String
//Example --> eXaMpLe
//www.sunbeaminfo.com --> www.sunbeaminfo.in
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter A String:");
		str=sc.nextLine();
		System.out.println("Entered String:"+str);
		String arr[];
		arr=str.split(" ");
		StringBuilder s=new StringBuilder("");
		for(int i=0;i<arr.length;i++)
		{
			s=s.append(arr[i].charAt(0));
		}
		System.out.println("Short Form:"+s);

	}

}
