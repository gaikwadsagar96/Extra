/*Topic: Arrays
Number of unique pairs in an array. Give nan array of N elements, that ask is to find all the unique
pairs that can be formed using the elements of a given array.(MarchMonthly).
Examples: Input: arr[] = {1, 1, 2}
Output: 4
(1, 1), (1, 2), (2, 1), (2, 2) are the only possible pairs.
Input: arr[] = {1, 2, 3}
Output: 9*/
package com.preliumprepration;

public class UniquePair 
{
	public static void main(String[] args) 
	{
		int a[]= {0,1,2,3};
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
					a[j]=' ';
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]!=' ' && a[j]!=' ')
				{
					System.out.print("("+a[i]+","+a[j]+")");
					cnt++;
				}
			}
		}
		System.out.println("\nPossible pairs: "+cnt);
	}

}
