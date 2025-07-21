class Program3
{
	public static void main(String[] args)
	{
		int a=10;
		int b= a++ + a++;
		System.out.println(b);
		
		int c=14;
		int d= c-- + c-- ;
		System.out.println(d);
		
		int p=12;
		int q= p++ + p++ + p++ ;
		System.out.println(q);
		
		int r=16;
		int s= r-- + r-- + r-- ;
		System.out.println(s);
		
		int x=18;
		int y=12;
		int z= x-- + y++ + x-- + y++ ;
		System.out.println(z);
	}
}