class Car 
{
	public int t1(int d,int s)
	{
		return d/s;
	}
	public static void main(String[] args) 
	{
		Car obj1 = new Car();
		int result = obj1.t1(600,120);
		System.out.println("result time = "+result+"hours");
	}
}