class Example
{
	static int test()
	{
		return 10;
	}
	public static void main(String[] args)
	{
		int val=test();// Store
		System.out.println("Returned value : " +val);// Display
		
		System.out.println("Returned value : "+test() );// Disply
	}
}