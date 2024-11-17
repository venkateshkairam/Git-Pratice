package Java8Features;
import java.util.*;
public class Main300 {

	public static void main(String[] args) 
	{
		//referring to a static method
		Calculator cal=Scientific::findSum;
		cal.calculate(30,50);
		Calculator cal1=Scientific::findDivision;
		cal1.calculate(40,20);
		
		//referring to a instance method
		
		Calculator cal2=new Scientific()::findProduct;
		cal2.calculate(30,40);
		
		
		
	
	}

}
