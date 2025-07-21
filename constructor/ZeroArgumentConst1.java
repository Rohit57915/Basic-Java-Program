class Alpha  
{
	int x;
	double y;
	char z;
	
	Alpha()
	{
		System.out.println("Excuating Alpha().....");
		x=100;
		y=44.30;
		z='J';
	}
	
	
}
public class ZeroArgumentConst1
{
	public static void main(String[] args)
	{
		Alpha a1=new Alpha();
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a1.z);
		
		
	}
}