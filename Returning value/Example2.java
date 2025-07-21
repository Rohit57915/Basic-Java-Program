class Example2
{
	static char disp()
	{
		return 'J';
	}
	static boolean send()
	{
		return true;
	}
	public static void main(String[] args)
	{
		char ch=disp();// Store
		System.out.println("Returned value : " +ch);// Display
		
		System.out.println("Returned value : "+send() );// Disply
	}
}