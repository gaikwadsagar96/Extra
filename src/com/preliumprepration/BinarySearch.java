/*Topic: Arrays
2. Write a program to perform binary search.
it requires sorted array
*/
package com.preliumprepration;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		BinarySearch bs=new BinarySearch();
		int a[]= {1,2,3,4,5,6,7,8,9};
		int key=1;
		int r=bs.binarySearch(a,key);
		if(r!=-1)
		{
			System.out.println("Element "+key+" is found at "+r+" location");
		}
		else
		{
			System.out.println("Element "+key+" is not found");
		}
	}

	private int binarySearch(int[] a,int key) 
	{
		int l=0,r=a.length-1;
		while(l<r)
		{
			int mid=(l+r)/2;
			if(a[mid]==key)
				return mid;
			if(key<a[mid]){
				r=mid;
			}
			else
				l=mid;
		}
		return -1;
	}

}
