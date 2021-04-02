package com.preliumprepration;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) 
	{
		int a[][]= {{6,3,1},
				{9,7,8},
				{2,4,5}};
		int b[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int c[][]=new int[3][3];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				int sum=0;
				for (int k = 0; k < a.length; k++) 
				{
					sum=sum+a[i][k]*b[j][k];
				}
				c[i][j]=sum;
			}
		}
		System.out.println(Arrays.deepToString(c));
	}

}
