class Actor
{
	void acting()
	{
		System.out.println("Actor is Acting");
	}
}
public class MainClassObject
{
	public static void main(String[] args)
	{
		Actor a1=new Actor();
		Actor a2=null;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("Access with object Reference");
		a1.acting();
		System.out.println("Access with Null Reference");
		a2.acting();
		
	}
}