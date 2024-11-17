package Recursion;
import java.util.*;
public class BinarytoDecimal {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int bnum,result;
		
		System.out.println("Enter the binary number");
		bnum=sc.nextInt();
		
		result=bin_to_dec(bnum);
		
		System.out.println(result);
		
	}
	public static int bin_to_dec(int bnum)
	{
		if(bnum>0) //stopping condition
			return(bnum%10+2*bin_to_dec(bnum/10));
		else
			return 0;
	}
}
