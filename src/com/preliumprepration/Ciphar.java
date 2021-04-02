/*Exchange Cipher (String & char)This simple cipher exchanges 'A' and 'Z', 'B' and 'Y',
'C' and 'X', and so on. Write a program called Exchange Cipher that prompts user for a
plaintext string consisting of mix-case letters only. Your program shall compute the cipher
text; and print the cipher text in uppercase. For examples, Enter a plaintext string: abcXYZ
The cipher text string is: ZYXCBA (March Monthly)*/
package com.preliumprepration;

import java.util.Arrays;

public class Ciphar {

	public static void main(String[] args) 
	{
		String s="abcpQrXYZ";
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>='a' && c[i]<='z')
			{
				c[i]=(char)(187-c[i]);
			}
			else if(c[i]>='A' && c[i]<='Z')
			{
				c[i]=(char)(155-c[i]);
			}
			System.out.print(c[i]);
		}
		
		//System.out.println(Arrays.toString(c));
	}

}
