package com.Rushi.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//In which collection classes null is not allowed? Duplicate null is not allowed? Multiple nulls are allowed?
public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new ArrayList<String>();		//null allowed 	//duplicate null allowed	//multiple nulls allowed
		//Collection<String> c = new HashSet<>();		//null allowed 	//duplicate null not allowed	//multiple nulls arent allowed
		//Collection<String> c = new LinkedHashSet<>();	//null allowed 	//duplicate null not allowed	//multiple nulls arent allowed
		//Collection<String> c = new TreeSet<>();		//null not allowed
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c);
	}
}
