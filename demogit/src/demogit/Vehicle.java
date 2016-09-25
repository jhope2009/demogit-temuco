package demogit;

public class Vehicle {
	private String model;
	private int key;
	private String brand;
	
	public Vehicle(){}
	
	public Vehicle(int key){
		this.key=key;
	}
		
	public void turnon(int key){
		if(this.key==key){
			System.out.print("Encendido");
		}
	}
}
