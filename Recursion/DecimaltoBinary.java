package Recursion;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int dnum,result;
		
		System.out.println("Enter the decimal number");
		dnum=sc.nextInt();
		
		result=dec_to_bin(dnum);
		
		System.out.println(result);
		
	}
	public static int dec_to_bin(int dnum)
	{
		if(dnum>0) //stopping condition
			return(dnum%2+10*dec_to_bin(dnum/2));
		else
			return 0;
	}
}
