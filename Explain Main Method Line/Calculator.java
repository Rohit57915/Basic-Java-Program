class Calculator
{
     static void add(int... a)
	 {
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		 System.out.println("sum : "+sum);
	 }
}
public class MainClass
{
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		Cal.add(2,3);
		Cal.add(2,3,5);
		Cal.add(2,3,9);
		Cal.add(2,7);
		Cal.add(9,8);
		
	}
}