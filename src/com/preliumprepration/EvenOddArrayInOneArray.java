package com.preliumprepration;

public class EvenOddArrayInOneArray 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int k=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
				k++;
			}
		}
		for(int p:a)
			System.out.print(p+" ");
		
		
		/*
		 *positive first
		 * int a[]= {1,-2,3,4,-5,6,-7,8,9};
		int k=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>0)
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
				k++;
			}
		}
		for(int p:a)
			System.out.print(p+" ");*/


	}

}
