class Delta 
{
	static int p;
	static double q;
	static boolean r;
	
	static{
		p=100;
	}
	static{
		q=6.7;
	}
	static{
		r=true;
	}
	public static void main(String[] args)
	{
		System.out.println("Program Start");
		System.out.println(Delta.p);
		System.out.println(Delta.q);
		System.out.println(Delta.r);
		System.out.println("Program Ends");
	}
}