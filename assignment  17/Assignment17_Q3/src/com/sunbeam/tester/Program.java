package com.sunbeam.tester;

import java.util.stream.IntStream;

public class Program {
	public static void main(String[] args) {
		IntStream onetoten=IntStream.range(1, 11);//range(inclusive, exclusive)
		System.out.println("Sum:"+onetoten.sum()); 
//		IntSummaryStatistics stats=onetoten.summaryStatistics();
//		System.out.println("Statistics:"+stats.toString());
		System.out.println( IntStream.range(1, 11).summaryStatistics().toString());
	}
}
