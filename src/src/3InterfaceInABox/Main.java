// program that implements a Packable interface
// Packable objects (Book/CD) can be stored in Box Class objects
// Box objects are packable as well
// changed toStrings of CD/Book to show author, name, for CD publication year
// changed toString on Box to show list amount and total weight
// example code included in main

public class Main {

    public static void main(String[] args) {
        
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.7);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
        System.out.println();
        
        Box box = new Box(10);
        Box box2 = new Box (100);
        Box box3 = new Box (20);
        Box box4 = new Box (1000);
        Box aa = new Box (200);

        box.add(book1) ;
        box.add(book2);
        box.add(book3);

        box.add(cd1);
        box.add(cd2);
        box.add(cd3);
        System.out.println();
        
        System.out.println(box);
        box2.add (box);
        System.out.println(box2);
        box3.add (box);
        box3.add (box2);
        System.out.println(box3);
        box4.add (aa);
        System.out.println(box4);
    
    }

}
