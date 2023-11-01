package question4;

import java.util.Scanner;

//Declare an enum for Gender (MALE, FEMALE). Create a class Person with ﬁelds name, age and gender.
//In main(), create a array of Person. Write a menu
//driven program (using enum), to add new person, display all people, ﬁnd a person by name.

public class Program {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter A String:");
		str=new Scanner(System.in).nextLine();
		boolean flag=false;
		for(int i=0,j=str.length()-1;i<j;i++,j--)
		{
			Character ch=str.charAt(i);
			ch=Character.toUpperCase(ch);
			Character ch2=str.charAt(i);
			ch2=Character.toUpperCase(ch2);
			if(str.charAt(i)==str.charAt(j))
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is Not a Palindrome");
		}
	}

}
