package com.preliumprepration;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int a[]= {9,1,4,3,8,6,7,2,5};
		print(a,0);
		bubbleSort(a);
		System.out.println();
		print(a,0);
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

	private static void bubbleSort(int[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-i-1; j++) 
			{
				if(a[j+1]<a[j])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}

}
