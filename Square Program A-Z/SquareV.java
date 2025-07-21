class SquareV
{
	public static void main(String[] args)
	{
		int n=5;
		
		for (int i = 0; i < n; i++)
		{
            for (int j = 0; j < n; j++)
			 {
                
                if (j == i && i <= n / 2) // Conditions to print 'V'
				{ 
                    System.out.print("* "); // Left diagonal of V
                } 
				else if (j == n - i-1 && i <= n / 2) 
				{ 
                    System.out.print("* "); // Right diagonal of V
                }
				
				else 
				{
                    System.out.print("  "); // Print spaces for other positions
                }
			  }
			System.out.println();
		}
	}
}