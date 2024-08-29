package Java;
//Implement a program in Java to implement Multi-threading using
//a) Thread Class
//b) Runnable Interface
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread Created using thread class: "+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}
}
class MyRunnable implements Runnable
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread Created using Runnable class: "+i);
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class MultiThread1
{
	public static void main(String[]args)
	{
		MyThread t1=new MyThread();
		t1.start();
		
		MyRunnable myRunnable=new MyRunnable();
		Thread t2=new Thread(myRunnable);
		t2.start();
	}
}