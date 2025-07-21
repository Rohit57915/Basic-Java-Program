class Alpha
{
	char a='J';
	boolean b=true;
	
	void push()
	{
		System.out.println("Excuating.....");
	}
	void help()
	{
		System.out.println("Excuating....");
	}
}
public class MainClass6
{
	public static void main(String[] args)
	{
		Alpha ref=new Alpha();
		System.out.println(ref.a);
		System.out.println(ref.b);
		ref.push();
		ref.help();
	}
}