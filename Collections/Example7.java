//program to check whether the list contains element or not

package Collections;
import java.util.*;
public class Example7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		int ele;
		System.out.println("enter the element to check");
		ele=sc.nextInt();
		
		if(al.contains(ele))
			System.out.println(ele+"exists in the arraylist");
		else
			System.out.println(ele+"does not exists");

	}

}
