package day8;

public class Car {

	int price;
	String model;
	static int wheels;
	public static void start()
	{
		System.out.println("this is to start the car");
	}
	
	public void accl()
	{
		System.out.println("this is for car accl");
	}
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.price=1111;
		c1.model="audi";
		c1.wheels=4;
		
		Car c2=new Car();
		c2.price=2222;
		c2.model="BMW";
		c2.wheels=6;
		

	}

}
