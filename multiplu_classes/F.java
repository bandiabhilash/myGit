class E
{
	public static void test()
	{
		System.out.println("hi");
	}
	public void test1()
	{
		System.out.println("Bye");
	}
}
class F
{

	public static void main(String[] args) 
	{
		E.test();
		E e1=new E();
		e1.test1();
	}
}
