package Collections;
import java.util.*;
public class Main1 {

	public static void main(String[] args) 
	{
		ArrayList<Employee20> al=new ArrayList<Employee20>();
		
		int id[]= {10,11,12,13};
		String name[]= {"karthik","anil","sujeeth","srujan"};
		String designation[]= {"analyst","developer","tester","manager"};
		float salary[]= {25000,75000,35000,100000};
		
		for(int i=0;i<id.length;i++)
		{
			Employee20 e=new Employee20(id[i],name[i],designation[i],salary[i]);
			
			al.add(e);
		}
		
		for(Employee20 x:al)
			System.out.println(x.id+" "+x.name+" "+x.designation+" "+x.salary);
		
		
	}

}
