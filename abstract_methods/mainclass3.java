abstract class E
{
	public void jump()
	{
		System.out.print("jump high..");
	}
abstract public void fly();
}
class F extends E
{
	public void fly()
	{
		System.out.println("fly high...");
	}
}
class mainclass3 
{
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.fly();
		f1.jump();
	}
}
