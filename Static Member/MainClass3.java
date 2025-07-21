class Example 
{
	static double i=45.25;
	static boolean j=true;
	
	static void run()
	{
		System.out.println("Excuating run....");
	}
	static void help()
	{
		System.out.println("Excuating help....");
	}
}
public class MainClass3
{
	public static void main(String[] args)
	{
		System.out.println(Example.i);
		System.out.println(Example.j);
		Example.run();
		Example.help();
		
	}
}