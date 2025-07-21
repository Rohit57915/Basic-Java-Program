class Sample 
{
	int num;
	void play()
	{
		System.out.println("Excuating play().....");
	}
	Sample()
	{
		System.out.println("Excuating Sample.....");
		num=356;
	}
	
}
public class mainZeroArgumentConst
{
	public static void main(String[] args)
	{
		Sample ref=new Sample();
		System.out.println(ref.num);
		ref.play();
		
		
	}
}