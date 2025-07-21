class Program10
{
	public static void main(String[] args)
	{
		int p=12;
		int q=16;
		int r= ++p + q-- + p-- + ++q ;
		System.out.println(r);
		
		int x=15;
		int y=17;
		int z= x-- + y++ + ++x + --y ;
		System.out.println(z);
	}
	
}