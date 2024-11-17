package Collections;
import java.util.*;
public class Product implements Comparable<Product>
{
	int serialno;
	String name;
	public Product(int serialno, String name) 
	{
		
		this.serialno = serialno;
		this.name = name;
	}
	
	/*public int compareTo(Product al)
	{
		return this.name.compareTo(al.name);
	}*/
	
	public int compareTo(Product al)
	{
		return this.serialno-al.serialno;
	}
	
	
}
