	package com.Rushi.tester;
	
	import java.util.Arrays;
import java.util.Comparator;
	
	import com.Rushi.classes.Student;
	
	public class Program {
	    public static void main(String[] args) {

	        Student[] sarr = new Student[] {
	                new Student(101, "Rohit", "Kolhapur", 89),
	                new Student(102, "Ganesh", "Mumbai", 21),
	                new Student(103, "Pande", "Kolhapur", 43),
	                new Student(108, "Appa", "Nanded", 78),
	                new Student(104, "Kapil", "Pune", 35),
	                new Student( 69, "Manoj", "Latur", 35),
	                new Student(111, "Niraj", "Nashik", 88),
	                new Student(112, "Ganesh", "Sambhajinagar", 99),
	                new Student(105, "Rohit", "Kolhapur", 100),
	                new Student(135, "Avinash", "Nashik", 55),
	                new Student(116, "Shreyash", "Pune", 25),
	                new Student(199, "Appa", "Pune", 37),
	        };
	        // COMPARATOR CLASS
//	        1st level sorting should be on city (desc), 2nd level sorting should be on marks (desc),
//	        3rd level sorting should be on name (asc).
	        class StudentCityDescMarksDescNameAsc implements Comparator<Student> {
	            @Override
	            public int compare(Student s1, Student s2) {
	                int diff=-s1.getCity().compareTo(s2.getCity());
	                if(diff==0)
	                		diff=-Double.compare(s1.getMarks(), s2.getMarks());
	                if(diff==0)
	                		diff=s1.getName().compareTo(s2.getName());
	                return diff;
	            }
	        }
	        System.out.println("Before Sort");
	        for (int i = 0; i < sarr.length; i++) {
	            System.out.println(sarr[i]);
	        }
	        Arrays.sort(sarr,new StudentCityDescMarksDescNameAsc());
	        System.out.println("After Sort");
	        for (int i = 0; i < sarr.length; i++) {
	            System.out.println(sarr[i]);
	        }
	    }
	}
		
