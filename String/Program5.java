class Program5
{
	public static void main(String[] args)
	{
		String str="Developer";
		System.out.println(str.lastIndexOf('v'));
		System.out.println(str.lastIndexOf('o'));
		System.out.println(str.lastIndexOf('j'));
		
		int x=str.lastIndexOf('e');
		
		while(x!=-1)
		{
			System.out.println(x);
			x=str.lastIndexOf('e',x-1);
		}
	}
}