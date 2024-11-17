package Java8Features;

import java.util.function.Function;
class Funimpl implements Function<String,Integer>
{
	@Override
	public Integer apply(String t) {
		
		return t.length();
	}
}
public class FunctionFunctionalInterface 
{

	public static void main(String[] args) 
	{
			//traditional approach
			Function<String,Integer> f=new Funimpl();
			
			System.out.println(f.apply("welcome to java full stack"));
			
			//lambda expression approach
			Function<String,Integer> f1=(t) ->
			{
				return t.length();
			};
			System.out.println(f1.apply("happy coding"));
	}

}
