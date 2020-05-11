package javaleads.lesson2;

public class Boat extends Vehicle{
 
	private int engineCount;
	private int capacity;
	private String type;
	
	Boat(String name)
	{
		super(name);
		
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

	public void PrintVehicleDetails(String t,int c) {
		// TODO Auto-generated method stub
		
		this.type=t;
		this.capacity=c;
		System.out.println("Printing the Boat Vehicle Details");
		System.out.println("type== " +type);
		System.out.println("capacity== " +capacity);
	}

}
