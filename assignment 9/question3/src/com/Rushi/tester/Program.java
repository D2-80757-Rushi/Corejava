package com.Rushi.tester;

import java.util.Scanner;

//From an array of strings print the strings ending with vowels.
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter a String:");
		str=sc.nextLine();
		String arr[]=str.split(" ");
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			int index=arr[i].length()-1;
			if(arr[i].charAt(index)=='a' || arr[i].charAt(index)=='e' || arr[i].charAt(index)=='i' ||arr[i].charAt(index)=='o'|| arr[i].charAt(index)=='u')
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.print("Words Ending With Vowels:");
			for(int i=0;i<arr.length;i++)
			{
				int index=arr[i].length()-1;
				
				if(arr[i].charAt(index)=='a' || arr[i].charAt(index)=='e' || arr[i].charAt(index)=='i' ||arr[i].charAt(index)=='o'|| arr[i].charAt(index)=='u')
				{
					System.out.print(arr[i] + " ,");
				}
			}
		}
		else
		{
			System.out.print("Sorry no words ending with vowels found");
		}
	}
}
