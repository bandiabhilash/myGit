class M
{
	public double i = 8.1;
}
class N extends M
{
	public int j = 9;
}
class O extends N 
{
	public int k = 10;

	public void display()
	{
		System.out.println("i value :" + i);
		System.out.println("j value :" + j);
		System.out.println("k value :" + k);
	}
}
class mainClass1
{
	public static void main(String[] args) 
	{
		O o1 = new O();
		o1.display();
	}
}