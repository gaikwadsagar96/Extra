package com.preliumprepration;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SuffleArray 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		suffleAraay(a);

	}

	private static void suffleAraay(int[] a) 
	{
		Random r=ThreadLocalRandom.current();
		for (int i = a.length-1; i > 0;i--) 
		{
			int in=r.nextInt(i+1);
			//swap
			int t=a[in];
			a[in]=a[i];
			a[i]=t;
		}	
		System.out.println(Arrays.toString(a));
	}

	
}
