// program on for,for-each, Iterator and ListIterator Interface
package Collections;
import java.util.*;
public class Example10 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);

		//access the elements using for loop
		
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
		for(int i=al.size()-1;i>=0;i--)
			System.out.println(al.get(i));
		
		//access the elements using for each loop
		
		for(Integer x:al)
			System.out.println(x);  //forward direction
		
		//access the elements using Iterator Interface
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//access the elements using ListIterator Interface
		
		ListIterator<Integer> litr=al.listIterator();
		while(litr.hasNext()) //forward direction
		{
			System.out.println(litr.next());
		}
		
		//backward direction
		
		ListIterator<Integer> litr1=al.listIterator(al.size());
		while(litr1.hasPrevious()) //backward direction
		{
			System.out.println(litr1.previous());
		}
		
		// access the elements at particular index
		//forward direction
		
		ListIterator<Integer> litr2=al.listIterator(2);
		while(litr2.hasNext()) //forward direction
		{
			System.out.println(litr2.next());
		}
		
		//backward direction
		
		ListIterator litr3=al.listIterator(3);
		while(litr3.hasPrevious()) //forward direction
		{
			System.out.println(litr3.previous());
		}
		
		
	}

}
