
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("This program will print the absolute value of a"
                + " given number. Enter a number");
        int number = Integer.valueOf (scanner.nextLine());
        
        if (number >= 0) {
            System.out.println (number);
        } else {
            System.out.println ((number * -1));
        }

    }
}
