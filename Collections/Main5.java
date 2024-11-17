package Collections;
import java.util.*;
import java.io.*;
public class Main5 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=null;
		ArrayList<Employee20> al=new ArrayList<Employee20>();
		
		try
		{
			while(true)
			{
			
			br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the employee id");
			int id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter the employee name");
			String name=br.readLine();
			
			System.out.println("Enter the employee designation");
			String designation=br.readLine();
			
			System.out.println("Enter the employee salary");
			float salary=Float.parseFloat(br.readLine());
			
			Employee20 e=new Employee20(id,name,designation,salary);
			
			al.add(e);
			
			System.out.println("do you want to continue");
			char ch=(char)br.read();
			
			if(ch=='n')
				break;
			}
			
			for(Employee20 x:al)
				System.out.println(x.id+" "+x.name+" "+x.designation+" "+x.salary);
		}
		finally
		{
			if(br!=null)
			{
				br.close();
			}
		}
	}

}
