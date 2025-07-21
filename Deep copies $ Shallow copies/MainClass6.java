class Email 
{
	String from;
	String to;
	void readEmail()
	{
		System.out.println("Reading Email from "+from);
	}
	void sendEmail()
	{
		System.out.println("Sending Email to "+to);
	}
}
public class MainClass6
{
	public static void main(String[] args)
	{
		Email e1=new Email();
		e1.from="pavan@gmail.com";
		e1.to="keshav@gmail.com";
		e1.sendEmail();
		e1.readEmail();
		
		Email e2=new Email();
		e2.from="abhishek@gmail.com";
		e2.to="samaya@gmail.com";
		e2.sendEmail();
		e2.readEmail();
		
	}
}