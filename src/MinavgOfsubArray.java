//
public class MinavgOfsubArray 
{
	static int[]a= {3,7,90,20,5,50,40};
	public static void main(String[] args) 
	{
		//mind stick 26 least min of sub array
		int k=3;
		//-------------------
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length-k+1; i++) 
		{
			int avg=sum(i,k,0)/k;
			if(min>avg)
				min=avg;
		}
		System.out.println(min);
	}
	private static int sum(int i, int k, int j) 
	{
		if(j<k)
			return a[i]+sum(i+1,k,j+1);
		else
			return 0;
		//-----------------
		/*int sum=0;
		int cnt=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			cnt++;
			if(cnt==k)
			{
				if(min>sum/k)
					min=sum/k;
				sum=0;
				cnt=0;
				i=i-k+1;
				System.out.println(min);
			}
		}*/
	}
}
