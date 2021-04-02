package com.preliumprepration;

public class ReverceArrayWithoutLoop 
{

	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7,8,9};
		System.out.println("before reverce");
		print(a,0);
		reverceArray(a,0);
		System.out.println("\nafter reverce");
		print(a,0);
	}

	private static void reverceArray(int[] a, int startPoint)
	{
		if(startPoint>=a.length/2)
		{
			return;
		}
		int temp=a[startPoint];
		a[startPoint]=a[a.length-1-startPoint];
		a[a.length-1-startPoint]=temp;
		reverceArray(a, ++startPoint);
		
	}

	private static void print(int[] a, int i)
	{
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			i++;
			print(a, i);
		}
		
		
	}

}
