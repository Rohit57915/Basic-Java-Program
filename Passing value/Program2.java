class Program2
{
	static void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println(+a"  +   "+b+"  =  "+sum);
	}
	static void multiplication(int a,int b)
	{
		int mul=a*b;
		System.out.println(+a"  +   "+b+"  =  "+mul);
	}
	static void divisor(int a,int b)
	{
		int div=a/b;
		System.out.println(+a"  +   "+b+"  =  "+div);
	}
	static void substracter(int a,int b)
	{
		int sub=a-b;
		System.out.println(+a"  +   "+b+"  =  "+sub);
	}
	public static void main(String[] args)
	{
		addition(32,56);
		multiplication(43,6);
		divisor(24,6);
		substracter(677,545);
	}
}