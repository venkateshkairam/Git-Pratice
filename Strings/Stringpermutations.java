package Strings;
import java.util.*;
public class Stringpermutations {

	public static void main(String[] args) {
		
		String s="abc";
		
		for(char x='a';x<='c';x++)
		{
			for(char y='a';y<='c';y++)
			{
				for(char z='a';z<='c';z++)
				{
					if(x!=y && y!=z && z!=x)
						System.out.println(x+""+y+""+z);
					
				}
			}
		}
	}

}
