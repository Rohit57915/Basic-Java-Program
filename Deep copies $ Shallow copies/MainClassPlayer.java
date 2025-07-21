class Patient
{
	String name;
	int eid;
	void rightHandBatsman()
	{
		System.out.println("Player Name "+name);
	}
	void coverDrive()
	{
		System.out.println("Jersey Number "+jerseyNumber);
	}
}
public class MainClassPlayer
{
	public static void main(String[] args)
	{
		
		Player p1=new Player();
		p1.name="Rohit Sharma";
		p1.jerseyNumber=45;
		p1.rightHandBatsman();
		p1.coverDrive();
		
		Player p2=new Player();
		p2.name="Virat Kholi";
		p2.jerseyNumber=18;
		p2.rightHandBatsman();
		p2.coverDrive();
	}
}