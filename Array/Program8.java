class Program8
{
	public static void main(String[] args)
	{
		int[] arr={10,14,13,15,16};
		
		int sum=0;
		
		for(int i=0; i<arr.length;i++)
		{
			
			sum=sum+arr[i];
		}
			int  avg=sum/arr.length;
			
		
		System.out.println("Average sum of number : " +avg);
	}
}