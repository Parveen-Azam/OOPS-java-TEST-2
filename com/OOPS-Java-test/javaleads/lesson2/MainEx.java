package javaleads.lesson2;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehicle vh=new Car("Car");
		vh.BasicInfo("is the Road Transportation Vehicle ");
		
		vh.PrintVehicleDetails("Car",5);
		vh.RunVehicle();
		
		Car cr=new Car("");
		cr.EngineCount(5);
	    
		
		Vehicle vb=new Boat("Boat"); 
		vb.BasicInfo("is the Water Transportation Vehicle");
		
        vb.PrintVehicleDetails("Boat",15);
        vb.RunVehicle();
         
        Boat b=new Boat(" ");
        b.EngineCount(8);
	}

}
