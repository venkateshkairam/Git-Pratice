//program to display the index of an element in a given list
package Collections;

import java.util.*;

public class Example8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		int ele;
		System.out.println("enter the element");
		ele=sc.nextInt();
		
		
		int x=al.indexOf(ele);
		
		System.out.println(x);
		

	}

}
