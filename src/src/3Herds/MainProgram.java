// program that simulates a Herd using a Herd object that stores Movable objects
    // Organism objects implement the Movable interface
    // Herd objects implement the Movable interface as well
    // moving the herd will move each Movable stored in it by the same range
    // from its actual position

public class MainProgram {

    public static void main(String[] args) {
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);
        
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
    }
}
