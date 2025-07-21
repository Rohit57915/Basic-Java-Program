class Laptop
{
	String wallpaper="Alia.jpeg";
}
public class ShallowCopies
{
	public static void main(String[] args)
	{
		Laptop l1=new Laptop();
		Laptop l2=l1;
		System.out.println(l1.wallpaper);
		System.out.println(l2.wallpaper);
		l1.wallpaper="kajol.jpeg";
		System.out.println(l1.wallpaper);
		System.out.println(l2.wallpaper);
	}
}