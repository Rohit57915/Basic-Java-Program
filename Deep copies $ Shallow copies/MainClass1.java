class Student
{
	String name;
	long mobile;
	void write()
	{
		System.out.println(name+" is writing");
	}
	void listen()
	{
		System.out.println(mobile+" is listen");
	}
}
public class MainClass1
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="Rama";
		s1.mobile=2659595959L;
		s1.write();
		s1.listen();
		
		Student s2=new Student();
		s2.name="Sita";
		s2.mobile=2659595959L;
		s2.write();
		s2.listen();
	}
}