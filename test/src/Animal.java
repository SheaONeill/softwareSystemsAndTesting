
public abstract class Animal {
	
	//All animals have a name
	protected String animalName;
	
	//All animals must move, but how is up to the Animal
	public abstract void move();
	
	//A useful generic method for retrieving animal name
	public String getName() {
		return animalName;
	}	
}
