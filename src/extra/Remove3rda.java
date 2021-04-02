package extra;

import java.util.Arrays;

public class Remove3rda 
{

	public static void main(String[] args) 
	{
		String s1="ababcabcabcd";
		int ind=0;
		char a[]=new char[s1.length()-1];
		char c='a';
		int cnt=0;
		int ai=0;
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)==c)
			{
				cnt++;
				if(cnt==3)
				{
					ind=i;
					break;
				}
			}
		}
		for (int i = 0; i <ind; i++) 
		{
			a[ai++]=s1.charAt(i);
		}
		for (int i = ind+1; i < s1.length(); i++)
		{
			a[ai++]=s1.charAt(i);
		}
		String s2=new String(a);
		System.out.println(s2);

	}

}
