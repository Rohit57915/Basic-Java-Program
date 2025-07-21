class Service
{
	int x;
	double y;
	boolean z;
	
	{
		x=100;
	}
	{
		y=4.5;
	}
	{
		z=true;
	}
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		Service ref=new Service();
		System.out.println(ref.x);
		System.out.println(ref.y);
		System.out.println(ref.z);
		System.out.println("Program Ends");
	}
}