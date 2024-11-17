package Strings;

import java.util.StringTokenizer;
public class StringTokenizerClass {

	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("welcome-to-java-full-stack","-");
		
		System.out.println(st.countTokens());
		
		//StringTokenizer methods
		//hasMoreTokens()- true 
		//hasMoreElements() - true
		//nextToken() 
		//nextElement()
		//countTokens()
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
	}

}
