class Sample 
{
	static int x;
	static char y;
	static double z;
	
	static{
		x=25;
		y='J';
		z=34.8;
	}
	public static void main(String[] args)
	{
		System.out.println("Program Start");
		System.out.println(Sample.x);
		System.out.println(Sample.y);
		System.out.println(Sample.z);
		System.out.println("Program Ends");
	}
}