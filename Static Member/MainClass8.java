class Service
{
	static char c='J';
	double d=50.25;
	
	static void play()
	{
		System.out.println("Excate satic member....");
	}
	void help()
	{
		System.out.println("Excuate non static member....");
	}
}
public class MainClass8
{
	public static void main(String[] args)
	{
		System.out.println(Service.c);
		System.out.println(new Service().d);
		Service.play();
		new Service().help();
	}
}