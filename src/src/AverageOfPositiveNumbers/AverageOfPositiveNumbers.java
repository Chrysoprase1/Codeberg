
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        double average = 0;
        
        while (true) {
            System.out.println ("Enter numbers one at a time to get an average:");
            int input = Integer.valueOf (scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                sum = sum + input;
                count = count + 1;
            }
        }
        // dont calculate average if count = 0 for some reason
        if (count > 0) {
            average = (1.0 * sum) / count;
            System.out.println (average);
        }
        
        // avarage cant be either because task requires at least 1 positive number
        if (average <= 0 || count == 0) {
            System.out.println ("Cannot calculate the average");
        }
    }
}
