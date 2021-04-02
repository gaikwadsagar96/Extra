/*Topic: Control Statements Part 2
2)Write a program to check whether a number is a Harshad Number or not.
In recreational mathematics, a harshad number in a given number base, is an integer that is
divisible by the sum of its digits when written in that base.
Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0)
and 200 is divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7
and 1 is 9(1+7+1) and 171 is divisible by 9.
harshad numbers are 9,12,18,20,21,24,27,45,48,111,117,180,195
*/
package com.preliumprepration;

public class HarshadNumber 
{

	public static void main(String[] args) 
	{
		int num=200,sum=0;
		int c;
		int temp=num;
		while(temp!=0)
		{
			c=temp%10;
			sum=sum+c;
			temp=temp/10;
			
		}
		if(num%sum==0)
			System.out.println("harshad number");
		else
			System.out.println("Not Harshad bumber");
	}

}
