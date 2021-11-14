class Cat 
{
	public String cName;
	Cat(String z)
	{
		cName = z;
	}

	public void display()
	{
		System.out.println("Cat Name is ...."+cName);
	}
	public static void main(String[] args) 
	{
		Cat c1 = new Cat("puppy");
		Cat c2 = new Cat("sippy");
		Cat c3 = new Cat("dippy");
		c1.display();
		c2.display();
		c3.display();
	}
}
