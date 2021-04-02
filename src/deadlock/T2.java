package deadlock;

public class T2 extends Thread
{
	Shop t1;
	Shop t2;

	public T2(Shop s2, Shop s1) 
	{
		super();
		this.t1 = s2;
		this.t2 = s1;
	}
	public void run() 
	{
		t1.print();
	}

}
