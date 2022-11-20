// program that stores Item objects in multiple possible Box classes
    // Box-Class is the abstract class which other Box classes inherit from
    // BoxWithMaxWeight stores items up to a max given int value
    // OneItemBox stores one item regardless of weight
    // MisplacingBox stores infinite items of infinite weight, but returns false 
        // on contain boolean
        // example code included in main

public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        System.out.println();
        
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        System.out.println();
        
        MisplacingBox boxM = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(boxM.isInBox(new Item("Saludo")));
        System.out.println(boxM.isInBox(new Item("Pirkka")));
    }
}
