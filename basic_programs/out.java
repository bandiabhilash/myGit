class  out
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		System.out.println(a>b && a>c && a>d && a>e ? "a is greater :" + a:b>c && b>d && b>e ? "b is greater :" + b:c>d && c>e ? "c is greater :"+c:d>e ?"d is greater :"+d:"e is greater:"+e);
	}
}
