package Java8Features;

import java.util.function.BiPredicate;

class Bipredimpl1 implements BiPredicate<Integer,Integer>
{
	@Override
	public boolean test(Integer t, Integer u) 
	{
		if(t>0&&u>0)
			return true;
		else
			return false;
	}
}
class Bipredimpl2 implements BiPredicate<Integer,Integer>
{
	@Override
	public boolean test(Integer t, Integer u) 
	{
		if(t%2==0 && u%2==0)
			return true;
		else
			return false;
	}
}
public class Bipredicateanddemo {

	public static void main(String[] args) 
	{
		BiPredicate<Integer,Integer> bip1=new Bipredimpl1();
		BiPredicate<Integer,Integer> bip2=new Bipredimpl2();
		
		BiPredicate<Integer,Integer> bip=bip1.or(bip2);
		
		System.out.println(bip.test(4,5));
		System.out.println(bip.test(10,20));
		
		BiPredicate<Integer,Integer> bip3=(t,u)-> 
				{
			if(t>0&&u>0)
				return true;
			else
				return false;
		};
		BiPredicate<Integer,Integer> bip4=(t,u)-> 
		{
			if(t%2==0&&u%2==0)
				return true;
			else
				return false;
		};
		

		BiPredicate<Integer,Integer> bip5=bip3.and(bip4);
		
		System.out.println(bip5.test(4,5));
		
	}

}
