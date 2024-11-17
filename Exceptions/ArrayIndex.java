class ArrayIndex
{
	public static void main(String args[])
	{
	try
	{
	int arr[]=new int[5];
	arr[0]=100;
	arr[1]=200;
	arr[2]=300;
	arr[3]=400;
	arr[4]=500;
	arr[5]=600;
	System.out.println("First Element is:"+arr[0]);
	System.out.println("Second Element is:"+arr[1]);
	System.out.println("Third Element is:"+arr[2]);
	System.out.println("Fourth Element is:"+arr[3]);
	System.out.println("Fifth Element is:"+arr[4]);
	System.out.println("Sixth Element is:"+arr[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Sorry.......Venki Arry is Out of Bound");
	}
	}
}


	