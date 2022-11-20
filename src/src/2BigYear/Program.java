import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    private BirdLibrary list;
    private Scanner scanner;
    
    public Program (BirdLibrary list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        commands();
    }
    
    public void commands() {
        boolean running = true;
        while (running) {
            System.out.println("?");
            String input = scanner.nextLine();
            switch (input) {
                case ("add"): 
                    System.out.println("name:");
                    String name = scanner.nextLine();
                    System.out.println("Name in latin: ");
                    String latinName = scanner.nextLine();
                    list.add (new Bird (name, latinName));
                    break;
                case ("Observation"):
                    System.out.println("Bird?");
                    String observeThis = scanner.nextLine();
                    if (list.containsBird (observeThis)) {
                        list.observeByName (observeThis);
                    }else {
                        System.out.println("Not a bird");
                    }
                    break;
                case ("All"): 
                    list.printAll();
                    break;
                case ("One"):
                    System.out.println("Bird?");
                    String oneBird = scanner.nextLine();
                    if (list.containsBird (oneBird)) {
                        list.printByName (oneBird);
                    } else {
                        System.out.println("Not a bird");
                    }
                    break;
                case ("Quit"):
                    running = false;
                    break;
            }
        }
    }
}
