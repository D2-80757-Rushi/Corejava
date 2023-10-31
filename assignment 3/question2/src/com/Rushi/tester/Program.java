package com.Rushi.tester;
import com.Rushi.classes.*;
import java.util.Scanner;
public class Program {

	public static int Menu(Scanner sc) {
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD NEW POINT");
		System.out.println("2.DISPLAY DETAILS OF SPECIFIC POINT");
		System.out.println("3.DISPLAY ALL POINTS");
		System.out.println("4.DISPLAY DISTANCE BETWEEN TWO POINTS");
		System.out.print("ENTER YOUR CHOICE:");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter How Many Points You Want To Store:");
		int size=sc.nextInt();
		Point2D []arr=new Point2D[size];
		int index=0;
		while((choice=Menu(sc))!=0)
		{
			switch (choice) {
			case 1:	//ADD NEW POINT
				if(index<size)
				{
					System.out.print("Enter X-Coordinate:");
					int x=new Scanner(System.in).nextInt();
					System.out.print("Enter Y-Coordinate:");
					int y=new Scanner(System.in).nextInt();
					arr[index]=new Point2D(x,y);
					index++;
					System.out.println("ADDED NEW POINT");
				}
				else
				{
					System.out.println("ARRAY IS FULL");
				}	
				break;
				
			case 2://DISPLAY A SPECIFIC POINT
				System.out.print("Enter Index of Point To Find:");
				int key=sc.nextInt();
				if(key<index)
				{
					System.out.println("arr["+key+"]:"+arr[key]);
				}
				else
				{
					System.out.println("NO ELEMENTS AT THIS INDEX");
				}
				break;
			case 3://DISPLAY ALL POINTS
				System.out.println("ALL POINTS ARE:");
				for(int i=0;i<arr.length;i++)
				{
					System.out.println("arr["+i+"]:"+arr[i]);
				}
				break;
			case 4://DISPLAY DISTANCE BETWEEN TWO POINTS
				System.out.print("Enter Index of First Point:");
				int p1=sc.nextInt();
				System.out.print("Enter Index of Second Point:");
				int p2=sc.nextInt();
				if(p1<index && p2<index)
				{
					if(arr[p1].isEquals(arr[p2]))
						System.out.println("Points are Same");
					else
						System.out.println("Distance between Two Co-ordinates:"+arr[p1].calculateDistance(arr[p2]));
				}
				else
				{
					System.out.println("NO ELEMENTS AT ONE OF THIS INDEX");
				}
				break;
			default:
				System.out.printf("INVALID CHOICE");
				break;
			}
		}
		
//		System.out.println("Enter Details of First Point");
//		System.out.print("Enter Index of First Point");
//		int index=(new Scanner(System.in)).nextInt();
//		
//		Point2D p1 =new Point2D(x,y);
//		System.out.println("Point 1:"+p1);
//		
//		System.out.println("Enter Details of Second Point");
//		System.out.print("Enter x coordinate:");
//		x=(new Scanner(System.in)).nextInt();
//		System.out.print("Enter y coordinate:");
//		y=(new Scanner(System.in)).nextInt();
//		Point2D p2 =new Point2D(x,y);
//		System.out.println("Point 2:"+p2);
//		
//		if(p1.isEquals(p2))
//			System.out.println("Points are Same");
//		else
//			System.out.println("Distance between Two Co-ordinates:"+p1.calculateDistance(p2));
	}
}
