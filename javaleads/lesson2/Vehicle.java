package javaleads.lesson2;

public abstract class Vehicle {
	
	private String type;
	private int capacity;
	
	
	public abstract void PrintVehicleDetails(String t,int c);
	public abstract void RunVehicle();
	
	String VehicleName=" ";
	
	Vehicle(String name)
	{
		 this.VehicleName=name;
	}
	public void BasicInfo(String details)
	{
		System.out.println(this.VehicleName + " " + details);
	}
	
		

}
