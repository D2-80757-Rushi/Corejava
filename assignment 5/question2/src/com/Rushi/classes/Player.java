package com.Rushi.classes;

import java.util.Objects;
import java.util.Scanner;

public abstract class Player {
	private int id;
	private String name;
	private int age;
	private int matchesPlayed;
	
	public Player() {
		
	}
	public Player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}

	@Override
	public String toString() {
		return "ID:" +id+ "\nName:" +name+ "\nAge:"+age+"\nMatches Played:"+matchesPlayed;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, matchesPlayed, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return age == other.age && id == other.id && matchesPlayed == other.matchesPlayed
				&& Objects.equals(name, other.name);
	}
	public void acceptData(Scanner sc)
	{
		System.out.println("Enter Player Details:");
		System.out.print("ID:");
		this.id=sc.nextInt();
		System.out.print("Name:");
		this.name=sc.next();
		System.out.print("Age:");
		this.age=sc.nextInt();
		System.out.print("Matches Played:");
		this.matchesPlayed=sc.nextInt();
	}
	
}
