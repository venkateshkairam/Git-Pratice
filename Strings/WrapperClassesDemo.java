package Strings;
import java.lang.*;
public class WrapperClassesDemo {

	public static void main(String[] args) 
	{
		//primitive to Object type
		
			int i=100;
			
			Integer it=Integer.valueOf(i);
			
			System.out.println(it);
			
		// Object type to primitive type
			
			Float ft=34.4635f; //Object type of Float class
			
			float x=ft.floatValue();
			
			System.out.println(x);
			
		// primitive to String type
			
			int a=234;
			
			String s=Integer.toString(a);
			
			System.out.println(s);
			
			System.out.println(s+a);
			
		// String type to primitive type
			
			String s1="1234";
			
			int it1=Integer.parseInt(s1);
			
			System.out.println(it1);
			
		//Object type to String type
			
			Integer it2=456;
			
			String s2=Integer.toString(it2);
			
			System.out.println(s2);
			
		// String type to Object type
			
			String s3="127";
			
			Byte b=Byte.valueOf(s3);
			
			System.out.println(b);
			
			
			
		
		
	}

}
