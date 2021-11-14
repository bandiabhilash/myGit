interface Vehicle
{
	void move();
}
interface Twowheller
{
	void park();
}
interface Bike
{
	void race();
}
class royalenfield implements Vehicle,Twowheller,Bike
{
	public void move()
	{
		System.out.println("move fast");
	}
	public void park()
	{
		System.out.println("park on road");
	}
	public void race()
	{
		System.out.println("race on beach");
	}
}
class mainclass7
{
	public static void main(String[] args) 
	{
		royalenfield r1 = new royalenfield();
		r1.move();
		r1.park();
		r1.race();
	}
}
