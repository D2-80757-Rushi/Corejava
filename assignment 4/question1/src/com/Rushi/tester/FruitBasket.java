package com.Rushi.tester;
import com.Rushi.fruits.*;
import java.util.Scanner;
public class FruitBasket {
	
	public static int Menu(Scanner sc){
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.ADD MANGO");
		System.out.println("2.ADD ORANGE");
		System.out.println("3.ADD APPLE");
		System.out.println("4.CHECK ALL FRUTS IN BASKET");
		System.out.println("5.DISPLAY DETAILS OF FRUITS IN OBJECT");
		System.out.println("6.DISPLAY TASTES OF ALL STALE FRUITS IN THE BASKET.");
		System.out.println("7.MARK A FRUIT AS STALE.");
		System.out.println("8.MARK ALL SOUR FRUITS AS STALE.");
		System.out.print("ENTER YOUR CHOICE:");
		choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int basketSize;	
		System.out.print("Enter Basket Size:");
		basketSize=new Scanner(System.in).nextInt();
		int choice;
		Fruit[] arrFruits=new Fruit[basketSize];
		int index=0;
		while((choice=Menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				//ADD MANGO
				if(index<basketSize)
				{
					arrFruits[index]=new Mango();
					arrFruits[index].acceptData(sc);
					index++;
				}
				else
				{
					System.out.println("Basket is Full");
				}
				break;
			case 2:
				//ADD ORANGE
				if(index<basketSize)
				{
					arrFruits[index]=new Orange();
					arrFruits[index].acceptData(sc);
					index++;
				}
				else
				{
					System.out.println("Basket is Full");
				}
				break;
			case 3:
				//ADD APPLE
				if(index<basketSize)
				{
					arrFruits[index]=new Apple();
					arrFruits[index].acceptData(sc);
					index++;
				}
				else
				{
					System.out.println("Basket is Full");
				}
				break;
			case 4:
				for(int i=0;i<arrFruits.length;i++)
				{
					System.out.println(i+1+"."+arrFruits[i].getName());
				}
				break;
			case 5:
				//DISPLAY DETAILS OF FRUITS IN OBJECT
				for(int i=0;i<arrFruits.length;i++)
				{
					System.out.println("[   "+i+"   ]"+arrFruits[i]);
				}
				break;
			case 6:
				//DISPLAY TASTES OF ALL STALE FRUITS IN THE BASKET
				System.out.println("Displaying Tastes Of All Stale Fruits In Basket:");
				boolean flag=false;
				for(int i=0;i<arrFruits.length;i++)
				{
					if(arrFruits[i].isFresh()==false)
					{
						flag=true;
					}
				}
				if(flag==true)
				{
					System.out.println("Displaying Tastes Of All Stale Fruits In Basket:");
					for(int i=0;i<arrFruits.length;i++)
					{
						if(arrFruits[i].isFresh()==false)
						{
							System.out.print(" "+arrFruits[i].taste());
						}
					}
				}
				else
				{
					System.out.println("None of The Fruits Are Stale");
				}
				break;
			case 7:
				//7. Mark a fruit as stale 
				System.out.print("Enter Index To Mark Stale:");
				int ind=sc.nextInt();
				if(ind<index)
				{
					for(int i=0;i<arrFruits.length;i++)
					{
						if(i==ind)
						{
							arrFruits[i].setFresh(false);
							System.out.println("Marked "+arrFruits[i].getName()+" as Stale !");
						}
					}
				}
				else
					System.out.println("Index Out Of Bounds");
				break;
			case 8:
				System.out.println("Marking all Sour fruits as Stale");
				int counter=0;
					for(int i=0;i<arrFruits.length;i++)
					{
						if(arrFruits[i].taste()=="sour")
						{
							counter++;
							arrFruits[i].setFresh(false);
							System.out.println("Marked "+arrFruits[i].getName()+" as Stale !");
						}
					}
					if(counter<1)
						System.out.println("Marked "+counter+" Fruits as Stale");
					else
						System.out.println("All Sour Fruits Are Already Stale");
				break;
			default:
				System.out.println("\nWrong Choice.\n");
				break;
			}
		}
	}
}
