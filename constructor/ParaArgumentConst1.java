class Container 
{
	int capacity;
	Container(int arg)
	{
		capacity=arg;
	}
	
	
}
public class ParaArgumentConst1
{
	public static void main(String[] args)
	{
		Container c1=new Container(250);
		System.out.println(c1.capacity);
		Container c2=new Container(500);
		System.out.println(c2.capacity);
		Container c3=new Container(100);
		System.out.println(c3.capacity);
		
		
	}
}