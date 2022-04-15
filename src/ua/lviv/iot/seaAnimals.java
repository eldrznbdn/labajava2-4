package ua.lviv.iot;

import java.util.Objects;

public abstract class seaAnimals{//} implements Comparable<seaAnimals> {
    private String name;
    private int yearOfLife;
    private int sizeOfAquarium;

    public seaAnimals(String name, int yearOfLife, int sizeOfAquarium) {
        this.name = name;
        this.yearOfLife = yearOfLife;
        this.sizeOfAquarium = sizeOfAquarium;

    }

   /* @Override
    public int compareTo(seaAnimals o) {
        return this.getSizeOfAquarium() - o.getSizeOfAquarium();
    }*/


    public int getSizeOfAquarium() {
        return sizeOfAquarium;
    }

    public void setSizeOfAquarium(int sizeOfAquarium) {
        this.sizeOfAquarium = sizeOfAquarium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfLife() {
        return yearOfLife;
    }

    public void setYearOfLife(int yearOfLife) {
        this.yearOfLife = yearOfLife;
    }

    @Override
    public String toString() {
        return "seaAnimals[" +
                "name='" + name + '\'' +
                ", yearOfLife=" + yearOfLife +
                ", sizeOfAquarium=" + sizeOfAquarium +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        seaAnimals other = (seaAnimals) obj;
        return yearOfLife == other.yearOfLife && sizeOfAquarium == other.sizeOfAquarium && Objects.equals(name, other.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfLife, sizeOfAquarium);
    }
}
