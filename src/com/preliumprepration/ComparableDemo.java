package com.preliumprepration;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}


	public int compareTo(Student s) 
	{
		if(this.marks>s.marks)
			return -1;
		else if (this.marks<s.marks) 
			return 1;
		else 
			return this.name.compareTo(s.name);
	}


	@Override
	public String toString() {
		return "[name=" + name + ", marks=" + marks + "]\n";
	}
	
	
}
public class ComparableDemo {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList<>();
		al.add(new Student("vadan",  99));
		al.add(new Student("sagar",  99));
		al.add(new Student("akshay", 80));
		al.add(new Student("Harshad", 85));
		al.add(new Student("vaibhav", 95));
		al.add(new Student("Shubham", 70));
		al.add(new Student("Amar", 75));
		al.add(new Student("amol", 60));
		Collections.sort(al);
		System.out.println(al);
	}

}
