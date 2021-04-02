//Write a program to find Length of the longest substring without repeating characters.
package com.preliumprepration;
public class SubString 
{
	public static void main(String[] args) 
	{
		String s="abcabdabc";
		char c[]=s.toCharArray();
		int si=0;
		int ei=0;
		int max=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				boolean flag=false;
				for(int k=i;k<j;k++)
				{
					if(c[k]==c[j]||j==c.length-1)
					{
						flag=true;
					}
				}
				if(flag==true)
				{
					if(max<(j-i))
					{
						max=(j-i);
						si=i;
						ei=j-1;
					}
					break;
				}
			}
		}
		System.out.println(max);
		for(int i=si;i<=ei;i++)
		{
			System.out.print(c[i]);
		}

	}

}
