//program to insert an element at specific index
package Collections;
import java.util.*;
public class Example4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		int loc;
		System.out.println("enter the location");
		loc=sc.nextInt();
		
		if(loc>=0 && loc<al.size())
		{
			System.out.println("enter the element to be inserted");
			int ele=sc.nextInt();
			
			al.add(loc,ele);
			
			System.out.println(al);
		}
		else
			System.out.println("invalid index");
	}

}
