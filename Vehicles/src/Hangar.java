
public class Hangar {

	public static void main(String[] args) {
		Vehicle clio = new Car("Clio");
		clio.setBrand("Clio");
		
		Vehicle titanic = new Boat("Titanic");
		titanic.setBrand("Titanic");
		
		System.out.println(clio.doStuff());
		System.out.println(titanic.doStuff());
		
	}

}
