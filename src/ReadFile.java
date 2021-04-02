import java.io.File;
import java.util.Scanner;

public class ReadFile 
{

	public static void main(String[] args) 
	{
	try {

		File fo=new File("D:\\2021 new Starting/booklet/arrays/src/com/hefshine/hw/q18_evenoddseprateonearray.java");
		Scanner sc=new Scanner(fo);
		while(sc.hasNextLine())
		{
			String data=sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	}catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}

	}

}
