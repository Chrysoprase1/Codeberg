
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Enter two numbers. "
                + "This program will compare those two with each other.");
        int numberOne = Integer.valueOf (scanner.nextLine());
        int numberTwo = Integer.valueOf (scanner.nextLine());
        
        if (numberOne > numberTwo) {
            System.out.println (numberOne + " is greater than " + numberTwo + ".");
        } else if (numberOne < numberTwo) {
            System.out.println (numberOne + " is smaller than " + numberTwo + ".");
        } else {
            System.out.println (numberOne + " is equal to " + numberTwo + ".");
        }

    }
}
