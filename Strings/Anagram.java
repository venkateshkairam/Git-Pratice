package Strings;
import java.util.*;
public class Anagram {

	public static void main(String[] args) 
	{
			String s1="army";
			String s2="mary";
			
			int l1=s1.length();
			int l2=s2.length();
			
			if(l1==l2)
			{
				System.out.println("Anagram is possible");
				
				//strings to character arrays
				char ch1[]=s1.toCharArray();
				char ch2[]=s2.toCharArray();
				
				int i,j,found=0;
				
				char temp;
				//sorting
				for(i=0;i<ch1.length;i++)
				{
					for(j=i+1;j<ch1.length;j++)
					{	
						if(ch1[i]>ch1[j])
						{
							temp=ch1[i];
							ch1[i]=ch1[j];
							ch1[j]=temp;
						}
						if(ch2[i]>ch2[j])
						{
							temp=ch2[i];
							ch2[i]=ch2[j];
							ch2[j]=temp;
						}
					}
				}
				//comparison
				for(i=0;i<ch1.length;i++)
				{
					if(ch1[i]!=ch2[i])
					{
						found=1;
						break;
					}
				}
				if(found==0)
					System.out.println("Anagram");
				else
					System.out.println("not a anagram");
			}
			else
				System.out.println("anagram is not possible");
	}

}
