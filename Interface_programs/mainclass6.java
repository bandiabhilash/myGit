interface Run
{
	public void display();
}
class Walk implements Run
{
	public void display()
	{
		System.out.println("Hello world....");
	}
}
class Assign implements Run
{
	public void display()
	{
		System.out.println("Bye world...");
	}
	public void Run()
	{
		System.out.println("Test bike....");
	}
}
class  mainclass6
{
	public static void main(String[] args) 
	{
		Assign a1 = new Assign();
		a1.display();
		a1.Run();
		Walk w1 = new Walk();
		w1.display();
	}
}