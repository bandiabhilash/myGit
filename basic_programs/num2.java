class num2
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=40;
		int c=60;
		int d=80;
		int e=100;
		if(a<b&&a<c&&a<d&&a<e)
		{
		System.out.println(a+" is smallest");
		}
		else if(b<c&&b<d&&b<e)
		{
			System.out.println(b+"is smallest");
		}
		else if(c<d&&c<e)
		{
			System.out.println(c+"is smallest");
		}
		else if(d<e)
		{
			System.out.println(d+"is smallest");
		}
		else
		{
			System.out.println(e+"is smallest");
		}
	}
}
