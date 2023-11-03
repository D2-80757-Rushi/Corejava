package com.Rushi.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static int menu(Scanner sc) {
        int choice = 0;
        System.out.println("0.EXIT");
        System.out.println("1.ADD NEW STRING");
        System.out.println("2.WHICH IS THE LARGEST STRING");
        System.out.print("ENTER YOUR CHOICE:");
        choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
    	class LargestStringComparator implements Comparator<String>{
    		@Override
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
    	}
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        while ((choice = menu(sc)) != 0) {
            switch (choice) {
                case 1:// ADD NEW STRING
                	System.out.print("Enter String:");
                    String temp = new String(sc.next());
                    list.add(temp);
                    break;
                case 2:// DISPLAY THE LARGEST STRING
                	if(list.size()>0)
                	{
                		String max = Collections.max(list,new LargestStringComparator());
                        System.out.println("Largest String:" + max);
                	}
                	else
                	{
                		System.out.println("There are No Strings in List");
        			}
                    break;
                default:
                    System.out.println("INVALID CHOICE ENTER AGAIN !");
                    break;
            }

        }

    }
}
