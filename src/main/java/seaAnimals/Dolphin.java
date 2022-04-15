package seaAnimals;

public class Dolphin extends seaAnimals{

    public Dolphin(String name, int yearOfLife, int sizeOfAquarium) {
        super(name, yearOfLife, sizeOfAquarium);
    }


    @Override
    public String toString() {
        return "Dolphin[" +super.toString()+ ']';
    }
}
