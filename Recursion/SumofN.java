package Recursion;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n,result;
		
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		
		result=sum_of_n(n);
		
		System.out.println("Sum of n numbers="+result);
	}

	public static int sum_of_n(int n)
	{
		if(n>0)
			return(n+sum_of_n(n-1));
		else
			return 0;
	}
}
