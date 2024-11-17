package Strings;
import java.util.*;
public class Removesubstring {

	public static void main(String[] args) {
		
		String s="welcome to sathya technologies";
		String str[]=s.split(" ");
		String substr="to";
		String result="";
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(substr))
				continue;
			else
				result=result+" "+str[i];
		}
		System.out.println(result);
	}

}
