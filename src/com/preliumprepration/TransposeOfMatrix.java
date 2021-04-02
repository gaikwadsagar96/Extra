//transpose of matrix jugad
package com.preliumprepration;

public class TransposeOfMatrix {

	public static void main(String[] args) 
	{
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int a1[][] = new int[a.length][a[0].length];
		int i, j;
		// original array print
		for (int j2 = 0; j2 < a.length; j2++) 
		{
			for (int k = 0; k < a.length; k++) 
			{
				System.out.print(a[j2][k]+" ");
			}
			System.out.println();
		}
		System.out.println();

		//transpose
		for(i=0;i<a.length;i++) 
		{
			for(j=0;j<a.length;j++) 
			{
				a1[i][j]=a[j][i];		
			}
		}
		//print
		for(i=0;i<a1.length;i++) 
		{
			for(j=0;j<a1.length;j++) 
			{
				System.out.print(a1[i][j]+" ");		
			}
			System.out.println();
		}
	}

}
