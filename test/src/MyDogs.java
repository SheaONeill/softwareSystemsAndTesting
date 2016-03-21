
public class MyDogs {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Jack Russell","Junior");
		Dog dog2 = new Dog("Labrador","Jake");
		Dog dog3 = new Dog("Labrador","Jeff");
		Dog dog4 = new Dog("Labrador","MJ");
		
		//This getName method comes from the base class Animal
		System.out.println(dog1.getName());
		System.out.println(dog1.getDogName());
	}
}
