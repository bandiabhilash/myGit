class Calender
{
	private int monthNum;

	public int fetch()
	{
		return this.monthNum;
	}
	public void rec(int monthNum)
	{
		if(monthNum>=1 && monthNum<=12)
		{
			this.monthNum = monthNum;
		}
		else
		{
			System.out.println("Invalid month...");
		}
	}
}

class mainclass 
{
	public static void main(String[] args) 
	{
		Calender c1 = new Calender();
		c1.rec(6);
		System.out.println(c1.fetch());
	}
}
