import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter Number:");
		num = sc.nextInt();
		System.out.println("Given number:"+num);
		String d = Integer.toBinaryString(num);
		System.out.println("Binary equivalent: " +d);
		String q = Integer.toOctalString(num);
		System.out.println("Octal equivalent: "+q);
		String w = Integer.toHexString(num);
		System.out.println("Octal equivalent: "+w);
	}

}
