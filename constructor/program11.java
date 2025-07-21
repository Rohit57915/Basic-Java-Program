class Car
{
	
	Car(double d,String s)
	{
		System.out.println("Mercedes-Benz C-Class");
	}
	Car(String s,double d)
	{
		System.out.println("Mercedes-Benz E-Class");
	}
}
public class program11
{
	public static void main(String[] args)
	{
		
		Car c1=new Car(8.6,"ROhit");
		Car c2=new Car("Virat",6.2);
	}
}