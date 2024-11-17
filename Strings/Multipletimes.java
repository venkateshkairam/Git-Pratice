package Strings;

public class Multipletimes {

	public static void main(String[] args) 
	{
		String s="ab3cd2ef4";
		
		
		
		int i,j;
		
		for(i=0;i<s.length();i++) //i=1b//i=2
		{
			char ch1=s.charAt(i); //a  //b  //c
			char ch2=(i+1)<s.length()?s.charAt(i+1):' '; //b //3 //d
			
			if(ch2>='0' && ch2<='9')
			{
				for(j=0;j<ch2-48;j++)
					System.out.print(ch1); //bbb
				i++;
			}
			else
					System.out.print(ch1);
			
		}
		
		
	}

}
