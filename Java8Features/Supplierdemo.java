package Java8Features;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class Supimpl implements Supplier<LocalDateTime>
{
	@Override
	public LocalDateTime get() 
	{
		return LocalDateTime.now();
	}
}
public class Supplierdemo {

	public static void main(String[] args) 
	{
		Supplier<LocalDateTime> s=new Supimpl();
		System.out.println(s.get());
		
		Supplier<LocalDateTime> s1=() ->
				{
			return LocalDateTime.now();
				};
		System.out.println(s.get());
	}

}
