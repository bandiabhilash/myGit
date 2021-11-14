class num4
{
	public static void main(String[] args) 
	{
		int a=20;
		if(a%3==0&&a%5==0&&a%6==0&&a%8==0)
		{
		System.out.println(a+"is divisible");
		}
	else if(a%5==0&&a%6==0&&a%8==0)
		{
		System.out.println(a+"is divisible");
		}
	else if(a%6==0&&a%8==0)
		{
		System.out.println(a+"is divisible");
		}
	else(a%8==0)
		{
		System.out.println(a+"is not divisible");
		}
	}
}
