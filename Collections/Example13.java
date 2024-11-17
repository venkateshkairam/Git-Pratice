package Collections;
import java.util.*;
public class Example13 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		Object a[]=al1.toArray(); //ArrayList to Array
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	}

}
