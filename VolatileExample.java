package delete;

class MyVolatile extends Thread
{
	String str;
	volatile int testValue=10;
	int i=20;
	public MyVolatile()
	{}
	public MyVolatile(String str)
	{
		super(str);
	}
	public void run()
	{
		for(int j=0;j<7;j++){
		System.out.println("Thread is going to check which thread "+getName());	
		if(getName().equals("Thread1"))
		{
			testValue++;
			i++;
			System.out.println("Thread 1 if loop testValue => "+testValue+"  i => "+i);
		}
		if(getName().equals("Thread2"))
		{
			System.out.println("Thread 2  testValue --> "+testValue+"  i -> "+i);
		}
		try{
		Thread.sleep(2000);
		}catch(InterruptedException ex){ex.printStackTrace();}
		}
	}
}

public class VolatileExample {

	public static void main(String[] args) {
	new MyVolatile("Thread1").start();
	new MyVolatile("Thread2").start();
	}

}
