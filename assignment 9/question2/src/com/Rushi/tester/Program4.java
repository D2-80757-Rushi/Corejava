package com.Rushi.tester;

import java.util.Scanner;

//www.sunbeaminfo.com --> www.sunbeaminfo.in
public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter A Website Ending With .com:");
		str=sc.next();
		System.out.println("Entered Website:"+str);
		StringBuilder sb=new StringBuilder();
		int index=str.indexOf(".com");
		sb=sb.append(str.substring(0, index));
		sb=sb.append(".in");
		System.out.println("Website (India Specific):"+sb);
	}
}
