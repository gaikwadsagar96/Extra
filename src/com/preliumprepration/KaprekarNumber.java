/*Topic: Control Statements Part 2
21.Given a number, the task is to check if it is Kaprekar number or not. A
Kaprekar number is a number whose square when divided into two parts and
such that sum of parts is equal to the original number.
kaprekar numbers- 9,45,55,99,297,703
*/
package com.preliumprepration;

import java.util.Scanner;

public class KaprekarNumber 
{

	public static void main(String[] args) 
	{
		int rem,div,NoOfdigit=1,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check it is kaprekar: ");
		int num=sc.nextInt();
		int temp=num;
		int sqr=num*num;
		while(temp!=0)
		{
			NoOfdigit=NoOfdigit*10;
			temp=temp/10;
		}
		rem=sqr%NoOfdigit;
		div=sqr/NoOfdigit;
		sum=rem+div;
		if(num==sum)
		{
			System.out.println("kaprekar number");
		}
		else
		{
			System.out.println("Not Kaprear number");
		}

	}

}
