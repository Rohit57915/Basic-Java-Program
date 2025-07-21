class Example5
{
	static int square(int a)// formal value
	{
		int sq=a*a;
		return sq;
	}
	
	public static void main(String[] args)
	{
		for(int i=1; i<=205;i++)
		{
			System.out.println(i+ "Square : "+square(i));
		}
		
	}
}







