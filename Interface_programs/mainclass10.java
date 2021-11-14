interface A
{
	void stand();
}
class B
{
	public void sit();
}
class C extends B implements A
{
	public void stand()
	{
		System.out.println("in a queue...");
	}
	public void sit()
	{
		System.out.println("on bench...");
	}}
class mainclass10
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.stand();
		c1.sit();

	}
}