/*Topic: Arrays
3. Write a program sort array elements in using selection sort.
algorithm
find minimum element in arr[0...4]
place it begining
find the minimum element in arr[1...4]
place it begining of arr[1...4]
find the minimum element in arr[2...4]
place it begining of arr[2...4]
*/
package com.preliumprepration;

import java.util.Arrays;

public class SelctionSort 
{

	public static void main(String[] args) 
	{
	 int a[]= {7,1,8,4,9,2,5,3,6};
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]<a[j])//compare 1st element with next element
			 {
				 int t=a[i];//if true swap
				 a[i]=a[j];
				 a[j]=t;
			 }
		 }
	 }
	 System.out.println(Arrays.toString(a));

	}

}
