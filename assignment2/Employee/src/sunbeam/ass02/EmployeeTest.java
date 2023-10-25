package sunbeam.ass02;

import java.util.Scanner;

public class EmployeeTest {
	static int choice;
	public static int menu() {
		System.out.println("-----------Employee Data------------");
		System.out.println("1.Yearly Salary");
		System.out.println("2.Increment Montly Salary");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee("Manthan","Sankhe",20000);
		Employee e2 = new Employee("Lobhas","Dave",1500);
		int choice;
		int emp;
		while(true) {
			choice=menu();
		switch(choice) {
		case 1:
			System.out.println("Enter the Employee no: ");
			emp = sc.nextInt();
			if(emp == 1) {
			e1.positiveSalary();
			}
			else {
				e2.positiveSalary();
			}
			break;
		case 2:
			System.out.println("Enter the Employee no: ");
			emp = sc.nextInt();
			if(emp==1) {
			e1.incrementSalary();
			}
			else {
			e2.incrementSalary();
			}
			break;
		default:
			System.out.println("Invalid choice");
		}
		}
		
	}

}
