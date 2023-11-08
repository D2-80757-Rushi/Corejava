package com.Rushi.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Write a program to calculate sum of 10 random integers using streams.
public class Program {
	public static void main(String[] args) {
		System.out.print("RANDOM INTEGER SUM:");
		List<Integer> list=new ArrayList<Integer>();
		Double d=Stream.generate(()->Math.floor(Math.random()*10)).limit(10).reduce(1.0, (x,y) -> x+y);
		System.out.println(d);
	}
}
