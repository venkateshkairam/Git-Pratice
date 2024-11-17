package Java8Features;

import java.util.function.BiFunction;

class BiFunimpl implements BiFunction<String,String,Boolean>
{
	@Override
	public Boolean apply(String t, String u) {
		
		return t.equals(u);
	}
}
public class BiFunctiondemo 
{

	public static void main(String[] args) 
	{
		//traditional approach
		BiFunction<String,String,Boolean> bif=new BiFunimpl();
		
		System.out.println(bif.apply("sachin","rahul"));
		
		//lambda expression approach
		
		BiFunction<String,String,Boolean> bif1=(t,u) ->
		{
			
			return t.equals(u);
		};
		System.out.println(bif1.apply("sathya","sathya"));
	}

}
