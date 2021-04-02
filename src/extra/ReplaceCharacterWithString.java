/*
**************************************Question 17*****************************
Wildcard Pattern Matching
Given two strings 'str' and a wildcard pattern 'pattern' of length N and M respectively,  You have to print '1' if the wildcard pattern is matched with str else print '0' .

The wildcard pattern can include the characters ‘?’ and ‘*’
‘?’ – matches any single character
‘*’ – Matches any sequence of characters (including the empty sequence)
Note: The matching should cover the entire str (not partial str).
 
Example 1:
Input:
pattern = "ba*a?"
str = "baaabab"
Output: 1
Explanation: replace '*' with "aab" and '?' with 'b'. 

â€‹Example 2:
Input:
pattern = "a*ab"
str = "baaabab"
Output: 0
Explanation: Because of'a' at first position,
pattern and str can't be matched. 

Your Task:
You don't need to read input or print anything. Your task is to complete the function wildCard() which takes the two strings 'pattern' and 'str' as input parameters and returns the answer.
 
Expected Time Complexity: O(N*M)
Expected Auxiliary Space: O(N*M)

Constraints:
1 <= length of(str,pat) <= 200
*/
package extra;
public class ReplaceCharacterWithString 
{
	public static void main(String[] args) 
	{
		String s="b?a*a";
		String s1="aab";
		char sa[]=s.toCharArray();
		char s1a[]=s1.toCharArray();
		sa=replaceChar(sa,s1a);
		String s3=new String(sa);
		System.out.println(s3);
	}
	private static char[] replaceChar(char[] sa, char[] s1a) 
	{
		char[] a1=new char[sa.length+s1a.length];
		int sal=0;
		int s1al=0;
		for (int i = 0; i < a1.length-1; i++) 
		{
			if(sa[sal]=='*')
			{
				sal++;
				for (int j = 0; j < s1a.length; j++) 
				{
					a1[i]=s1a[j];
					i++;
				}
				i--;
			}
			else if(sa[sal]=='?' && sal<=sa.length+1)
			{
				if(sal>=sa.length) 
				{
				for (int j = i; j < i+1; j++) 
				{
					a1[i]='b';
					i++;
					break;
				}
				i--;
				}
				else
				{
					sal++;
					for (int j = i; j < i+1; j++) 
					{
						a1[i]='b';
						i++;
						break;
					}
					i--;
				}
			}
			else if(sa[sal]!='*')
			{
				a1[i]=sa[sal++];
			}
		}
		return a1;
	}
}
