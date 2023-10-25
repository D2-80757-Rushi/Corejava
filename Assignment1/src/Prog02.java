import java.util.Scanner;

public class Prog02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1: ");
		if(sc.hasNextDouble())
		{
			double num1 = sc.nextDouble();
			System.out.println("Accept num1: "+num1);
			if(sc.hasNextDouble()) {
				double num2 = sc.nextDouble();
				System.out.println("Accept num2: "+num2);
				double average = (num1+num2)/2;
				System.out.println("Average: "+average);
			}
			else {
				System.out.println("num2 is not double data type");
			}
	
		}
		else {
			System.out.println("Double type nahi hai mine dekha");
		}

	}

}
