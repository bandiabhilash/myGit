interface Sample1
{
	public void add();
}
class Add1 implements Sample1
{
	public void add()
	{
		int a = 10;
		int b = 20;
		System.out.println("Addition method present in ADD1 class ="+(a+b));
	}
	public void sub()
	{
		int a = 20;
		int b = 10;
		System.out.println("substraction ="+(a-b));
	}
}
class Add2 implements Sample1
{
	public void add()
	{
		int c = 5;
		int d = 6;
		System.out.println("Add ="+(c+d));
	}
	public void div()
	{
		int c = 10;
		int b = 5;
		System.out.println("Division ="+(c/b));
	}
}
class mainclass5 
{
	public static void main(String[] args) 
	{
		Add1 obj1 = new Add1();
		obj1.add();
		obj1.sub();
		Add2 obj2 = new Add2();
		obj2.add();
		obj2.div();
	}
}