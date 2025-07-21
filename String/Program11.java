class Program11
{
	public static void main(String[] args)
	{
		String str="Qspider Jspider Software Development And Testing Center";
		String[] arr=str.split("er");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}