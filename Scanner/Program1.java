import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
	    Scanner read=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=read.nextInt();
		if(num%2==0)
		{
		    System.out.println("Even Number :");
		}
		else
		{
			System.out.println("Odd Number :");
		}
	}
}