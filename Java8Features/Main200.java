package Java8Features;
import java.util.*;
public class Main200 {

	public static void main(String[] args) 
	{
		ArrayList<Student> al=new ArrayList<Student>();
		
		int rno[]= {1,3,2,4,5};
		String name[]= {"sachin","kapil","rahul","dhoni","bhupal"};
		int age[]= {43,45,33,23,42};
		
		for(int i=0;i<rno.length;i++)
		{
			Student s=new Student();
			s.setRollno(rno[i]);
			s.setName(name[i]);
			s.setAge(age[i]);
			
			al.add(s);
		}
		
		Comparator<Student> comp=Comparator.comparing(Student::getName);
		Collections.sort(al,comp);
		
		for(Student x:al)
			System.out.println(x.getRollno()+" "+x.getName()+" "+x.getAge());
		
		Comparator<Student> comp1=Comparator.comparing(Student::getAge);
		Collections.sort(al,comp1);
		
		for(Student x:al)
			System.out.println(x.getRollno()+" "+x.getName()+" "+x.getAge());
		
		Comparator<Student> comp2=Comparator.comparing(Student::getRollno);
		Collections.sort(al,comp2);
		
		for(Student x:al)
			System.out.println(x.getRollno()+" "+x.getName()+" "+x.getAge());
		
		
		
		
		
		
		
	}

}
