/*Given K array where thre first array containd thr first prime numbers thr second array contains the next 2 prime and third array contains the next 
3 primes and so on.The task is to find sum of primes in the Kth array
input k=3
output 31
	arr[]={2}
	arr[]={3,5}
	arr[]={7,11,13}
	7+11+13=31
	input k=2
	output
	arr[]={2}
	arr[]={3,5}
	3+5=8
*/
package extra;

public class KthprimeArraySum 
{
	public static void main(String[] args) throws InterruptedException
	{
		int n=2;
		int k=2;
		int arrayCount = 0;
		int arraySize = 1;
		int count;
		int sum=0;
		while(true)
		{	
			if(prime(n))
			{
				//System.out.println(n+" ");
				arrayCount++;
				if(arraySize==k)
				{
					sum=sum+n;
					//System.out.print(sum+" ");
					
				}
				//System.out.print(arraySize+" ");
				if(arrayCount==arraySize)
				{
					arraySize++;
					if(arraySize>k)
						break;
					arrayCount=0;
				}
				count=0;
			}
			n++;
		}
		System.out.print("sum "+sum);
	}

	private static boolean prime(int n) 
	{
		for (int i = 2; i < n; i++) 
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
