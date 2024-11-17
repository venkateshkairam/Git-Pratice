package Strings;
import java.util.*;
public class Longestword 
{
	public static void main(String[] args) 
	{
		String s="welcome to sathya tech";
		String str[]=s.split(" ");
		
		int i,longest,pos=0;
		
		longest=str[0].length();
		
		for(i=1;i<str.length;i++)
		{
			if(str[i].length()>longest)
			{
				longest=str[i].length();
				pos=i;
			}
		}
		System.out.println("longest word="+str[pos]);
	}

}
