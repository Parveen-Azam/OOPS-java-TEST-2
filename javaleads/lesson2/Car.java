package javaleads.lesson2;

public class Car extends Vehicle {
	
	private String type;
	private int capacity;
	private int engineCount;
	
	Car(String name) 
	{
		super(name);
	
	}


	public void PrintVehicleDetails(String t, int c)//overriding the method 
	{
		this.type=t;
		this.capacity=c;
		System.out.println("Printing the Car Vehicle Details");
		System.out.println("type== " +type);
		System.out.println("capacity== " +capacity);
	}

	public void RunVehicle()
	{
		System.out.println("Running the Car");
	
	}
	public void EngineCount(int e)
	{
		
		this.engineCount =e;
		
		System.out.println("engineCount== "+engineCount);
		
	}
}
