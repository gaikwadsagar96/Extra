package deadlock;

public class Shop 
{
	Shop s1;
	Shop s2;
	
	public Shop() { }
	public Shop(Shop s1, Shop s2) 
	 {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	synchronized void abcd(Shop s)
	 {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 s.print();
	 }
	synchronized void print()
	 {
	
		System.out.println("hi");
	 }

}
