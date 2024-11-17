package Collections;
import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) 
	{
		Hashtable<String,Float> ht=new Hashtable<String,Float>();
		
		ht.put("rahul",456.00f);
		ht.put("sachin",345.00f);
		ht.put("dhoni",555.00f);
		ht.put("rahim",756.00f);
		
		System.out.println(ht.get("rahul"));
		System.out.println(ht.get("rahim"));
		
		
		
		
	}

}
