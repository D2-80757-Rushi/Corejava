package com.rushi.tester;
import java.util.Scanner;

import com.gaurav.classes.*;
public class Program {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welecome To Driving Cost Calculator");
		System.out.print("How Many Kilometers You Drive Per Day:");
		double totalKMSDrivenPerDay=sc.nextDouble();
		System.out.print("What is Fuel Price Per Litre:");
		double costPerLitres=sc.nextDouble();
		System.out.print("How Much Milage Does Your Vehicle Gives:");
		double milage=sc.nextDouble();
		System.out.print("How Much Parking Fees Do You Pay Per Day:");
		double parkingFeesPerDay=sc.nextDouble();
		System.out.print("How Much Toll Fees Do You Pay Per Day:");
		double tollsPerDay=sc.nextDouble();
		DrivingCost dc=new DrivingCost(totalKMSDrivenPerDay,costPerLitres,milage,parkingFeesPerDay,tollsPerDay);
		System.out.println("Your Daily Driving Cost :"+dc.calculateDrivingCost());
	}
}
