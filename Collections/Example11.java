//program to merge two ArrayLists
package Collections;
import java.util.*;
public class Example11 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		System.out.println(al1);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al2.add(100);
		al2.add(110);
		al2.add(120);
		al2.add(130);
		al2.add(140);
		
		System.out.println(al2);
		
		al1.addAll(al2);
		
		System.out.println(al1);
		
	}

}
