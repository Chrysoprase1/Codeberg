// program that asks user for identifier (String) and name input
// creates Item objects based on input and adds it into arraylist
// then prints the list after break (empty input)
    // if an identifier is already being used, a new item with same identifier 
    // wont be added 
    // equal method in Item.java

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Item> items = new ArrayList<>();
        
        while (true) {
            boolean alreadyIncluded = false;
            
            System.out.println("Identifier? (empty will stop)");
            String identifierInput = scanner.nextLine();
            if (identifierInput.equals ("")) {
                break;
            }
            
            System.out.println("Identifier? (empty will stop)");
            String nameInput = scanner.nextLine();
            if (nameInput.equals ("")) {
                break;
            }
            
            Item createItem = new Item (identifierInput, nameInput);
            
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).equals (createItem)) {
                    alreadyIncluded = true;
                }
            }
            
            if (alreadyIncluded == false) {
            items.add (createItem);
            }
            
        }
        System.out.println("==Items==");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
