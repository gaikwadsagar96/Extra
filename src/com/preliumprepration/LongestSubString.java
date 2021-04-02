package com.preliumprepration;

import java.util.Scanner;

public class LongestSubString 
{

	public static void main(String[] args) 
	{
		String s="abcabcdefcagt";
		char []c=s.toCharArray();
		int si=0,ei=0,max=0;
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = i+1; j < c.length; j++) 
			{
				boolean flag=false;
				for (int k = i; k < j; k++) 
				{
					if(c[k]==c[j])
					{
						flag=true;
					}
				}
				if(flag==true)
				{
					if(max<(j-i)|| j<c.length-1)
					{
						max=j-i;
						si=i;
						ei=j-1;
					}
					break;
				}
			}
		}
		System.out.println(max);
		for (int i = si; i < ei; i++) 
		{
			System.out.print(c[i]);
		}

	}

}
