interface Playable
{
	 void play(); 
}
class Guitar implements Playable
{
	public void play()
	{
		System.out.println("Playing a guitar");
	}
}
class Piano implements Playable
{
	public void play()
	{
		System.out.println("Playing a piano");
	}
}
class Guitarmain
{
	public static void main(String[] args)
	{
		Guitar obj1 = new Guitar();
		Piano obj2 = new Piano();
		obj1.play();
		obj2.play();
	}
}
