class Car
{
	double milage;
	double price;
	void drive()
	{
		System.out.println(milage+" is car");
	}
	void speed()
	{
		System.out.println(price+" is car");
	}
}
public class MainClass4
{
	public static void main(String[] args)
	{
		Car alto=new Car();
		alto.milage=18.5;
		alto.price=6.7;
		alto.drive();
		alto.speed();
		
		Car audi=new Car();
		audi.milage=10.5;
		audi.price=67.5;
		audi.drive();
		audi.speed();
		
		Car mercedesbenz=new Car();
	    mercedesbenz.milage=188.5;
		mercedesbenz.price=5.7;
		mercedesbenz.drive();
		mercedesbenz.speed();
	}
}