class Demo1
{
public static void main(String args[])
{
try
{
int x,y,z;
x=10;
y=0;
z=x/y;
System.out.println("Result is:"+z);	
}
catch(ArithmeticException e)
{
System.out.println(" This Is Arithametic Exception");
}
}
}