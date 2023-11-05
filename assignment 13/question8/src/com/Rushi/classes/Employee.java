package com.Rushi.classes;

import java.util.List;

public interface Employee {
	double getSal();
	default double calcIncentives() {
		return 0.0;
	}
	static double calcTotalIncome(List<Employee> arr)
	{
		double totalEmployeeIncome=0;
		for(int i=0;i<arr.size();i++)
		{
			totalEmployeeIncome= totalEmployeeIncome + arr.get(i).calcIncentives()+arr.get(i).getSal();
		}
		return totalEmployeeIncome;
	}
}
