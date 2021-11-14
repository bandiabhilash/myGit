class Z
{
	public static void test()
	{
		System.out.println("hello");
	}
	public void test1()
	{
		System.out.println("world");
	}
}
class X
{

	public static void main(String[] args) 
	{
		Z.test();
		Z e1=new Z();
		e1.test1();
	}
}
