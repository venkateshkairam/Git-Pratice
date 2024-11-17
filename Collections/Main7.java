package Collections;
import java.util.*;
public class Main7 {

	public static void main(String[] args) 
	{
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student(117,"sachin","CSE",2,456.00f));
		al.add(new Student(121,"srujan","IT",3,657.00f));
		al.add(new Student(118,"anil","ECE",4,547.00f));
		al.add(new Student(119,"dheeraj","EEE",6,524.00f));
		al.add(new Student(120,"karthik","AI",1,650.00f));
		
		//Collections.sort(al,new NameComparator());
		
		//Collections.sort(al,new Markscomparator());
		
		  Collections.sort(al,new Idcomparator());
		for(Student x:al) //for each loop
			System.out.println(x.rollno+" "+x.name+" "+x.branch+" "+x.semester+" "+x.marks);
		
		
		
		
		
		
		
		
	}

}
