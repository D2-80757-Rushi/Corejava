package com.Rushi.tester;

import com.Rushi.classes.Check;

public class Program {
	static <T> int countif(T[]arr,T key, Check<T> c)
	{
		int counter=0;
		for(int i=0;i<arr.length;i++)
		{
			if(c.compare(arr[i], key))
			{
				counter++;
			}
		}
		return counter;	
	}
	public static void main(String[] args) {
		Double []arr= {2.25,2.69,2.73,2.45,2.25,2.75,2.28,2.25,7.70,0.0};
		System.out.println("How Many Times Key is Repeated:"+Program.countif(arr, 2.25, (a,b)-> a.equals(b)));
	}

}
