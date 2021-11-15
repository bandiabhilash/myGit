interface Missile
{
	void move();
}
class Missile1 implements Missile
{
	public void move()
	{
		System.out.println("Ground to sky");
	}
}
class Missile2 implements Missile
{
	public void move()
	{
		System.out.println("Sky to Ground");
	}
}
class Missile3 implements Missile
{
	public void move()
	{
		System.out.println("Water to Sky");
	}
}
class Battle
{
	public static void Fight(Missile m1)
	{
		m1.move();
	}
}
class mainclass 
{
	public static void main(String[] args) 
	{
		Battle.Fight(new Missile1());
		Battle.Fight(new Missile2());
		Battle.Fight(new Missile3());
	}
}