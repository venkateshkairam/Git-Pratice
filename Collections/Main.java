package Collections;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Employee20> al=new ArrayList<Employee20>();
		
		
		al.add(new Employee20(123,"rahul","analyst",55000.00f));
		al.add(new Employee20(124,"kapil","developer",75000.00f));
		al.add(new Employee20(125,"david","tester",35000.00f));
		
		//for loop
		for(int i=0;i<al.size();i++)
		{
			Employee20 e=al.get(i);
			
			System.out.println(e.id+" "+e.name+" "+e.designation+" "+e.salary);
			
		}
		for(int i=al.size()-1;i>=0;i--)
		{
			Employee20 e=al.get(i);
			
			System.out.println(e.id+" "+e.name+" "+e.designation+" "+e.salary);
			
		}
		
		//for each loop
		for(Employee20 x:al)
			System.out.println(x.id+" "+x.name+" "+x.designation+" "+x.salary);
		
		//Iterator 
		
		Iterator<Employee20> itr=al.iterator();
		while(itr.hasNext())
		{
			Employee20 e=(Employee20)itr.next();
			System.out.println(e.id+" "+e.name+" "+e.designation+" "+e.salary);
			
		}
		
		//ListIterator
		
		ListIterator<Employee20> itr1=al.listIterator();
		while(itr1.hasNext())
		{
			Employee20 e=(Employee20)itr1.next();
			System.out.println(e.id+" "+e.name+" "+e.designation+" "+e.salary);
			
		}
		
		//reverse
		
		ListIterator itr2=al.listIterator(al.size());
		while(itr2.hasPrevious())
		{
			Employee20 e=(Employee20)itr2.previous();
			System.out.println(e.id+" "+e.name+" "+e.designation+" "+e.salary);
			
		}
 	}

}
