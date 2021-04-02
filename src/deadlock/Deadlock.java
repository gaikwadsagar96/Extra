package deadlock;

public class Deadlock 
{

	public static void main(String[] args) 
	{
		Shop s1=new Shop();
		Shop s2=new Shop();
		T1 t1=new T1(s1,s2);
		T2 t2=new T2(s2,s1);
		t1.start();
		t2.start();
	}

}
