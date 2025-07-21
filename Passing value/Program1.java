class Program1
{
	static void help(char c)
	{
		System.out.println("character : " +c);
	}
	static void verify(boolean b)
	{
		System.out.println("Bollean value : " +b);
	}
	static void run(double d)
	{
		System.out.println("value :" +d);
	}
	public static void main(String[] args)
	{
	run(6.45);
	verify(true);
	help('j');
	}
}