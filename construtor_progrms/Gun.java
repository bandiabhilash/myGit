class Gun 
{
	public String gname;
	public int bullets;

	Gun(String i,int j)
	{
		gname = i;
		bullets = j;
	}
	public void info()
	{
		System.out.println(gname+" Fires "+bullets+"bullets");
	}
	public static void main (String[]args)
	{
		Gun g1 = new Gun("AK47",110);
		Gun g2 = new Gun("Pistol",6);
		g1.info();
		g2.info();
	}
}