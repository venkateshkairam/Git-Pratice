package Collections;
import java.util.*;
public class HashMapDemo2 {

	public static void main(String[] args) 
	{
		String name[]= {"JAVA","ORACLE","SPRING FRAMEWORK","ADV.JAVA"};
		float price[]= {456.00f,556.00f,756.00f,655.00f};
		
		HashMap<String,Float> hm=new HashMap<String,Float>();
		
		for(int i=0;i<name.length;i++)
		{
			hm.put(name[i],price[i]);
		}
		
		Set<String> keys=hm.keySet();
		
		Iterator<String> itr=keys.iterator();
		
		while(itr.hasNext())
		{
			String key=itr.next();
			Float value=hm.get(key);
			System.out.println(key+":"+value);
		}
	}

}
