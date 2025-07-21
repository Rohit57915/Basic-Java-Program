class program8
{
	
	public static void main(String[] args)
	{
		int a=1;
		int b=10;
		int sum=0, evensum=0,oddsum=0;
		while(a<=b)
		{
			sum=sum+a;
			if(a%2==0)
			{
				evensum=evensum+a;
			}
			else
			{
				oddsum=oddsum+a;
			}
			a++;
		}
		System.out.println("sum :" +sum);
		System.out.println("evensum :" +evensum);
		System.out.println("oddsum :" +oddsum);
		
	}
}