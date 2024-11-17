//program to remove all the elements in the ArrayList
package Collections;
import java.util.*;
public class Example5 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(50);
		al.add(60);
		al.add(70);
		
		if(al.isEmpty())
			System.out.println("list is empty");
		else
			System.out.println("list is not empty");
		
		al.clear();
		
		if(al.isEmpty())
			System.out.println("list is empty");
		else
			System.out.println("list is not empty");
		
		
	}

}
