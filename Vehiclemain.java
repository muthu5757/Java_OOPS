class Vehicle
{
	String make;
	String model;
	int year;
	public Vehicle(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void display()
	{
		System.out.println("Make : "+make);
		System.out.println("Model : "+model);
		System.out.println("Year :"+year);
	}
}
class Car extends Vehicle
{
	String color;
	int numdoors;
	public Car(String make,String model,int year,String color,int numdoors)
	{
		super(make,model,year);
		this.color=color;
		this.numdoors=numdoors;
	}
	public void display()
	{
		super.display();
		System.out.println("Color : "+color);
		System.out.println("Number of doors : "+numdoors);
	} 
}
class Vehiclemain
{
	public static void main(String[] args)
	{
		Car obj = new Car("Suzuki","Omni",2011,"White",4);
		obj.display();
	}
}
