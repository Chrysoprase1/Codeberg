
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        double average = 0;
        
        while (true) {
            System.out.println ("Give a number:");
            int input = Integer.valueOf (scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            sum = sum + input;
            count = count + 1;
        }
        if (count > 0) {
            average = (1.0* sum) / count;
            System.out.println ("Average of the numbers: " + average);
        } else {
            System.out.println ("Average of the numbers: 0");
        }
    }
}
