package Recursion;
import java.util.*;
public class Sod 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n,result;
		
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		
		result=sum_of_digits(n);
		
		System.out.println("sum of digits of a number="+result);
	}

	public static int sum_of_digits(int n)
	{
		if(n!=0)
			return(n%10+sum_of_digits(n/10));
		else
			return 0;
	}
}
