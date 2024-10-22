class Animal 
{
	String name;
	int age; 
	String species;
   	public Animal(String name, int age, String species)
    	{
        	this.name = name;
        	this.age = age;
        	this.species = species;
    	}
    	public void display()
    	{
        	System.out.println("Name: " + name);
        	System.out.println("Age: " + age);
        	System.out.println("Species: " + species);
    	}
}

class Cat extends Animal
{
	String color;
	int numlives;
	public Cat(String name, int age, String species, String color, int numlives)
	 {
	        super(name, age, species);
	        this.color = color;
	        this.numlives = numlives;
	    }
   	 public void display() 
   	 {
        	super.display();
        	System.out.println("color: " + color);
        	System.out.println("numlives: " + numlives);
    	}
}

public class Catmain 
{
	public static void main(String[] args) 
	{
  	      Cat myCat = new Cat("Pubby", 3, "Cat", "White", 10);
        	myCat.display();
    	}
}

