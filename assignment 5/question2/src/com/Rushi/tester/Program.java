package com.gaurav.tester;

import java.util.Scanner;

import com.gaurav.classes.Cricketer;
import com.gaurav.classes.Player;
import com.gaurav.classes.Players;

public class Program {
	public static int Menu(Scanner sc) {
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.COUNT NO OF BATTERS");
		System.out.println("2.COUNT NO OF BOWLERS");
		System.out.println("3.CALCULATE TOTAL RUNS SCORED");
		System.out.println("4.CALCULATE TOTAL WICKETS TAKEN");
		System.out.println("5.WHO SCORED MAXIMUM RUNS");
		System.out.println("6.WHO TOOK MAXIMUM WICKETS");
		System.out.print("ENTER YOUR CHOICE:");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Player[] ref = new Cricketer[11];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ref.length; i++) {
			ref[i] = new Cricketer();
			ref[i].acceptData(sc);
		}
		int choice;
		while ((choice = Menu(sc)) != 0) {
			switch (choice) {
			case 1:// COUNT NO OF BATTERS
				System.out.println("Total Number of Batsman:" + Players.countBatters(ref));

				break;
			case 2:// COUNT NO OF BOWLERS
				System.out.println("Total Number of Bowlers:" + Players.countBowlers(ref));
				break;
			case 3:// CALCULATE TOTAL RUNS SCORED
				System.out.println("Total Runs Scored:" + Players.batterTotalRuns(ref));
				break;
			case 4:// CALCULATE TOTAL WICKETS TAKEN
				System.out.println("Total Wickets Taken:" + Players.bowlerTotalWickets(ref));
				break;
			case 5:// WHO SCORED MAXIMUM RUNS
				System.out.println("Who Scored Maximum Runs:" + Players.maxRunBatter(ref).getName());
				break;
			case 6:// WHO TOOK MAXIMUM WICKETS
				System.out.println("Who Scored Maximum Runs:" + Players.maxWicketBowler(ref).getName());
				break;
			default:
				System.out.println("INVALID CHOICE ENTER AGAIN");
				break;
			}
		}
		System.out.println("Thank You..!");
		sc.close();
	}

}
