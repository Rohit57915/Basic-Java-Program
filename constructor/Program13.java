class SoftwareEngineering
{
	SoftwareEngineering(int a)
	{
		System.out.println("Java Full-stack Developer");
	}
	SoftwareEngineering(String s)
	{
		System.out.println("Mern Full-stack Developer");
	}
	SoftwareEngineering(char ch)
	{
		System.out.println("Testing Engineering");
	}
	SoftwareEngineering(double d)
	{
		System.out.println("Python Developer");
	}
}
public class Program13
{
	public static void main(String[] args)
	{
		SoftwareEngineering s1=new SoftwareEngineering(6);
		SoftwareEngineering s2=new SoftwareEngineering("Rama");
		SoftwareEngineering s3=new SoftwareEngineering('R');
		SoftwareEngineering s4=new SoftwareEngineering(6.5);
		
	}
}