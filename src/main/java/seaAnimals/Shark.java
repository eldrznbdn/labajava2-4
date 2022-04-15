package seaAnimals;

public class Shark extends seaAnimals{

    public Shark(String name, int yearOfLife, int sizeOfAquarium) {
        super(name, yearOfLife, sizeOfAquarium);
    }

    @Override
    public String toString() {
        return "Shark[" +super.toString() + ']';
    }
}
