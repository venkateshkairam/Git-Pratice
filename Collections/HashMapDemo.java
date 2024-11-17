package Collections;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(13,"pen");
		hm.put(12,"pencil");
		hm.put(14,"sharpner");
		hm.put(15,"scale");
		hm.put(11,"divider");
		
		System.out.println(hm);
		
		System.out.println(hm.get(15));
		
		if(hm.isEmpty())
			System.out.println("map is empty");
		else
			System.out.println("map is not empty");
		
		//hm.clear();
		//System.out.println(hm);
		
		if(hm.containsKey(11))
			System.out.println("key exists in map");
		else
			System.out.println("key does not exists in map");
		
		Set<Integer> keys=hm.keySet();
		
		for(Integer key:keys)
		{
			String value=hm.get(key);
			System.out.println(key+":"+value);
		}
		
		hm.remove(12);
		System.out.println(hm);
		
		hm.replace(11,"compass box");
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		Collection<String> c=hm.values();
		for(String x:c)
			System.out.println(x);
		
		
		
		
		
		
	}

}
