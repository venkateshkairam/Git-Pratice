class FinallyDemos
{
	String name;
	int no1,no2;
	FinallyDemos(String args[])	//Constructor
	{
	try
	{
		name=new String("Oracle Limited");
		no1=Integer.parseInt(args[0]);
		no2=Integer.parseInt(args[1]);
		System.out.println(name);
		System.out.println("Division Result:"+no1/no2);
	}
	catch(ArithmeticException i)
	{
		System.out.println("Cannot Devide by zero");
	}
	finally
	{
		//name=null;		//Clean up code
		System.out.println("Finally Executed");
	}
	}
public static void main(String args[])
	{
		new FinallyDemos(args);
	}
}