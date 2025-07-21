class Example
{
	char c;
	
	{
		c='Q';
	}
	{
		c='Z';
	}
	{
		c='C';
	}
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		Domain ref=new Domain();
		System.out.println(ref.c);
		
		System.out.println("Program Ends");
	}
}