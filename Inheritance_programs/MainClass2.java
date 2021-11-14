class P
{
	public int i = 2;
}
class Q extends P
{
	public double j = 2.1;
	public void info()
	{
		System.out.println("i value :"+i);
		System.out.println("j value :"+j);

}
}
class R extends P
{
	public double k = 3.2;
	public void print()
	{
		System.out.println("i value :"+i);
		System.out.println("k value :"+k);
	}
}

class MainClass2
{
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.info();
		R r1 = new R();
		r1.print();
	}
}