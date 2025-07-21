class SoftwareEngineering
{
	SoftwareEngineering(int a)
	{
		System.out.println("Java Full-stack Developer");
	}
	SoftwareEngineering(String s,int b)
	{
		System.out.println("Developer Engineering");
	}
	SoftwareEngineering(char ch,String f,double k)
	{
		System.out.println("Testing Engineering");
	}
	
}
public class Program14
{
	public static void main(String[] args)
	{
		SoftwareEngineering s1=new SoftwareEngineering(6);
		SoftwareEngineering s2=new SoftwareEngineering("Rama",6);
		SoftwareEngineering s3=new SoftwareEngineering('R',"Sita",5.1);
		
		
	}
}