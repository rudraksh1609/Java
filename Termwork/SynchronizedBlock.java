package Java1609;
class CounterWithBlock 
{
    private int count = 0;
    public void increment() 
    {
        synchronized (this) 
        {
            count++;
        }
    }

    public int getCount() 
    {
        return count;
    }
}
class CounterWithBlockThread extends Thread 
{
    private CounterWithBlock counter;
    public CounterWithBlockThread(CounterWithBlock counter) 
    {
        this.counter = counter;
    }
    @Override
    public void run() 
    {
        for (int i = 0; i < 150; i++) 
        {
            counter.increment();
        }
    }
}
public class SynchronizedBlock 
{
	public static void main(String[] args) 
	{
        CounterWithBlock counter = new CounterWithBlock();
        Thread t1 = new CounterWithBlockThread(counter);
        Thread t2 = new CounterWithBlockThread(counter);
        t1.start();
        t2.start();
        try 
        {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("Final count: " + counter.getCount());
    }
}