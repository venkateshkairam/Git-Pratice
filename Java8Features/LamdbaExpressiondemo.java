package Java8Features;
interface Shape
{
	void draw();
}
/*class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("draw method of Rectangle class");
	}
}
class Triangle implements Shape
{
	public void draw()
	{
		System.out.println("draw method of Trianlge class");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("draw method of Circle class");
	}
}*/
public class LamdbaExpressiondemo 
{

	public static void main(String[] args)
	{
		/*Rectangle r=new Rectangle();
		r.draw();
		Triangle t=new Triangle();
		t.draw();
		Circle c=new Circle();
		c.draw(); */
		
		Shape rect=()->System.out.println("draw method of Rectangle class");
		rect.draw();
		Shape tria=()->System.out.println("draw method of Trianlge class");
		tria.draw();
		Shape cir=()->System.out.println("draw method of Circle class");
		cir.draw();
		
		display(()->System.out.println("draw method of Rectangle class")); //calling method
		display(()->System.out.println("draw method of Trianlge class"));
		display(()->System.out.println("draw method of Circle class"));
	}
	private static void display(Shape shape)
	{
		shape.draw();
	}

}
