interface Demo
{
	void test();
}
class Run implements Demo
{
	public void test()
	{
		System.out.println("JSPIDERS");
	}
}
class mainclass85 
{
	public static void main(String[] args) 
	{
		Run r1 = new Run();
		r1.test();
	}
}
