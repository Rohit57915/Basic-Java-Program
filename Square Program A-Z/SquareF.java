class SquareF
{
	public static void main(String[] args)
	{
		int n = 5; // Size of the square
        
        for (int i = 0; i < n; i++)
			{
            for (int j = 0; j < n; j++)
				{
                
                if (i == 0 || j == 0 || i == n / 2) // Print '*' for the first row, first column, or middle row
				{
                    System.out.print(" * ");
                } 
				else
				{
                    System.out.print("  "); // Print spaces for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
	}
}