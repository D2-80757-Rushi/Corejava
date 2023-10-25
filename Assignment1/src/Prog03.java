import java.util.Scanner;

public class Prog03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int sum = 0;
		int qty ;
		
		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------MENU----------");
			System.out.println("0.Exit");
			System.out.println("1.Dosa");
			System.out.println("2.Samosa");
			System.out.println("3.Idli");
			System.out.println("4.Vada Pav");
			System.out.println("5.Poha");
			System.out.println("6.Upma");
			System.out.println("7.Puff");
			System.out.println("8.Misal");
			System.out.println("9.Usal");
			System.out.println("10.Generate Bill");
			choice = sc.nextInt();
			System.out.println("Enter the choice: "+choice);
			if(choice>=11) {
				System.out.println("Wrong choice");
			}
			else {
			switch(choice) {
			case 1:
				System.out.println("Enter Dosa Quantity: ");
				qty = sc.nextInt();
				System.out.println("Dosa Quantity: "+qty);
				sum = sum+(30*qty);
			    break;
			case 2:
				System.out.println("Enter Samosa Quantity: ");
				qty = sc.nextInt();
				System.out.println("Samosa Quantity: "+qty);
				sum = sum+(12*qty);
				break;
			case 3:
				System.out.println("Enter Idli Quantity: ");
				qty = sc.nextInt();
				System.out.println("Idli Quantity: "+qty);
				sum = sum+(25*qty);
				break;
			case 4:
				System.out.println("Enter Vada pav Quantity: ");
				qty = sc.nextInt();
				System.out.println("Vada pav Quantity: "+qty);
				sum = sum+(12*qty);
				break;
			case 5:
				System.out.println("Enter Poha Quantity: ");
				qty = sc.nextInt();
				System.out.println("Poha Quantity: "+qty);
				sum = sum+(20*qty);
				break;
			case 6:
				System.out.println("Enter Upma Quantity: ");
				qty = sc.nextInt();
				System.out.println("Upma Quantity: "+qty);
				sum = sum+(20*qty);
				break;
			case 7:
				System.out.println("Enter Puff Quantity: ");
				qty = sc.nextInt();
				System.out.println("Puff Quantity: "+qty);
				sum = sum+(18*qty);
				break;
			case 8:
				System.out.println("Enter Misasl Quantity: ");
				qty = sc.nextInt();
				System.out.println("Misal Quantity: "+qty);
				sum = sum+(35*qty);
				break;
			case 9:
				System.out.println("Enter Usal Quantity: ");
				qty = sc.nextInt();
				System.out.println("Usal Quantity: "+qty);
				sum = sum+(30*qty);
				break;
			case 10:
				System.out.println("Total Generated bill: "+sum );
	
			default :
				System.out.println("thank u for visit");
			case 0:
				System.out.println("BYE");
				sum = 0;
			}
			}
		}
			
		
				

	}

}
