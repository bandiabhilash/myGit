interface Sample
{
	public void Move();
}
interface Demo extends Sample
{
	public void Walk();
}
class Main implements Demo
{
	public void move()
	{
		System.out.println("Move towards south...");
	}
	public void walk()
	{
		System.out.println("walk method...");
	}
}
class mainclass4 
{
	public static void main(String[] args) 
	{
		Main main1 = new Main();
		main1.move();
		main1.walk();
	}
}
