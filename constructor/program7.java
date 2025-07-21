class Iphone
{
	Iphone(int a)
	{
		System.out.println("Iphone15");
	}
	Iphone(double b)
	{
		System.out.println("Iphone15 plus");
	}
	Iphone(String s)
	{
		System.out.println("Iphone15 pro");
	}
}
public class program7
{
	public static void main(String[] args)
	{
		Iphone p1=new Iphone(8);
		Iphone p2=new Iphone(9.5);
		Iphone p3=new Iphone('J');
	}
}