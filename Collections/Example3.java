//program to display the element of specific index
package Collections;
import java.util.*;
public class Example3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		int loc;
		System.out.println("enter the location");
		loc=sc.nextInt();
		
		if(loc>=0 && loc<al.size())
		{
				int x=al.get(loc);
				System.out.println("element="+x);
		}
		else
			System.out.println("invalid index");
		
	}

}
