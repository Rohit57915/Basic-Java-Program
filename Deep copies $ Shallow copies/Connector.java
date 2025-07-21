class Connector
{
	int a;
	double b;
	char c;
	
	{
		a=100;
	}
	{
		b=4.5;
	}
	{
		c='Q';
	}
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		Connector ref=new Connector();
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println(ref.c);
		System.out.println("Program Ends");
	}
}