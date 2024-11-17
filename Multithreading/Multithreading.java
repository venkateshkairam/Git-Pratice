package Multithreading;
import java.lang.*;

public class Multithreading 
{

	public static void main(String[] args)
	{
			Runnable d1=()->
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("GOOD MORNING");
					try
					{
					Thread.sleep(1000);
					}
					catch(Exception e)
					{
					
					}
				}
			};
			Runnable d2=()->
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("GOOD EVENING");
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						
					}
				}
			};

			
			//d1.display();
			//d2.display();
			
			Thread t1=new Thread(d1);
			Thread t2=new Thread(d2);
			
			t1.start();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			t2.start();
	}

}
