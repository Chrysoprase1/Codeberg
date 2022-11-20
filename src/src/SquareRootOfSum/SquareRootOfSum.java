
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two integer values. The program will print "
                + "the square root of the sum from given integers");
        int numberOne = Integer.valueOf (scanner.nextLine());
        int numberTwo = Integer.valueOf (scanner.nextLine());
        double squareRoot = Math.sqrt (1.0 * (numberOne + numberTwo));
        
        System.out.println (squareRoot);
        

    }
}
