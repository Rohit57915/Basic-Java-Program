class Mobile
{
	String model;;
	double price;
	void call()
	{
		System.out.println(model+" is writing");
	}
	void message()
	{
		System.out.println(price+" is listen");
	}
}
public class MainClass3
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile();
		m1.model="S24 Ultra pro max";
		m1.price=1.7;
		m1.call();
		m1.message();
		
		Mobile m2=new Mobile();
		m2.model="Iphone16 pro max";
		m2.price=1.9;
		m2.call();
		m2.message();
		
		Mobile m3=new Mobile();
		m3.model="pixcel9 pro max";
		m3.price=1.3;
		m3.call();
		m3.message();
	}
}