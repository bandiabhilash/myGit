class A 
{
	public static int i=61;
	public double j=2.3;
}

class B
{
    public static void main(String[] args) 
	{
		System.out.println(A.i);
		A a1=new A();
		System.out.println(a1.j);
	}
}
