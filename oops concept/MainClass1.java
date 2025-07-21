import java.util.Scanner;
class Biriyani
{
	double price;
	String type;
	
	Biriyani(double price)
	{
		this.price=price;
		
	}
}
class BiriyaniHelper
{
	static void displayBiriyani(Biriyani b)
	{
		System.out.println("Type : "+b.type);
		System.out.println("Price : "+b.price);
	}
	static Biriyani createBiriyani()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Type");
		String type=scn.nextLine();
		System.out.println("Enter price");
		double price=scn.nextDouble();
		
		Biriyani b=new Biriyani(price);
		
		return b;
	}
}

public class MainClass1
{
	public static void main(String[] args)
	{
		Biriyani b1=BiriyaniHelper.createBiriyani();
		BiriyaniHelper.displayBiriyani(b1);
		
		Biriyani b2=BiriyaniHelper.createBiriyani();
		BiriyaniHelper.displayBiriyani(b2);
		
		Biriyani b3=BiriyaniHelper.createBiriyani();
		BiriyaniHelper.displayBiriyani(b3);
		
	}
}