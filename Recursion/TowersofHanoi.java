package Recursion;
import java.util.*;
public class TowersofHanoi {

	public static void main(String[] args) {
		
		toh(4,1,2,3);
	}
	public static void toh(int n,int A,int B,int C)
	{
		if(n>0)
		{
			toh(n-1,A,C,B);
			System.out.println("MOVE DISC FROM"+A+"TO"+C);
			toh(n-1,B,A,C);
		}
	}

}
