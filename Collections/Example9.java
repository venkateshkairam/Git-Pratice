// program to replace the existing element with new element
package Collections;
import java.util.*;
public class Example9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		int loc;
		System.out.println("enter the location of existing element");
		loc=sc.nextInt();
		
		if(loc>=0 && loc<al.size())
		{
			System.out.println("enter the new element");
			int x=sc.nextInt();
			
			al.set(loc,x);
			
			System.out.println(al);
		}
		else
			System.out.println("invalid index");

	}

}
