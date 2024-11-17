//program to check the list is empty or not
package Collections;
import java.util.*;
public class Example2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		
		if(al.isEmpty())
			System.out.println("list is empty");
		else
			System.out.println("list is not empty");
	}

}
