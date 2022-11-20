// program that reads an integer input and prints the square of given integer
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Enter a number you want to square:");
        int number = Integer.valueOf (scanner.nextLine());
        int squarednumber = number*number;
        
        System.out.println (squarednumber);

    }
}
