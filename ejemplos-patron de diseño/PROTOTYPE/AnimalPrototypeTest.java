package prototype.examples.animals;


public class AnimalPrototypeTest {

    public static void main(String[] args) {

        AnimalCloneFactory factory = new AnimalCloneFactory();
        Animal animal;
        Animal clonedAnimal;

        System.out.println("Turn of the dogs...");

        animal = new Dog();
        clonedAnimal = (Dog) factory.getClone(animal);
        System.out.println(animal + " with ID: " + System.identityHashCode(System.identityHashCode(animal)));
        System.out.println(clonedAnimal + " with ID: " + System.identityHashCode(System.identityHashCode(clonedAnimal)));

        System.out.println("Turn of the cats...");

        animal = new Cat();
        clonedAnimal = (Cat) factory.getClone(animal);
        System.out.println(animal + " with ID: " + System.identityHashCode(System.identityHashCode(animal)));
        System.out.println(clonedAnimal + " with ID: " + System.identityHashCode(System.identityHashCode(clonedAnimal)));


    }

}