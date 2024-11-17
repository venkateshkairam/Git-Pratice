package Recursion;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		
		reverse(n);
		
		
	}

	public static void reverse(int n)
	{
		if(n>0)
		{
			System.out.print(n%10);
			reverse(n/10);
		}
	}

	

}
