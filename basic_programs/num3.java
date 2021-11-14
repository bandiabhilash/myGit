class num3 
{
	public static void main(String[] args) 
	{
		int a=180/3;
		int b=180/5;
		int c=180/6;
		int d=180/8;
		if(a/b||a/c||a/d)
		{
		System.out.println(a+"is divisible number");
		}
		else if(b/c||b/d)
		{
			System.out.println(b+"is divisible number");
		}
		else if(c/d)
		{
			System.out.println(c+"is divisible number");
		}
		else
		{
			System.out.print(d+"is not divisible number");
		}
	}
}
