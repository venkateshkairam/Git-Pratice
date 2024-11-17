package Java8Features;
import java.util.*;
@FunctionalInterface
interface addition
{
	int add(int a,int b);
}
/*class addimpl implements addition
{
	public int add(int a,int b)
	{
		return(a+b);
	}
}*/
public class ParameterizedFunctionalInterface 
{

	public static void main(String[] args) 
	{
			//tradition approach
	/*	addition ad=new addimpl();
		int c=ad.add(30,65);
		System.out.println(c); */
		
			//lambda expression approach
		
		addition ad1=(a,b)->
		{
			return(a+b);
		};
		int c1=ad1.add(13,29);
		System.out.println(c1);
	}

}
