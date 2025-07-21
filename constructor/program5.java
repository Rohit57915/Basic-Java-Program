class Student
{
	Student()
	{
		System.out.println("personal Details");
		System.out.println("acadmic details");
	}
	Student(boolean b)
	{
		System.out.println("personal Detail");
		System.out.println("acadmic detatils");
		System.out.println("Experience Detail");
	}
	
}
public class program5
{
	public static void main(String[] args)
	{
		
		Student s1=new Student();
		Student s2=new Student(true);
		
		
		
	}
}