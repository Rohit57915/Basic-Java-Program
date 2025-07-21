class Beta
{
	int p=100;
	double q=1.9;
	void run()
	{
		System.out.println("Excuating non static.....");
	}
	void send()
	{
		System.out.println("Excuating non static.....");
	}
	
}
public class MainClass5
	{
		public static void main(String[] args)
		{
			Beta ref=new Beta();
			System.out.println(ref.p);
			System.out.println(ref.q);
			ref.run();
			ref.send();
		}
	}