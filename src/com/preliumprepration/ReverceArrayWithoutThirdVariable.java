package com.preliumprepration;

import java.util.Arrays;

public class ReverceArrayWithoutThirdVariable {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int start=0;
		int end=a.length-1;
		System.out.println("Array Before Reverce"+Arrays.toString(a));
		while(start<end)
		{
			//xor for swapping the variable
			a[start]^=a[end];
			a[end]^=a[start];
			a[start]^=a[end];
			++start;
			--end;
		}
		
		System.out.println("Array after reverce"+Arrays.toString(a));

	}

}
