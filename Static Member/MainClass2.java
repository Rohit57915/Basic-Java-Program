class Sample 
{
	static int x=45;
	static char y='J';
	
	static void play()
	{
		System.out.println("Excuating play....");
	}
	static void disp()
	{
		System.out.println("Excuating disp....");
	}
}
public class MainClass2
{
	public static void main(String[] args)
	{
		System.out.println(Sample.x);
		System.out.println(Sample.y);
		Sample.play();
		Sample.disp();
	}
}