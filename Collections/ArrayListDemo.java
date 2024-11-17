//demonstrate to display ArrayList elements along with size
package Collections;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("sachin");
		al.add("rahul");
		al.add("kapil");
		al.add("dhoni");
		al.add("kohli");
		
		System.out.println(al);
		
		System.out.println(al.size());
	}

}
