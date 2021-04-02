import java.util.Date;

public class DateDifference {

	public static void main(String[] args) 
	{
		/*Date d1=new Date("1 feb 2021");
		Date d2=new Date("20 feb 2021");
		Date t1=new Date();
		System.out.println(d1.compareTo(d2));
		System.out.println(d1);*/

		String s1="21-march-2021";
		String s2="21-march-2021";
		Date d1=new Date();
		System.out.println((d1.parse(s1)-d1.parse(s2))/(3600000*24));
	}

}
