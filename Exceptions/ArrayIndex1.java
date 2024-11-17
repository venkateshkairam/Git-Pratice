class ArrayIndex1
{
	public static void main(String args[])
	{
	int sub[]={30,40,50,60};
	try
	{
        System.out.println(sub[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println(e.getMessage());
	//System.out.println("Array Elements Does Not Exist"+e);
	}
	System.out.println("Okay");	
	}
}
