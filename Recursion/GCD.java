package Recursion;
import java.util.*;
public class GCD {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b,result;
		
		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		result=gcd_of_two(a,b);
		
		System.out.println("gcd of two numbers="+result);
	}
		public static int gcd_of_two(int n1,int n2)
		{
			if(n1==0)
				return n2;
			if(n2==0)
				return n1;
			if(n1>n2)
				return gcd_of_two(n1%n2, n2);
			else
				return gcd_of_two(n1, n2%n1);
		}
}
