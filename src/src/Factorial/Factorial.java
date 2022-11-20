
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Give a number: ");
        int e = Integer.valueOf (scanner.nextLine());
        
        int sum = 1;
        int i = 1;
        for (i = i; i <= e; i++) {
            sum = sum * i;
        }
        System.out.println ("Factorial: " + sum);
    }
}
