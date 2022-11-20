// program that asks user for integer inputs until -1 is being input
// -> prints the average number

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0.0;
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // asks for numbers until input is -1
        while (true) {
            int input = Integer.valueOf (scanner.nextLine());
            if (input == (-1)) {
                break;
            }
            numbers.add (input);
        }
        
        // calculates the sum of numbers
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + Integer.valueOf (numbers.get (i));
        }
        
        // calculates average afterwards and prints it
        average = (1.0 * sum) / numbers.size();
        System.out.println ("Average: " + average);
    }
}
