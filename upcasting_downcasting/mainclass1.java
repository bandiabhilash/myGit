class A
{
	public void test1()
	{
		System.out.println("test car");
	}
}
class B extends A
{
	public void test2()
	{
		System.out.println("test bike");
	}
}
class mainclass1
{
	public static void main(String[] args) 
	{
		A a1 = (A) new B();
		a1.test1();
		B b1 = (B) a1;
		b1.test1();
		b1.test2();
  	}
}
