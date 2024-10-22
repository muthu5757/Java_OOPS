class Person
{
	String name;
	int age;
	String address;
	Person(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
	}
}
class Student extends Person
{
	char grade;
	String school;
	Student(String name,int age,String address,char grade,String school)
	{
		super(name,age,address);
		this.grade=grade;
		this.school=school;
	}	
	void display()
	{
		super.display();
		System.out.println("Grade : "+grade);
		System.out.println("School : "+school);
	}
}
class Personmain
{
	public static void main(String[] args)
	{
		Student obj = new Student("Arun",21,"Srivilliputtur",'A',"Valluvar vidhalaya");
		obj.display();
	}
}
