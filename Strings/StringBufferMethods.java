package Strings;
import java.lang.*;
public class StringBufferMethods 
{
	public static void main(String[] args) 
	{
		//constructors of StringBuffer class
		
		StringBuffer sb=new StringBuffer("");
		
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("rahul");
		
		System.out.println(sb1.capacity());
		
		StringBuffer sb2=new StringBuffer("");
		
		
		sb2.append("rahul");
		
		System.out.println(sb2.capacity());
		
		sb2.append("welcome to satya technologies");
		
		System.out.println(sb2.capacity());
		
		//default capacity of StringBuffer is 16
		// new capacity = (current_capacity+1)*2;
		
		StringBuffer sb30=new StringBuffer(10);
		System.out.println(sb30.capacity());
		
		
		String s=new String(sb2);
		
		System.out.println(s);
		
		StringBuilder sbd=new StringBuilder("welcome");
		
		StringBuffer sb4=new StringBuffer(sbd);
		
		System.out.println(sb4);
		
		
		//StringBuffer Methods
		
		StringBuffer sb10=new StringBuffer("welcome to java full stack");
		
		System.out.println(sb10.charAt(5));
		
		System.out.println(sb10.capacity());
		
		System.out.println(sb10.length());
		
		System.out.println(sb10.insert(4,'z'));
		
		System.out.println(sb10.insert(6,"best"));
		
		System.out.println(sb10.delete(3,7));
		
		System.out.println(sb10.deleteCharAt(12));
		
		sb10.setCharAt(0,'y');
		
		System.out.println(sb10);
		
		System.out.println(sb10.append("good bye"));
		
		System.out.println(sb10.reverse());
		
		StringBuffer sb20=new StringBuffer("happy coding");
		
		System.out.println(sb20.capacity());
		
		sb20.trimToSize();
		
		System.out.println(sb20.capacity());
		
	}

}
