package com.preliumprepration;

class ProduceT extends Thread 
{
	ConsumerProduce c;
	int i=0;
	public ProduceT(ConsumerProduce c) 
	{
		this.c = c;
	}
	public void run() 
	{
		while(true)
		{
			c.produce(i++);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ConsumeT extends Thread 
{
	ConsumerProduce c;
	public ConsumeT(ConsumerProduce c) 
	{
		this.c = c;
	}

	public void run() 
	{
		while(true)
		{
			c.consume();
		}
	}
}

class ConsumerProduce
{
	int stock = 0;
	boolean set=false;
	synchronized public void produce( int stock) 
	{
		if (set==true) 
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.stock=stock;
		System.out.println("produce stock: "+stock);
		set=true;
		notifyAll();
	}

	synchronized public void consume() 
	{
		if (set==false) 
		{
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("consume stock: " + stock);
		set=false;
		notify();
	}
}

public class ConsumerProduceDemo
{
	public static void main(String[] args) 
	{
		ConsumerProduce c = new ConsumerProduce();
		ProduceT t1 = new ProduceT(c);
		ConsumeT t2 = new ConsumeT(c);
		t1.start();
		t2.start();
	}

}
