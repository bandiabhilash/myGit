abstract class X
{
abstract public void test();
}
abstract class Y extends X
{
abstract public void test();
}
class Z extends X
{
	public void test()
	{
		System.out.println("walk slow");
	}

}
class A extends Y
{
	public void test()
	{
		System.out.println("hello..");
	}
}
class  mainclass4
{
	public static void main(String[] args) 
	{
		new Z().test();
		new A().test();
	}
}