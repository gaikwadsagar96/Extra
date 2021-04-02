//11) Write a program to remove the duplicate elements of a given array and return the new length of the array.
package com.preliumprepration;

public class RemoveDuplicateDecreaseArrayLeength 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,7,3,6,2,7,3,4,5,8};
		int dcnt=0;
		System.out.println("Before removing duplicates");
		print(a,0);
		for (int i = 0; i < a.length; i++) 
		{	
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j] && a[j]!=0)
				{
					a[j]=0;
					dcnt++;
				}
			}
		}
		a=remove(a,dcnt);
		System.out.println("\nafter remove duplicate");
		print(a,0);
		
	}

	private static int[] remove(int[] a, int dcnt) 
	{
		int a1[]=new int [a.length-dcnt-1];
		int j=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				a1[j]=a[i];
				j++;
			}
			else {
				i++;
			}
		}
		return a1;
	}

	private static void print(int[] a, int i) 
	{
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			i++;
			print(a,i);
		}
	}

}
