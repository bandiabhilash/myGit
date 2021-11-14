interface E
{
	void sample();
}
interface F
{
	void sample();
}
class G implements E,F
{
	public void sample()
	{
		System.out.println("hello");
	}
}

class mainclass11
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.sample();
	}
}
