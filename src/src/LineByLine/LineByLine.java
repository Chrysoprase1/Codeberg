
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
        String input = scanner.nextLine();
        
        String[] inputPieces = input.split (" ");
        
        for (int i = 0; i < inputPieces.length; i++) {
            System.out.println (inputPieces [i]);
            }
        if (input.equals ("")) {
            break;
            }
        }
    }
}
