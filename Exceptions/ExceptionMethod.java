class MyException extends RuntimeException
{
	private int details;
	MyException(int a)
	{
		details=a;
	}
	public String toString()
	{
		return "MyException"+details;
	}
}
class ExceptionMethod
{
	static void compute(int a) throws MyException  //called method
	{
		System.out.println("Called Compute:"+a);
		if(a>1)
		throw new MyException(a);
		System.out.println("Normal Exit");
	}
public static void main(String args[])
{
	try
	{
		compute(1); //calling method
		compute(20);
	}
	catch(MyException e)
	{
		System.out.println("Caught"+e);
	}
          }
}