package ua.lviv.iot;

import java.util.Collections;
import java.util.Comparator;

public class Dolphin extends seaAnimals {
    public Dolphin(String name, int yearOfLife, int sizeOfAquarium) {
        super(name, yearOfLife, sizeOfAquarium);
    }


}

/*class sortByYearOfLifeUp implements Comparator<Dolphin> {

    @Override
    public int compare(Dolphin o1, Dolphin o2) {
        return o1.getYearOfLife() - o2.getYearOfLife();
    }
}*/



