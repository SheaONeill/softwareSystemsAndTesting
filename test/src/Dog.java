
public class Dog extends Mammal {

	private String dogName;

	//Constructor for Dogs that are pets
	public Dog(String animalName,String dogName) {
		this.animalName = animalName;
		this.dogName = dogName;
	}

	//For dogs that are not pets
	public Dog(String animalName) {
		this.animalName = animalName;
	}

	public String getDogName() {
		return dogName;
	}

	public void move() {
		//Go walkies!!
	}

}
