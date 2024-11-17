class ArraySizeException extends NegativeArraySizeException 
{
	ArraySizeException()	//Constructor
	{
		super("You Have Passed Illegal Array Size");
	}
}
class ThrowDemo
{
	int size,array[];
	ThrowDemo(int s)
	{
		size=s;
	try
	{
		checksize();
	}
	catch(ArraySizeException e)
	{
		System.out.println(e);
	}
	}	
	void checksize() throws ArraySizeException
	{
		if(size<0) throw new ArraySizeException();
		array=new int[4];
		for(int i=0;i<4;i++)
		array[i]=i+1;
		System.out.println(array[3]);
	}
public static void main(String args[])
	{
		new ThrowDemo(Integer.parseInt(args[0]));
	}	
}