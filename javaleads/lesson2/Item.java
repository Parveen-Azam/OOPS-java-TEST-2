package javaleads.lesson2;

public class Item implements Product {

	String ProductName;
	int Quantity;
	
	public void addStock(String name, int t) {
		// TODO Auto-generated method stub
		
		this.ProductName=name;
		this.Quantity=t;
		
		System.out.println("ProductName==" +name);
		System.out.println("Quantity==" +t);
		
	}
	
	
}
