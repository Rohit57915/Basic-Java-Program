class Employee
{
	int id;
	double ctc;
	void work()
	{
		System.out.println(id+" is writing");
	}
	void meeting()
	{
		System.out.println(ctc+" is listen");
	}
}
public class MainClass2
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.id=101;
		e1.ctc=5.5;
		e1.work();
		e1.meeting();
		
		Employee e2=new Employee();
		e2.id=102;
		e2.ctc=7.5;
		e2.work();
		e2.meeting();
	}
}