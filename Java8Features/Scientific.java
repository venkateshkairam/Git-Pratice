package Java8Features;

public class Scientific 
{
	//static methods
	public static void findSum(int x,int y)
	{
		System.out.println("sum="+(x+y));
	}
	public static void findDivision(int x,int y)
	{
		System.out.println("Division="+(x/y));
	}
	//instance method or non-static method
	public void findProduct(int x,int y)
	{
		System.out.println("Product="+(x*y));
	}
}
