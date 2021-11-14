interface Sample
{
	public void test();
} 
class Demo implements Sample
{
	public void test()
	{
		System.out.println("test bike...");
	}
}
class mainclass2
{
	public static void main(String[]args)
	{
		new Demo().test();
	}
}