interface Train
{
	void bhogi();
}
abstract class Bus
{
	abstract public void volvo();
}
class Bike extends Bus implements Train
{
	public void bhogi()
	{
		System.out.println("faster");
	}
	public void volvo()
	{
		System.out.println("slower");
	}
}
class mainclass9
{
	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
		b1.bhogi();
		b1.volvo();
	}
}
