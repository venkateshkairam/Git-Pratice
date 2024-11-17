package Strings;
import java.util.*;
public class Vowel {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			
			/*char ch;
			
			System.out.println("Enter the character");
			ch=sc.next().charAt(0);
			
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
					||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				System.out.println("vowel");
			else
				System.out.println("consonant"); */
			
			// program to check whether the character is digit or not
			/*char ch;
			
			System.out.println("Enter the character");
			ch=sc.next().charAt(0); //4  0-48, 1-49 ,2-50, 4-52 ,9-57
			
			if(ch>='0' && ch<='9')
				System.out.println("digit");
			else
				System.out.println("not a digit");*/
			
			//program to check whether the character is special symbol or not
			
			/*char ch;
			
			System.out.println("Enter the character");
			ch=sc.next().charAt(0); 
			
			if(!((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')))
				System.out.println("special symbol");
			else
				System.out.println("not a special symbol");*/
			
			//program to convert lowercase to uppercase and vice-versa
			
			//A-65 Z-90
			//a-97 z-122
			//0-48 9-57
			
			/*char ch;
			
			System.out.println("Enter the character");
			ch=sc.next().charAt(0); //a-97 A-65
			
			if(ch>='a' && ch<='z')
				System.out.println((char)(ch-32));
			else
				System.out.println((char)(ch+32));*/
			
			//program to find the length of character array
			
			//char ch[]= {'s','a','t','h','y','a','@','1'};
			
			//System.out.println(ch.length);
			
			//program to convert String object to character array
			
			/*String s="sathya";
			
			char ch[]=s.toCharArray();
			
			//for(int i=0;i<ch.length;i++)
				//System.out.print(ch[i]+" ");
			
			for(char x:ch)
				System.out.print(x+" ");*/
			
			//program to display first and last character of an array
			
			//char ch[]= {'s','a','t','y','a'};
			
			//System.out.println(ch[0]+" "+ch[ch.length-1]);
			
			//program to display digits from the character array
			
			//char ch[]= {'s','a','t','y','a','@','1','2','3'};
			
			/*for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='0' && ch[i]<='9')
					System.out.print(ch[i]+" ");
			}*/
			
			//for(int i=ch.length-1;i>=0;i--)
				//System.out.print(ch[i]+" ");
			
		//program to count alphabets,digits and special symbols in character array
			
			/*char ch[]= {'s','a','t','y','a','@','1','2','3'};
			
			int i,d=0,al=0,ss=0;
			
			for(i=0;i<ch.length;i++)
			{
				if(ch[i]>='0' && ch[i]<='9')
					d++;
				else if(ch[i]>='a' && ch[i]<='z')
					al++;
				else
					ss++;
			}
			
			System.out.println("Number of alphabets="+al);
			System.out.println("Number of digits="+d);
			System.out.println("Number of special symbols="+ss);*/
			
			//program to print first and last character of a string
			//String s="madam";
			
			//System.out.println(s.charAt(0)+"  "+s.charAt(s.length()-1));
			
			
			//program to print character by character of a String
			
			/*for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				System.out.println(ch);
			}*/
			
			//program to print String in reverse order
			
			/*for(int i=s.length()-1;i>=0;i--)
				System.out.print(s.charAt(i)); */
			
			/*String s1="";
			
			for(int i=s.length()-1;i>=0;i--)
			{
				s1=s1+s.charAt(i);
			}
			//System.out.print(s1);
			
			//program to check the given string is palindrome or not
			
			if(s.equals(s1))
				System.out.println("palindrome");
			else
				System.out.println("not a palindrome");*/
			
			//program to count digits, special symbols and alphabets in a given string
			
			/*String s="welcome to java world@ameerpet-1";
			
			int i,d=0,ss=0,al=0;
			
			for(i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				
				if(ch>='a' && ch<='z')
					al++;
				else if(ch>='0' && ch<='9')
					d++;
				else
					ss++;
			}
			System.out.println("number of alphabets="+al);
			System.out.println("number of digits="+d);
			System.out.println("number of special symbols="+ss);
			*/
			
			/*String s="sathya@1223";
			
			int sum=0,i;
			
			for(i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch>='0' && ch<='9')
					sum=sum+(ch-48);
			}
			System.out.println("sum of digits of a given string="+sum); */
			
			//program to convert uppercase to lowercase of a string
			
			/*String s="SATHYA";
			
			int i;
			
			for(i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch>='A' && ch<='Z')
					ch=(char)(ch+32);
				System.out.print(ch);
			}
			*/
			//program to find highest digit in a given String
			
			
	/*		String s="satya@43754398";
			
			int i,highest=0,digit=0;
			
			for(i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				
				if(ch>='0' && ch<='9')
					digit=ch-48;
				
				if(digit>highest)
					highest=digit;
			}
			System.out.println("Highest digit in a given string="+highest);
			
			*/
			
			//program to find the length of String array
			
			//String s[]= {"sachin","kapil","rahul","dhoni","kohli"};
			
			//System.out.println(s.length);
			
			// to display the strings from String arrays
			
			//for(int i=0;i<s.length;i++)
				//System.out.println(s[i]);
			
			//to display the length of each string in String array
			
			/*for(int i=0;i<s.length;i++)
			{
				String s1=s[i];
				System.out.println(s1.length());
				
			}*/
			
			//to display first and last character of each string in string array
			
			
			/*for(int i=0;i<s.length;i++)
			{
				String s1=s[i];
				System.out.println(s1.charAt(0)+" "+s1.charAt(s1.length()-1));
				
			}*/
			
			//to display strings of string array in reverse order
			
			/*for(int i=s.length-1;i>=0;i--)
			{
				String s1=s[i];
				System.out.println(s1);
			}*/
			
			//to display each string of string array in reverse
			
			/*for(int i=0;i<s.length;i++)
			{
				String s1=s[i];
				for(int j=s1.length()-1;j>=0;j--)
					System.out.print(s1.charAt(j));
				
				System.out.println("");
			}*/
			
			//to display the count of words in a given string
			
			String s="welcome to java full stack programme";
			/*int count=0;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch==' ')
					count++;
			}
			System.out.println("number of words in a string="+(count+1));
			
			*/
			
			String str[]=s.split(" ");
			System.out.println("number of words in a string="+str.length);
			
			
			
	}

}
