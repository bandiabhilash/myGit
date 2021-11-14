class A
{
	public void test1()
	{
		System.out.println("test bike");
	}
}
class B extends A
{
	public void test2()
	{
		System.out.println("test car");
	}
}
class C extends A
{
	public void test3()
	{
		System.out.println("ride cycle");
	}
}
class  mainclass
{
	public static void main(String[] args)
	{
		A a1 = (A) new B();
		a1.test1();
		B b1 = (B) a1;
		b1.test1();
		b1.test2();
		A a2 = (A) new C();
		a2.test1();
		C c1 = (C) a2;
		c1.test1();
		c1.test3();
	}
}
