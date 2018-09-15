package prototype.examples.animals;


public class Dog implements Animal {
    @Override
    public Animal clone() {
        Dog dogClone = null;

        try {
            dogClone = (Dog) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return dogClone;
    }

    public String toString(){
        return "This is a Dog";
    }

}