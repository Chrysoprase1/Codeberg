// program that has an Arraylist<Human> and has a overridden sort method in Human class
// sorts from highest to lowest wage

import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Matti", 150000));
        humans.add(new Human("Merja", 500));
        humans.add(new Human("Pertti", 80));

        System.out.println(humans);
        Collections.sort(humans);
        System.out.println(humans);
        humans.get(0).compareTo (humans.get(1));

    }
}
