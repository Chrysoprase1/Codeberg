
import java.util.ArrayList;
import java.util.Scanner;
// program that reads user input until the user enters 9999
// program prints the smallest number
// and its index -- the smallest number might appear multiple times

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        int smallest = 9999;
        
        // user inputs numbers until input equals 9999
        while (true) {
            int number = Integer.valueOf (scanner.nextLine());
            
            if (Integer.valueOf (number) == 9999) {
                break;
            }
            numbers.add (number);
        }
        
        // searches for smallest number value in list
        for (int number = 0; number < numbers.size(); number++) {
            if (Integer.valueOf (smallest) > Integer.valueOf (numbers.get (number))) {
                smallest = numbers.get (number);
            }
        }
        System.out.println ("Smallest number: " + Integer.valueOf (smallest));
        
        // prints smallest numbers index
        for (int number = 0; number < numbers.size(); number++) {
            if (Integer.valueOf (numbers.get (number)) == smallest) {
                System.out.println ("Found at index: " + number);
            }
        }
    }
}
