/*Topic: Methods

 * 2) Write a program to show method overloading by performing following steps:
Create a class to print the area of a square, a rectangle and a triangle. The class
has3 methods with the same name but different number of parameters. The
method for printing area of rectangle has two parameters which are length and
breadth respectively, for printing the area of triangle method has 3 parameters
and while the other method for printing area of square has one parameter which
is side of square.*/

package com.preliumprepration;

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
		m.area(12,13,14);
		m.area(12,10);
		m.area(12);
		
	}

	private void area(int i) 
	{
		System.out.println("Area of square:"+4*i);
	}

	private void area(int i, int j) 
	{
		System.out.println("area of Rectangle: "+(i*j)/2);
		
	}

	private void area(int i, int j, int k) 
	{
	System.out.println("Area of Triangle: "+i*j*k);
		
	}

}
