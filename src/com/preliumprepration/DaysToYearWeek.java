//Write a program to input a number from the user and display the corresponding day of the week.
package com.preliumprepration;

public class DaysToYearWeek 
{

	public static void main(String[] args) 
	{
		int d=374;
		int year,week;
		year=d/365;
		d=d%365;
		week=d/7;
		d=d%7;
		System.out.println("Year: "+year+" week: "+week+" days: "+d);

	}

}
