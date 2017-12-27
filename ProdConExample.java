package com.practice.deleteit.later;

import java.util.Scanner;

/*Original Link : http://www.geeksforgeeks.org/inter-thread-communication-java/
 * */

public class ProdConExample
{
	public static void main(String args[])
	{
		final prodCon pc = new prodCon();   // Because you are creating thread through Annoymous class that's why it is demanding to declare as Final 
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try{
				pc.produce();
				}catch(Exception ex){}
			}
		});
		
		Thread t2 = new Thread(new Runnable()
		{
			@Override
			public void run() {
				try{
					pc.consume();
				}catch(Exception ex){}
				
			}
		});
		
		t1.start();
		t2.start();
	}

	static class prodCon
	{
		public void produce() throws InterruptedException
		{
			synchronized(this)
			{
				System.out.println("I am going to Produce");
				wait();
				System.out.println("Produce method REsumed");
			}
			
		}
		public void consume() throws InterruptedException
		{
			Scanner sc = new Scanner(System.in);
			synchronized(this)
			{
				System.out.println("Press any key to continue");
				sc.nextLine();
				notify();
				Thread.sleep(1000);
			}
		
		}
		
	}
}
