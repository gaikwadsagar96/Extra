/* Topic: Control Statements Part 2
Write a program to display the Fibonacci series.
it is sequence where the next term is the sum of previous two term
0,1,2,3,5,8,13,21*/
package com.preliumprepration;

public class FibonassiSeries 
{
	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3,n=15;
		System.out.print(n1+ " "+n2);
		for(int i=2;i<=n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
