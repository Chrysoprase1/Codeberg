
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println ("Search for?");
        String input = scanner.nextLine();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get (i).equals (input)) {
                System.out.println (input + " was found!");
            }
        }
        
        boolean contains = list.contains (input);
        if (contains == false) {
            System.out.println (input + " was not found!");
        }
    }
}
