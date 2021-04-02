/*Topic: Control Statements Part 2
 * 1)Write a program to print the first 15 numbers of the Pell series. In mathematics, the Pell
numbers are an infinite sequence of integers. The sequence of Pell numbers starts with 0 and
1, and then each Pell number is the sum of twice the previous Pell number and the Pell number
before that.: The first few terms of the
sequence are : 0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860,… (Feb
Monthly).*/
package com.preliumprepration;

public class PellSeries 
{
	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3,n=10;
		System.out.print(n1+" "+n2);
		for(int i=0;i<=n;i++)
		{
			n3=n2+n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
