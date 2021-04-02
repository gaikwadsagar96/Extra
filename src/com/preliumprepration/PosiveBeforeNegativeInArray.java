/*Write a program to arrange the elements of an given array of integers where all positive
integers appear before all the negative integers.
*/
package com.preliumprepration;

import java.util.Arrays;

public class PosiveBeforeNegativeInArray 
{

	public static void main(String[] args) 
	{
		int a[]= {1,5,9,-7,-5,6,-1,-8,-3,8,-2,2};
		int j=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
