interface A
{
	public void move();
} 
interface B
{
	public void move();
}
class implements A ,B
{
	public void move()
	{
		System.out.println("move forward");
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		move m1=new move();
		m1.A;
		m1.B;
	}
}
