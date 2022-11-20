// program that asks user for commands (add, search, end) vor textinterface
// will loop until command equals "end"
// add command will ask for two string inputs and store them into hashmap in
// SimpleDictionary
// search command will print linked String from SimpleDictionary object

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        TextUI ui = new TextUI(scanner, dictionary);
        
        ui.start();
    }
}
