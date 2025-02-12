class Animal {
	public void sound() {
		System.out.println("some sound");
	}
}
class Cat extends Animal {
	public void sound() {
		System.out.println("meow meow");
	}
    public void play() {
		System.out.println("The cat is playing");
	}
}
class Dog extends Animal {
	public void sound() {
		System.out.println("woof woof");
	}
	public void play() {
		System.out.println("The dog is playing");
	}
}

public class Entry {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.sound();
        animal2.sound();
		// Down-casting
		((Cat)animal2).play();
		((Dog)animal1).play();
	}
}
