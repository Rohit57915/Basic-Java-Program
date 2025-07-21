class City
{
	City(int a)
	{
		System.out.println("New Work");
	}
	City(int a,int b)
	{
		System.out.println("Paris");
	}
	City(int a,int b,int c)
	{
		
		System.out.println("Delhi");
	}
}
public class program2
{
	public static void main(String[] args)
	{
		
		City c1=new City(23);
		City c2=new City(23,45);
		City c3=new City(23,45,67);
		
	}
}