package com.preliumprepration;

public class SaddlePoint {

	public static void main(String[] args) 
	{
		int a[][]= {{6,3,1},
		{9,7,8},
		{2,4,5}};
		/*int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};*/
	
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			boolean small=true,large=true;
			for (int k = 0; k < a.length; k++) 
			{
				if(a[i][j]>a[i][k])
				{
					large=false;
				}
				if(a[i][j]<a[k][j])
				{
					small=false;
				}
			}
			if (small && large) 
			{
				System.out.println("Saddle point is : "+a[i][j]);
			}
		}
	}

	}

}
