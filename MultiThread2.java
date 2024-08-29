package Java;
class MyThread1 implements Runnable
{
	public void run() 
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("MY THREAD");
		}
	}
}
public class MultiThread2 
{
	public static void main(String[] args) 
	{
		MyThread1 myThread=new MyThread1();
		Thread tr=new Thread(myThread);
		tr.start();
		for (int i=0;i<10;i++)
		{
			System.out.println("MAIN THREAD");
		}
	}
}
