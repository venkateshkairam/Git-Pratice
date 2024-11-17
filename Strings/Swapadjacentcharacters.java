package Strings;

public class Swapadjacentcharacters 
{

	public static void main(String[] args) 
	{
		String s="abcde";
		String str="";
		
		for(int i=0;i<s.length();i=i+2)
		{
			if(i+2<=s.length())
				str=str+s.charAt(i+1)+s.charAt(i);
			else
				str=str+s.charAt(i);
		}
		System.out.print(str);
				
		
	}

}
