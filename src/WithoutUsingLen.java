
public class WithoutUsingLen {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		int cnt=0;
	
			try {
				for (int j = 0; ; j++) {
					int t=a[j];
					cnt++;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(a.length);
		System.out.println("length of array: "+cnt);
	}

}
