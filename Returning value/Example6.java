class Example6
{
	static int factorial(int n)// formal value
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	  public static void main(String[] args)
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println(i+ "factorial : "+factorial(i));
		}
		
	}
}







