package com.Rushi.tester;

import java.util.Scanner;

public class Program3 {
//Example --> eXaMpLe
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter A Word:");
		str=sc.nextLine();
		System.out.println("Entered Word:"+str);
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				Character ch=str.charAt(i);
				ch=Character.toLowerCase(ch);
				sb=sb.append(ch);
			}
			else
			{
				Character ch=str.charAt(i);
				ch=Character.toUpperCase(ch);
				sb=sb.append(ch);
			}
		}
		System.out.println("Alternate Case:"+sb);
	}

}
