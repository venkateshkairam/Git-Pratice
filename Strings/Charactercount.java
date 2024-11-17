package Strings;

public class Charactercount {

	public static void main(String[] args) 
	{
		String s="aaabbbcccddd$$$$####@@@@!!aabbccc^^^&&&2233";
		int i;
		int a[]=new int[128];
		
		for(i=0;i<s.length();i++)
		{
			a[(int)s.charAt(i)]++;
		}
		
		for(i=0;i<128;i++)
		{
			if(a[i]!=0)
				System.out.println((char)i+"-"+a[i]);
		}
	}

}
