package Java8Features;
import java.util.*;
public class ForEachMethodDemo
{
	public static void main(String[] args)
	{
		//Iterating the List Interface 
		List<Integer> l=Arrays.asList(10,30,20,50,40);
		l.forEach(x->System.out.println(x));
		
		//Iterating the Set Interface
		Set<Integer> s=new HashSet<Integer>(l);
		s.forEach(System.out::println);
		
		//Iterating the Map Interface
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(3,"Sachin");
		m.put(1,"Kapil");
		m.put(2,"Arun");
		
		m.forEach((key,value)->System.out.println(key+" "+value));
		
		//Iterating the entrySet()
		
		m.entrySet().forEach(keys->System.out.println(keys.getKey()+"  "+keys.getValue()));
		
		
	}

}
