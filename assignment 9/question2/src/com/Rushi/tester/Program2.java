package com.Rushi.tester;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter A String:");
		str=sc.nextLine();
		System.out.println("Entered String:"+str);
		String arr[];
		StringBuilder sb=new StringBuilder("");
		arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			Character ch=arr[i].charAt(0);
			ch=Character.toUpperCase(arr[i].charAt(0));
			sb=sb.append(ch+arr[i].substring(1)+" ");
		}
		System.out.println("Sentence Case:"+sb);
	}

}
