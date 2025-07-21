class Test2
{
	public static void main(String[] args)
	{
		char gender='M';
		int age= 21;
		
		
		if(gender=='M')
		{
			if(age>= 21)
			{
				System.out.println(" Eligible Bachelor");
			}
			else
			{
				System.out.println("underage boy");
			}	
			
			
		}
		else if(gender=='F')
		{
			if(age>=18)
			{
				System.out.println(" Eligible spinster");
			}
			else
			{
				System.out.println("underage girl");
			}
		}
		else
		{
			System.out.println("select gender");
		}
		
		
	}
}