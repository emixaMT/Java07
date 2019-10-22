
public abstract class Vehicle 
{
	private String brand;
	private int kilometers;
	
	public Vehicle(String name)
	{
		brand = this.brand;
		kilometers = this.kilometers;
	}
	
	public abstract String doStuff();
	
	
	
	
	//Getter et Setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	
}
