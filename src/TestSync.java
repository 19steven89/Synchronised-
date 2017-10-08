
public class TestSync implements Runnable
{
	private int balance;
	
	public void run()
	{
		for(int i = 0; i < 50; i++)
		{
			increment();
			System.out.println("balance is " + balance);
		}
	}
	
	//as 2 threads here run the same job, its important to use the synchronized key word 
	//this prevents the 2 threads from accessing this method at the same time
	//which could potentially lead to the balance being incorrecly overwritten by one thread while
	//the other is still updating it. Potentially stopping inconsistencies caused by threads running concurrently.

	public synchronized void increment()
	{
		int i = balance;
		balance = i + 1;
	}
}
