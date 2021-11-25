abstract class C
{
	abstract public void move();
	abstract public void walk();
}
class D extends C
{
	public void move()
	{
		System.out.println("move fast..");
	}
	public void walk()
	{
		System.out.println("walk fast..");
	}
}
class mainclass2
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.move();
		d1.walk();
	}
}
