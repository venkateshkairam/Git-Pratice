package Java8Features;

import java.util.function.BiPredicate;

class Bipredimpl implements BiPredicate<String,String>
{
	@Override
	public boolean test(String t, String u) 
	{
		if(t.equals(u))
			return true;
		else
			return false;
	}
}
public class Bipredicatedemo {

	public static void main(String[] args) 
	{
		BiPredicate<String,String> bip=new Bipredimpl();
		System.out.println(bip.test("rahul","rahim"));
		
		BiPredicate<String,String> bip1=(t,u)-> 
				{
			if(t.equals(u))
				return true;
			else
				return false;
		};
		System.out.println(bip1.test("kapil","kapil"));
	}

}
