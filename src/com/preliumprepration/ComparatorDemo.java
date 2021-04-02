/*Write a program to create class Student having name, rollNo ,marks as variables .Create and
add 8 Students .Display the data of students performing sorting depending on name and marks.(March
Monthly).*/
package com.preliumprepration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1
{
	String name;
	int marks;
	@Override
	public String toString() {
		return "name=" + name + ", marks=" + marks + "\n";
	}
	public Student1(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
class NameComparator implements Comparator<Student1>
{
	@Override
	public int compare(Student1 s1, Student1 s2) 
	{ 
		return s2.getName().compareTo(s1.getName());
	}
	
}
public class ComparatorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Student1> al=new ArrayList<>();
		al.add(new Student1("sagar", 99));
		al.add(new Student1("vaibhav", 90));
		al.add(new Student1("akshay", 85));
		al.add(new Student1("Harshad", 70));
		al.add(new Student1("amir", 91));
		Collections.sort(al, new NameComparator());
		System.out.println(al);
	}

}
