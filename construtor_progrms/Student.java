class Student 
{
	public String sname;
	public int htno;

	Student(String i,int j)
	{
		sname = i;
		htno = j;
	}
	public void info()
	{
		System.out.println(sname+htno);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("ABHILASh",502);
		Student s2 = new Student("SAI",503);
		s1.info();
		s2.info();
	}
}