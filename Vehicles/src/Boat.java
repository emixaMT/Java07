
public class Boat extends Vehicle{

	public Boat(String name) {
		super(name);
	}
	
	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return "Je suis " + this.getBrand() + " et je fais gloo gloo";
	}

}
