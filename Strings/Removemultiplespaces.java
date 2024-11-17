package Strings;

public class Removemultiplespaces {

	public static void main(String[] args) 
	{
		String s="welcome    to    satya  technologies";
		String str="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
				str=str+ch;
			else
			{
				if(s.charAt(i+1)!=' ')
					str=str+ch;
			}
		}
		System.out.println(str);
	}

}
