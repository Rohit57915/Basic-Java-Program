class Delta
{
	int a;
	double d;
	String s;
	
}
public class mainDefaultConstructor
{
	public static void main(String[] args)
	{
		Delta ref=new Delta();
		System.out.println(ref.a);//0
		System.out.println(ref.d);// 0.0
		System.out.println(ref.s);// null
		
	}
}