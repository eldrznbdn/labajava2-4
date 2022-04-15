package seaAnimals;

public class Fish extends seaAnimals{

    public Fish(String name, int yearOfLife, int sizeOfAquarium) {
        super(name, yearOfLife, sizeOfAquarium);
    }

    @Override
    public String toString() {
        return "Fish[" +super.toString() +']';
    }
}
