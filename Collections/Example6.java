//program to remove the index element
package Collections;
import java.util.*;
public class Example6 {

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
		System.out.println("enter the location");
		loc=sc.nextInt();
		
		if(loc>=0 && loc<al.size())
		{
			al.remove(loc);
			System.out.println(al);
		}
		else
			System.out.println("invalid index");
	}

}
