class FinallyDemo1
{
	static void Print()
	{
	try
	{
	int a=5,b=0;
	System.out.println(a/b);
	}
	catch(ArithmeticException e)
	{
	System.out.println("This Is Arithmetic Exception");
	}
	finally
	{
	System.out.println("This is Finally Block");
	}
}
public static void main(String args[])
{
	Print();
}
}
