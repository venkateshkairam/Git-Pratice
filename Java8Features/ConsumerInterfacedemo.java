package Java8Features;

import java.util.function.Consumer;

class Consimpl implements Consumer<String>
{
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
}
public class ConsumerInterfacedemo {

	public static void main(String[] args) 
	{
		//traditional approach
		Consumer<String> c=new Consimpl();
		c.accept("welcome to java full stack");
		
		//lambda approach
		Consumer<String> c1=(t) ->
		{
			System.out.println(t);
		};
		c.accept("wonderful coding");
		
	}

}
