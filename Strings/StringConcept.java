package Strings;
import java.lang.*;
public class StringConcept {

	public static void main(String[] args) 
	{
		/*String s1="sachin"; //string constant pool
		
		String s2=new String("sachin"); //heap memory
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		String s3=s2.intern(); //string constant pool
		
		System.out.println(s1==s3); */
		
		
		String s="welcome to sathya technologies";
		
		System.out.println(s.charAt(12));
		
		String s1=s.concat("ameerpet");
		
		System.out.println(s1);
		
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		
		System.out.println(s.equals(s1));
		
		String s2="rahul";
		
		String s3="RAHUL";
		
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.length());
		
		System.out.println(s.replace('a', 'z'));
		
		System.out.println(s.substring(6));
		
		System.out.println(s.substring(4,10));
		
		System.out.println(s.indexOf('a'));
		
		System.out.println(s.lastIndexOf('a'));
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		String str1[]=s.split(" ");
		
		for(int i=0;i<str1.length;i++)
			System.out.println(str1[i]);
		
		//Constructors of String class:
			
			String str10= new String("");
			
			String str11=new String("sachin");
			
			StringBuffer sb=new StringBuffer("sachin tendulkar");
			
			String str12=new String(sb);
			
			StringBuilder sbd=new StringBuilder("kapil dev");
			
			String str13=new String(sbd);
			
			char ch1[]= {'s','a','t','y','a'};
			
			String str14=new String(ch1);
			
			System.out.println(str14);
			
		
		
	}

}
