class Test
{
	public void Rect()
	{
		System.out.println("move clockwise direction");
	}
}
class Circle extends Test
{
	public void Rect()
	{
		System.out.println("move anti-clockwise direction");
	}
}
class Tri extends Test
{

}
class mainclass4
{
	public static void main(String[]args)
	{
		new Test().Rect();
		new Circle().Rect();
		new Tri().Rect();
	}
}