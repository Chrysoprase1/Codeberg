// program that asks user for inputs until an empty input is given
// program will then print all inputs with a linebreak in between
    // done with a list.stream and lambda method call

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals ("")) {
                break;
            }
            
            list.add (input);
        }
        
        String stream = list.stream()
                .reduce ("", (previousValue, addValue) -> previousValue + addValue
                + "\n");
        System.out.println(stream);
    }
}
