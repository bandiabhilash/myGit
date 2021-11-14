interface Animal
{
	void snake();
}
interface Books
{
	void read();
}
interface Bike extends Animal,Books
{
	void race();
}
class Dance implements Bike
{
	public void snake()
	{
		System.out.println("go faster");
	}
	public void read()
	{
		System.out.println("newspaper");
	}
	public void race()
	{
		System.out.println("from one place");
	}
}
class  mainclass8
{
	public static void main(String[] args) 
	{
		Dance d1 = new Dance();
		d1.snake();
		d1.read();
		d1.race();
	}
}
