package deadlock;

public class T1 extends Thread
{
	Shop t1;
	Shop t2;
	
	public T1(Shop s1, Shop s2) 
	{
		super();
		this.t1 = s1;
		this.t2 = s2;
	}

	public void run() 
	{
		t1.print();
		
	}
}
