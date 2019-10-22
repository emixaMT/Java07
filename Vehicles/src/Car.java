
public class Car extends Vehicle{

	public Car(String name) {
		super(name);
	}


	@Override
	public String doStuff() {
		return "Je suis " + this.getBrand() + " et je fais vroom vroom";
	}

	
}
