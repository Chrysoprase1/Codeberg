import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary list;
    
    public TextUI (Scanner scanner, SimpleDictionary list) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if (command.equals ("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals ("add")) {
                System.out.println("Word");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                
                list.add (word, translation);
                continue;
            }
            
            if (command.equals ("search")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                
                if (list.translate (word) == null) {
                    System.out.println("Word " + word + " was not found.");
                }
                
                if (list.translate (word) != null) {
                    System.out.println(list.translate (word));
                }
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }
}
