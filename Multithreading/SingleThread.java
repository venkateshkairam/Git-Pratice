package Multithreading;
import java.lang.*;
public class SingleThread {

	public static void main(String[] args) 
	{
		SingleThread st=new SingleThread();
		for(int i=1;i<=200;i++)
			System.out.println(i);
		display();
	}
	static void display()
	{
		for(int i=1;i<=200;i++)
			System.out.println(i);
	}
}
