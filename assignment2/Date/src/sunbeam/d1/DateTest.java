package sunbeam.d1;

import java.util.Scanner;

public class DateTest {
	static int choice;
	public static int menu() {
		System.out.println("-----------Date------------");
		System.out.println("1.Display Date");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date();
		int choice;
		while(true) {
			choice=menu();
			switch(choice) {
			case 1:
				System.out.println("enter day: ");
				d1.setDay(sc.nextInt());
				System.out.println("enter month: ");
				d1.setMonth(sc.nextInt());
				System.out.println("enter year: ");
				d1.setYear(sc.nextInt());
				d1.displayDate();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		
		

	}

}
