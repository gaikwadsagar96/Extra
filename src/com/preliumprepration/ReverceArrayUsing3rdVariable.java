//topic array
//Write a program to find and display reverse of an array using third variable
package com.preliumprepration;

import java.util.Arrays;

public class ReverceArrayUsing3rdVariable 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int l=0,r=a.length-1;
		for (int i = 0; i < a.length/2; i++) 
		{
			int t=a[l];
			a[l]=a[r];
			a[r]=t;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(a));
		

	}

}
