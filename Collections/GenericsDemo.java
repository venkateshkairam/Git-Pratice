package Collections;
import java.util.*;
public class GenericsDemo {

	public static void main(String[] args) 
	{
		//Collection without generics
		ArrayList al=new ArrayList();
		
		al.add(1234);
		al.add("rahul");
		al.add(45000.00);
		
		System.out.println(al);
		
		//Collection with generics
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		al1.add(10);
		al1.add(20);
		
		
		System.out.println(al1);
		
		//Collection with generic of object type
		
		ArrayList<Object>  al2=new ArrayList<Object>();
		
		al2.add(123);
		al2.add("gopal");
		al2.add(345.45f);
		
		System.out.println(al2);
		
		//downcasting
		
		Integer i= (Integer)al2.get(0);
		System.out.println(i);
		
		String s=(String)al2.get(1);
		System.out.println(s);
		
		Float f=(Float)al2.get(2);
		System.out.println(f);
		
		
		
		
	}

}
