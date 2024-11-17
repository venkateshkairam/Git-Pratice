package Multithreading;
import java.lang.*;
public class JoinisAlivemethods
{
	public static void main(String[] args) throws Exception
	{
		Runnable r1=()->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("WELCOME"+Thread.currentThread().getName());
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		};
		Runnable r2=()->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("GOOD BYE"+Thread.currentThread().getName());
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		t1.start();
		try {Thread.sleep(500);} catch(Exception e) {}
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
	//	System.out.println(t1.getName());
	//	System.out.println(t2.getName());
		
		t1.setName("FIRST THREAD");
		System.out.println(t1.getName());	
		t2.setName("SECOND THREAD");
		System.out.println(t2.getName());	
		
		//System.out.println(t1.getPriority());
		//System.out.println(t2.getPriority());
		
		t1.setPriority(2);
		t2.setPriority(9);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		
				
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println("Happy coding");
	}

}
