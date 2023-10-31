package com.Rushi.classes;

public class DrivingCost {
	private double totalKMSDrivenPerDay;
	private double costPerLitres;
	private double milage;
	private double parkingFeesPerDay;
	private double tollsPerDay;
	
	public DrivingCost(double totalKMSDrivenPerDay, double costPerLitres, double milage, double parkingFeesPerDay,
			double tollsPerDay) {
		super();
		this.totalKMSDrivenPerDay = totalKMSDrivenPerDay;
		this.costPerLitres = costPerLitres;
		this.milage = milage;
		this.parkingFeesPerDay = parkingFeesPerDay;
		this.tollsPerDay = tollsPerDay;
	}

	public double calculateDrivingCost()
	{
		return (parkingFeesPerDay+tollsPerDay+(totalKMSDrivenPerDay/milage)*costPerLitres);
	}
}
