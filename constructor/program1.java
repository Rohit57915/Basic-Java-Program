class Food
{
	Food(int a)
	{
		System.out.println("Panner chilli");
	}
	Food(double d)
	{
		System.out.println("Pasta");
	}
	Food(String s)
	{
		System.out.println("Momes");
	}
}
public class program1
{
	public static void main(String[] args)
	{
		Food f1=new Food(34);
		Food f2=new Food(34.2);
		Food f3=new Food("Abc");
		
	}
}