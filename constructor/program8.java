class Iphone
{
	Iphone(int a)
	{
		System.out.println("Iphone15 max");
	}
	Iphone(int a,int b)
	{
		System.out.println("Iphone15 pro plus");
	}
	Iphone(int a,int b,int c)
	{
		System.out.println("Iphone15 pro");
	}
}
public class program8
{
	public static void main(String[] args)
	{
		Iphone p1=new Iphone(8);
		Iphone p2=new Iphone(9,5);
		Iphone p3=new Iphone(5,6,3);
	}
}