class Car
{
	Car(int a)
	{
		System.out.println("Mercedes-Benz Gls");
	}
	Car(double d)
	{
		System.out.println("Mercedes-Benz C-Class");
	}
	Car(char ch)
	{
		System.out.println("Mercedes-Benz E-Class");
	}
}
public class program10
{
	public static void main(String[] args)
	{
		Car c1=new Car(6);
		Car c2=new Car(8.6);
		Car c3=new Car('c');
	}
}