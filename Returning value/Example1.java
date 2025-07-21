class Example1
{
	static double play()
	{
		return 4.5;
	}
	public static void main(String[] args)
	{
		double val=play();// Store
		System.out.println("Returned value : " +val);// Display
		
		System.out.println("Returned value : "+play() );// Disply
	}
}