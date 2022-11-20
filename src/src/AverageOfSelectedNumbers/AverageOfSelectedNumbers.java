// program that asks user for input and after "end" input for a p or n input
    // n will print the average of every negative input number
    // p will print the average of every positive input number
    // averages are calculated using the Collections method stream()

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> listPos = new ArrayList<>();
        ArrayList<String> listNeg = new ArrayList<>();
        
        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            
            if (input.equals ("end")) {
                break;
            }
            
            if (Integer.valueOf (input) < 0) {
                listNeg.add (input);
            } else {
                listPos.add (input);
            }
        }
        
        System.out.println("Print the average of the negative numbers or "
                + "the positive numbers? (n/p)");
        String command = scanner.nextLine();
        
        if (command.equals ("n")) {
            System.out.println("Average of the negative numbers: " + avgStream(listNeg));
        } else {
            System.out.println("Average of the positive numbers: " + avgStream (listPos));
        }
    }
    
    public static double avgStream (ArrayList<String> list) {
        double average = list.stream()
                .mapToInt(s -> Integer.valueOf (s))
                .average()
                .getAsDouble();
        
        return average;
    }
}
