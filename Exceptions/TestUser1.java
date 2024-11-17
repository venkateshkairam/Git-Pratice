//import java.lang.*;
class TestUser1 extends Exception
{
	TestUser1(String message)
	{
	super(message);
	}
	
	public static void main(String args[])
	{
                int x=5;
		int y=1000;
	try
	{
		float z=(float)x/(float)y;
		if(z<0.01)
		{
		throw new TestUser1("Num is Too Small");
		}
	}
	catch(TestUser1 e)
	{
		System.out.println("Caught My Exception");
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("I am Always Here");
	}
        }
}
