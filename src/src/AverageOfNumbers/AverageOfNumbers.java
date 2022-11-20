// program that asks user for inputs and will return the average number of given
// integers after it stops
    // program stops by entering String "end"

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list= new ArrayList<>();
        
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            
            if (input.equals ("end")) {
                break;
            }
            
            list.add (input);
        }
        Double average = list.stream()
                        .mapToInt (s -> Integer.valueOf (s))
                        .average()
                        .getAsDouble(); 
        System.out.println("Average of numbers; " + average);
    }
}
