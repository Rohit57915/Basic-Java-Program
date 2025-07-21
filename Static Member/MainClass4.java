class Delta
{
	int a=23;
	void test()
	{
		System.out.println("Excuating noon static.....");
	}
	
}
public class MainClass4
	{
		public static void main(String[] args)
		{
			System.out.println(new Delta().a);
			new Delta().test();
		}
	}