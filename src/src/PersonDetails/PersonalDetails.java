
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        int longest = 0;
        String longestName = "";
        
        while(true) {
            String input = scanner.nextLine();
            String[] inputSplit = input.split (",");
            
            if (input.equals ("")) {
                break;
            }
            
            sum = sum + Integer.valueOf (inputSplit[1]);
            count = count + 1;
            average = 1.0 * sum / count;
            
            if (inputSplit[0].length() > longest) {
                longest = inputSplit[0].length();
                longestName = inputSplit [0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println ("Average of the birth year: " + average);
    }
}
