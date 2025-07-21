class Program6
{
	public static void main(String[] args)
	{
		int a=11;
		int b= ++a + ++a ;
		System.out.println(b);
		
		int c=17;
		int d= --c + --c ;
		System.out.println(d);
		
		int p=14;
		int q= ++p + ++p + ++p ;
		System.out.println(q);
		
		int r=18;
		int s= --r + --r + --r ;
		System.out.println(s);
		
		int x=17;
		int y=15;
		int z= ++x + --y + ++x + --y ;
		System.out.println(z);
		
	}
}