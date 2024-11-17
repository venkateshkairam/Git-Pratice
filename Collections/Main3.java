package Collections;
import java.util.*;
public class Main3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee20> al=new ArrayList<Employee20>();
		
		System.out.println("enter the details of employee");
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the employee id");
			int id=sc.nextInt();
			System.out.println("Enter the employee name");
			String name=sc.next();
			System.out.println("Enter the employee designation");
			String designation=sc.next();
			System.out.println("Enter the employee salary");
			float salary=sc.nextFloat();
			
			Employee20 e=new Employee20(id,name,designation,salary);
			
			al.add(e);
		}
		
		for(Employee20 x:al)
			System.out.println(x.id+" "+x.name+" "+x.designation+" "+x.salary);
		
	}

}
