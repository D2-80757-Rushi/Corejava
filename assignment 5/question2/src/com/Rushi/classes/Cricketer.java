package com.Rushi.classes;

import java.util.Objects;
import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {
	private int runs;
	private int wickets;

	public Cricketer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(runs, wickets);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cricketer other = (Cricketer) obj;
		return runs == other.runs && wickets == other.wickets;
	}

	public Cricketer(int id, String name, int age, int matchesPlayed) {
		super(id, name, age, matchesPlayed);
		// TODO Auto-generated constructor stub
	}

	public Cricketer(int id, String name, int age, int matchesPlayed, int runs, int wickets) {
		super(id, name, age, matchesPlayed);
		this.runs = runs;
		this.wickets = wickets;
	}

	@Override
	public int getwickets() {
		// TODO Auto-generated method stub
		return this.wickets;
	}

	@Override
	public int getEconomy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return this.runs;
	}

	@Override
	public int getAverage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStrikeRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRuns:" + runs + "\nWickets:" + wickets;
	}

	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Cricketer Details:");
		System.out.print("Runs:");
		this.runs = sc.nextInt();
		System.out.print("Wickets:");
		this.wickets = sc.nextInt();
	}
}
