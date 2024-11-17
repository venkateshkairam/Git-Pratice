package Collections;
import java.util.*;
class Employee implements Comparable<Employee>
{
	int empno;
	String name;
	public Employee(int empno, String name) 
	{
		this.empno = empno;
		this.name = name;
	}
	/*public int compareTo(Employee hs)
	{
		return this.name.compareTo(hs.name);
	}*/
	public int compareTo(Employee ts)
	{
		return this.name.compareTo(ts.name);
	}
	
	/*public int compareTo(Employee hs)
	{
		return this.empno-hs.empno;
	}*/
	/*public int compareTo(Employee ts)
	{
		return this.empno-ts.empno;
	}*/
	
	
}
public class TreeSetDemo2 
{

	public static void main(String[] args) 
	{

		HashSet<Employee> hs=new HashSet<Employee>();
		
		hs.add(new Employee(212,"ranjeeth"));
		hs.add(new Employee(211,"kapil"));
		hs.add(new Employee(209,"anil"));
		hs.add(new Employee(210,"rohit"));
		hs.add(new Employee(213,"dheeraj"));
		
		for(Employee x:hs)
			System.out.println(x.empno+" "+x.name);
		
		ArrayList<Employee> al=new ArrayList<Employee>(hs);
		
		//for(Employee x:al)
		//	System.out.println(x.empno+" "+x.name);
		
		TreeSet<Employee> ts=new TreeSet<Employee>(hs);
		
		for(Employee x1:ts)
			System.out.println(x1.empno+" "+x1.name);
		
		System.out.println(hs.hashCode());
		
		for(Employee x2:hs)
			System.out.println(x2.hashCode());
	
	}

}
