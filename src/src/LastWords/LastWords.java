
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] inputSplit = input.split (" ");
            
            System.out.println(inputSplit [inputSplit.length -1]);
            
            if (input.equals ("")) {
                break;
            }
        }
    }
}
