class Demo
{
	int val;
	void test()
	{
		System.out.println("Excuating test....");
	}
}
public class mainConstructor
{
	public static void main(String[] args)
	{
		Demo ref=new Demo();
		System.out.println(ref.val);
		ref.test();
	}
}