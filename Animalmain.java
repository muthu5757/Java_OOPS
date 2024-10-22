class Animal
{
	void speak()
	{
		System.out.println("Animal says roar");
	}
}
class Dog extends Animal
{
	void speak()
	{
		System.out.println("The dog says woof");
	}
}
class Cat extends Dog
{
	void speak()
	{
		System.out.println("The cat says meow");
	}
}
class Animalmain
{
	public static void main(String[] args)
	{
		Animal obj1 = new Animal();
		Dog obj2 = new Dog();
		Cat obj3 = new Cat();
		obj1.speak();
		obj2.speak();
		obj3.speak();
	}
}
