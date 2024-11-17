package Java8Features;
import java.util.*;
@FunctionalInterface
interface First
{
	void m1(); //abstract method
	static void m2() //static method
	{
		System.out.println("static method of First Interface");
	}
	default void m3()  //default method
	{
		System.out.println("default method of First Interface");
	}
}
class Second implements First
{
	public void m1()
	{
		System.out.println("abstrac method implementation of First Interface");
	}
}
public class FunctionalInterfaceDemo 
{

	public static void main(String[] args) 
	{
			First f=new Second();
			
			f.m1();
			f.m3();
			First.m2();
		
	}

}
