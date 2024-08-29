package Java;
class Shop
{
	boolean item_present=false;
	int item;
	synchronized public void produce(int x)
	{
		if(item_present)
		{
			try
			{
				System.out.println("Producer will wait for consumer to consume");
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		item=x;
		System.out.println(item+"  has been produced");
		item_present=true;
		notify();
	}
	synchronized public void consume()
	{
		if(!item_present)
		{
			try 
			{
				System.out.println("Consumer is waiting for producer to produce");
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Item is consumed by consumer");
		item_present=false;
		notify();
	}
}
class producer extends Thread
{
	Shop s;
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			s.produce(i);
		}
	}
	producer(Shop s)
	{
		this.s = s;
	}
}
class consumer extends Thread
{
	Shop s;
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			s.consume();
		}
	}
	consumer(Shop s) 
	{
		this.s = s;
	}
}
public class SPC 
{
	public static void main(String[]args) 
	{
		Shop so=new Shop();
		producer pr = new producer(so);
		consumer cr=new consumer(so);
		pr.start();
		cr.start();
	}
}