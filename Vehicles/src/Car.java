
public class Car extends Vehicle{

	public Car(String name, int kilometers) {
		super(name, kilometers);
	}


	@Override
	public String doStuff() {
		return "Je suis " + this.getBrand() + " et je fais vroom vroom";
	}

	
}
