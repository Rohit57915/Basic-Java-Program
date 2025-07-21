class Test8
{
	public static void main(String[] args)
	{
		int hours = 2;
		int minute = 30;
		
		double minuteangle = minute * 6;
		double hourangle = hours * 30 + minute * 0.5;
		
		double angle;
		
		if( hourangle > minuteangle)
		{
			angle = hourangle - minuteangle;
		}
		else
		{
			angle = minuteangle - hourangle;
		}
		if( angle > 180)
		{
			angle = 360-angle ;
		}
		
		System.out.println("leastAngle : " +angle);
		
	}
}