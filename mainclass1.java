abstract class A
{
	abstract public void test();
}
class B extends A
{
	public void test()
	{
		System.out.println("test car...");
	}
}
class mainclass1
{
	public static void main(String[] args) 
	{
		new B().test();
	}
}
