class Car
{
	Car(int a)
	{
		System.out.println("Mercedes-Benz S-class");
	}
	Car(double d,String s)
	{
		System.out.println("Mercedes-Benz C-Class");
	}
	Car(char ch,double d)
	{
		System.out.println("Mercedes-Benz E-Class");
	}
}
public class program12
{
	public static void main(String[] args)
	{
		Car c1=new Car(6);
		Car c2=new Car(8.6,"ROhit");
		Car c3=new Car('B',6.2);
	}
}