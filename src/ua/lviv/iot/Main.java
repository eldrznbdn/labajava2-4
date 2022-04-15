package ua.lviv.iot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Dolphin> dolphin = new ArrayList<>();

        Dolphin blackDolphin = new Dolphin("blackDolphin",6,4);
        Dolphin blueDolphin = new Dolphin("blueDolphin",4,9);
        Dolphin whiteDolphin = new Dolphin("whiteDolphin",9,5);

        dolphin.add(blackDolphin);
        dolphin.add(blueDolphin);
        dolphin.add(whiteDolphin);



      /* Main main =new Main();
       main.sortDown(dolphin);
        */

    }
   /* public static void sortDown(List<Dolphin> dolphin){
        Collections.sort(dolphin);
        for (Object o : dolphin) {
            System.out.println(o);
        }
    }

    public static void sortUp(List<Dolphin> dolphin){
        Collections.sort(dolphin);
        for (Object o : dolphin) {
            System.out.println(o);
        }
    }*/


}
