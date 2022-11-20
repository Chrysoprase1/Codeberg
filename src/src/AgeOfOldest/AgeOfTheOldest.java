
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            String[] inputSplit = input.split (",");
            
            if (input.equals ("")) {
                break;
            }
            if (Integer.valueOf (inputSplit[1]) > oldest) {
                oldest = Integer.valueOf (inputSplit [1]);
            }
        }
        System.out.println ("Age of oldest: " + oldest);
    }
}
