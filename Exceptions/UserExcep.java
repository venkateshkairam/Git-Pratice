class X extends Exception
{
	X(String message)
	{
		super(message);
		//this.message=message;
	}
}
class UserExcep
{
	public static void main(String args[])
	{
		int x,y;
		x=50;
		y=2;
		try
		{
			int r;
			r=x*y;
		if(r>=100)
		{
		throw new X("You Are Right Person");
		}
		}
	catch(X e)
	{
		System.out.println("Exception is Caught");
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("Finally Block is Always Executed");
	}
          }
}