abstract class A
{
 abstract public void test();
}
class B extends A
{
	public void test()
	{
		System.out.println("hello..");
	}
}
class C extends A
{
	public void test()
	{
		System.out.println("world..");
	}
}
class mainclass1
{
	public static void main(String[]args)
	{
		B b1 = new B();
		b1.test();
		C c1 = new C();
		c1.test();
	}
}