package com.Rushi.tester;

public class Program {

	static <T extends Number> double calculateMinimum(T[]arr)
	{
		double min=arr[0].doubleValue();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].doubleValue() < min)
			{
				min=arr[i].doubleValue();
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Integer[] arr1= {1,2,3,4,5,6,7,8,9};
		Float[]arr2= {1.28f,2.25f,3.36f,4.75f,5.98f,6.98f,8.85f,1.48f};
		Double[]arr3= {1.28,2.56,99.69,4.75,5.24,3.15,3.17,0.25};
		System.out.println("Minimum of Arr1:"+calculateMinimum(arr1));
		System.out.println("Minimum of Arr2:"+calculateMinimum(arr2));
		System.out.println("Minimum of Arr3:"+calculateMinimum(arr3));
	}

}
