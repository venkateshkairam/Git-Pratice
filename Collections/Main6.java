package Collections;
import java.util.*;
public class Main6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<EmployeePOJO> al=new ArrayList<EmployeePOJO>();
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter the employee details");
			int id=sc.nextInt();
			String name=sc.next();
			float salary=sc.nextFloat();
			int deptno=sc.nextInt();
			String location=sc.next();
			
			EmployeePOJO e=new EmployeePOJO();
			
			e.setId(id);
			e.setName(name);
			e.setSalary(salary);
			e.setDeptno(deptno);
			e.setLocation(location);
			
			al.add(e);
		}
		/*for(int i=0;i<al.size();i++)
		{
			EmployeePOJO e=al.get(i);
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDeptno()+" "+e.getLocation());
		}*/
		
		//employee details with ID:103
		
		/*for(EmployeePOJO x:al)
		{
			if(x.getId()==103)
			{
				System.out.println(x.getId()+" "+x.getName()+" "+x.getDeptno()+ " "+x.getSalary()+" "+x.getLocation());
	
			}
		}*/
		
		//employee belongs to hyderabad
		for(EmployeePOJO x:al)
		{
			if(x.getLocation().equals("hyderabad"))
				System.out.println(x.getId()+" "+x.getName()+" "+x.getDeptno()+ " "+x.getSalary()+" "+x.getLocation());

		}
		
		//employee belongs to department 20 or 30
		for(EmployeePOJO x:al)
		{
			if((x.getDeptno()==20)||(x.getDeptno()==30))
				System.out.println(x.getId()+" "+x.getName()+" "+x.getDeptno()+ " "+x.getSalary()+" "+x.getLocation());
			
		}
		//employee details who does not belong to hyderabad
		for(EmployeePOJO x:al)
		{
			if(!(x.getLocation().equals("hyderabad")))
				System.out.println(x.getId()+" "+x.getName()+" "+x.getDeptno()+ " "+x.getSalary()+" "+x.getLocation());
		}
		//belongs to dept:20 but does not belongs to hyderabad
		for(EmployeePOJO x:al)
		{
			if((x.getDeptno()==20)&&!(x.getLocation().equals("hyderabad")))
				System.out.println(x.getId()+" "+x.getName()+" "+x.getDeptno()+ " "+x.getSalary()+" "+x.getLocation());
			
		}
		
		//count of employees working in hyderabad and bangalore city
		int count=0;
		for(EmployeePOJO x:al)
		{
		
			if((x.getLocation().equals("hyderabad"))||(x.getLocation().equals("bangolore")))
			{
				count++;
			}
		}
		if(count==0)
			System.out.println("no such records exists");
		else
			System.out.println("number of employees="+count);
		
		//employee with name "dravid" is present or not
		boolean found=false;
		for(EmployeePOJO x:al)
		{
			if(x.getName().equals("dravid"))
			{
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("record exists with name dravid");
		else
			System.out.println("no such record in the list");
		
		//employee details whose salary is greater than 30000
		
		for(EmployeePOJO x:al)
		{
			if(x.getSalary()>30000)
				System.out.println(x.getId()+" "+x.getName()+" "+x.getDeptno()+ " "+x.getSalary()+" "+x.getLocation());
			
		}
		//employee details whose salary is between 30000 to 40000
		
		for(EmployeePOJO x:al)
		{
			if(x.getSalary()>=30000 && x.getSalary()<40000)
				System.out.println(x.getId()+" "+x.getName()+" "+x.getDeptno()+ " "+x.getSalary()+" "+x.getLocation());
		}
		
		//employee details with salary less than 30000 and does not belongs to hyderabad
		
		for(EmployeePOJO x:al)
		{
			if(x.getSalary()<30000 &&!(x.getLocation().equals("hyderabad")))
				System.out.println(x.getId()+" "+x.getName()+" "+x.getDeptno()+ " "+x.getSalary()+" "+x.getLocation());
		}
		
		
		
	}

}
