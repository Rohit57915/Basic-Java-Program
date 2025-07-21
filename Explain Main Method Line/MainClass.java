class Calculator
{
     void add(int... arr)
	 {
		 int sum=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 sum=sum+arr[i];
		 }
		 System.out.println("sum : "+sum);
	 }
}
public class MainClass
{
	public static void main(String[] args)
	{
		Calculator Cal=new Calculator();
		Cal.add(2,3);
		Cal.add(2,3,5);
		Cal.add(2,3,9);
		Cal.add(2,7);
		Cal.add(9,8);
		
	}
}