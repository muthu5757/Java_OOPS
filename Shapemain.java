class Shape
{
	void draw()
	{
		System.out.println("Drawing a shape");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a Rectangle");
	}
}
class Circle extends Rectangle
{
	void draw()
	{
		System.out.println("Drawing a Circle");
	}
}
class Shapemain
{
	public static void main(String[] args)
	{
		Shape obj1 = new Shape();
		Rectangle obj2 = new Rectangle();
		Circle obj3 = new Circle();
		obj1.draw();
		obj2.draw();
		obj3.draw();
	}
}
