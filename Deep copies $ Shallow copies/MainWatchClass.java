class Watch 
{
	double hours;
	double minutes;
	
	void showTime()
	{
		System.out.println("Show hour " +hours);
	}
	void showDate()
	{
		System.out.println("Show Minute " +minutes);
	}
}
public class MainWatchClass
{
	public static void main(String[] args)
	{
		Watch w1=new Watch();
		w1.hours=08.0;
		w1.minutes=30.0;
		w1.showTime();
		w1.showDate();
	}
	
}