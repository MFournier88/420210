package Zoo;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void animalSound() {
        super.animalSound();
        System.out.println("The dog " + this.name + " says : bow wow!");
    }
}
