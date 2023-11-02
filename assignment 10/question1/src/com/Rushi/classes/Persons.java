package com.Rushi.classes;

public class Persons {
	
	public static double averageSalClerks(Person[]arr)
	{	
		int noOfClerks=0;
		double totalSalary=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof Clerk)
			{
				Clerk cref=(Clerk)arr[i];
				totalSalary=totalSalary+cref.calculateSalary();
				noOfClerks++;
			}
		}
		return (totalSalary/noOfClerks);
	}
	public static double averageSalLabours(Person[]arr)
	{	
		int noOfLabours=0;
		double totalSalary=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof Labour)
			{
				Labour lref=(Labour)arr[i];
				totalSalary=totalSalary+lref.calculateSalary();
				noOfLabours++;
			}
		}
		return (totalSalary/noOfLabours);
	}
	public static double averageSalSalesman(Person[]arr)
	{	
		int noOfSalesman=0;
		double totalSalary=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof Salesman)
			{
				Salesman sref=(Salesman)arr[i];
				totalSalary=totalSalary+sref.calculateSalary();
				noOfSalesman++;
			}
		}
		return (totalSalary/noOfSalesman);
	}
}
