
public class Boat extends Vehicle{

	public Boat(String brand) {
		super(brand, 100);
	}
	
	
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return "Je suis " + this.getBrand() + " et je fais gloo gloo";
	}

}
