class FinallyDemo2
{
	String name="sravan";
	int n1,n2;
	FinallyDemo2(String args[])	//Constructor
	{
	try
	{
	n1=Integer.parseInt(args[0]);
	n2=Integer.parseInt(args[1]);
	System.out.println(name);
	System.out.println("Division Value is:"+n1/n2);
	}
	catch(Exception e)
	{
	System.out.println("Cannot Devide By Zero"+e);
	}
	finally
	{
	System.out.println(name);
	System.out.println("Finally Block Executed");
	System.out.println(name);
	}
}
public static void main(String args[])
{
	new FinallyDemo2(args);
}
}