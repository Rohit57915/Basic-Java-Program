class Program12
{
   public static void main(String[] args)
   {
	   char ch='D';
	   
	   if(ch>='A' && ch<='Z')
	   {
		   System.out.println("Uppercase");
	   }
	   else if(ch>='a' && ch<='z')
	   {
		   System.out.println("Lowercase");
	   }
	   else if(ch>='0' && ch<='a')
	   {
		   System.out.println("number");
	   }
	   else 
	   {
		   System.out.println("special character");
	   }
	  
	   
   }
}
