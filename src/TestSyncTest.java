
public class TestSyncTest 
{
	public static void main(String[] args)
	{
		//create new runnable  - TestSync
		//create 2 threads which run the same job
		//start them which calls the runnable run method
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.start();
		b.start();
	}
	
}
