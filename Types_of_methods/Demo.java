class Demo 
{
	int=(5,6);
	double=(5.0,6.1);

	public void multiply(int a,int b)
	{
		System.out.println("inside int,int);
	}
	public void multiply(double a,double b)
	{
		System.out.println("inside double,double);
	}
	public void multiply(int a,double b)
	{
		System.out.println("inside int,double);
	}
    public static void main(String[] args) 
	{
		System.out.println(a*b);
		System.out.println(a*b);
        System.out.println(a*b);

	}
}
