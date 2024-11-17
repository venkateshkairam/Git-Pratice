package Collections;
import java.util.*;
public class Main8 
{

	public static void main(String[] args)
	{
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(new Product(132,"pen"));
		al.add(new Product(131,"pencil"));
		al.add(new Product(133,"eraser"));
		al.add(new Product(130,"sharpner"));
		al.add(new Product(129,"scale"));
		
		Collections.sort(al);
		
		for(Product x:al)
			System.out.println(x.serialno+" "+x.name);
		
		
	}

}
