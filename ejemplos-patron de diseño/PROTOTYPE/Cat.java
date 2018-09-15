package prototype.examples.animals;


public class Cat implements Animal {
    @Override
    public Animal clone() {
        Cat catClone = null;

        try {
            catClone = (Cat) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return catClone;
    }

    public String toString(){
        return "This is a Cat";
    }
}