class Demo
{
	static int a;
	
	static{
		a=10;
	}
	public static void main(String[] args)
	{
		System.out.println("Program Start");
		System.out.println(Demo.a);
		System.out.println("Program Ends");
	}
}