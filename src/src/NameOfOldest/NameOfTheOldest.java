
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            String[] inputSplit = input.split (",");
            
            if (input.equals ("")) {
                break;
            }
            
            if (Integer.valueOf (inputSplit[1]) > oldest) {
                oldest = Integer.valueOf (inputSplit[1]);
                oldestName = inputSplit[0];
            }
        }
        System.out.println ("Name of the oldest: " + oldestName);
    }
}
