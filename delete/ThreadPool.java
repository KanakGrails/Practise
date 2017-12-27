package delete;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String args[]){
	ExecutorService executor = Executors.newFixedThreadPool(10);

	for(int i=0;i<10;i++)
	{
		worker work = new worker(" "+i);
		executor.execute(work);
	}
	executor.shutdown();
	while(executor.isTerminated())
	{
		System.out.println("It is waiting for temination");
	}
	System.out.println("All thread finish");
}

}
class worker extends Thread
{
	public worker(String msg){
	super(msg);
	}
	
	public void run()
	{
		System.out.println("Start-> "+Thread.currentThread().getName());
		process();
		System.out.println("End-> "+Thread.currentThread().getName());
	}
	
	public void process()
	{
		try{
		Thread.sleep(2000);
		}catch(InterruptedException ex){ex.printStackTrace();}
	}
}
