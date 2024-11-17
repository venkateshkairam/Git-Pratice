package Java8Features;

import java.util.function.Predicate;

class Predimpl implements Predicate<Integer>
{
	@Override
	public boolean test(Integer t) 
	{
		if(t>18)
			return true;
		else
			return false;
	}
}
public class Predicatedemo {

	public static void main(String[] args)
	{
		Predicate<Integer> p=new Predimpl();
		System.out.println(p.test(19));
		
		Predicate<Integer> p1=(t) -> 
				{
			if(t>18)
				return true;
			else
				return false;
		};
		System.out.println(p1.test(12));
	}

}
