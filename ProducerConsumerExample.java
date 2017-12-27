package delete;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Message
{
	String msg;
	
	Message(String s)
	{
		this.msg=s;
	}
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
	public String getMsg()
	{
		return msg;
	}
}

class Producer implements Runnable
{
	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> q) {
	 this.queue=q;
	}
	
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			Message msg = new Message(" "+i);
			try{
				Thread.sleep(1000);
				queue.put(msg);
				System.out.println("Queue has produced "+msg.getMsg());
			 }catch(InterruptedException ex){ex.printStackTrace();}
		}
		try{queue.put(new Message("exit"));}catch(InterruptedException ex){ex.printStackTrace();}
	}

}

class Consumer implements Runnable
{
	BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> q) {
		this.queue=q;
	}
	
	public void run()
	{
		Message msg;
		try {
			while((msg= queue.take()).getMsg() != "exit")
			{
				System.out.println("Queue has consumed => "+msg.getMsg());
			}
		} catch (InterruptedException e) {e.printStackTrace();}
	}

}

public class ProducerConsumerExample {

	public static void main(String[] args) {
		BlockingQueue<Message> sharedqueue = new ArrayBlockingQueue<Message>(10);
	Producer prod = new Producer(sharedqueue);
	Consumer cons = new Consumer(sharedqueue);
	Thread t1 = new Thread(prod, "Producer");
	Thread t2 = new Thread(cons, "Consumer");
	t1.start();
	t2.start();
	System.out.println("Producer and Consumer has been started");
	}

}
