class Utility
{
	static int a=25;
	int b=50;
	
	static void test()
	{
		System.out.println("Excate satic member....");
	}
	void disp()
	{
		System.out.println("Excuate non static member....");
	}
}
public class MainClass7
{
	public static void main(String[] args)
	{
		System.out.println(Utility.a);
		System.out.println(new Utility().b);
		Utility.test();
		new Utility().disp();
	}
}