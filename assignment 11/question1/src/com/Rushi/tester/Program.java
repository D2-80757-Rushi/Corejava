package com.Rushi.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Program {
	static <T> void selectionSort(T[] arr,Comparator<T> c)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((c.compare(arr[i], arr[j])>0))
					{
						T temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			}
		}
	}
	
	public static void main(String[] args) {
		class DoubleComparator implements Comparator<Double>{
			@Override
			public int compare(Double arg0, Double arg1) {
				return Double.compare(arg0, arg1);
			}
		}
		Double []arr= {9.20,2.23,2.58,2.75,6.59,7.68};
		System.out.println("Before Sort Array:"+ Arrays.toString(arr));
		DoubleComparator d =new DoubleComparator();
		Program.selectionSort(arr,d);
		System.out.println("After Sort Array:"+ Arrays.toString(arr));
	}
}
