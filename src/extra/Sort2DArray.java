package extra;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort2DArray 
{

	public static void main(String[] args) 
	{
		int a[][]= {{1,6,3},
					{6,2,5},
					{5,9,2,0}};	
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				count++;
			}
		}
	
		//convert 2d to 1d
		int b[]=new int[count];
		int bi=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				b[bi++]=a[i][j];
			}
		}
		//sort
		//System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(b[i]<b[j])
				{
					int t=b[i];
					b[i]=b[j];
					b[j]=t;
				}
			}
		}
		//System.out.println(Arrays.toString(b));
		//convert to 2d array
		bi=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j]=b[bi++];
			}
		}
		System.out.println(Arrays.deepToString(a));
	}
}
