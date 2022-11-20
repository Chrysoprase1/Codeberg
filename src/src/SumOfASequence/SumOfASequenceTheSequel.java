
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("First number?");
        int i = Integer.valueOf (scanner.nextLine());
        System.out.println ("Last number?");
        int e = Integer.valueOf (scanner.nextLine());
        
        int sum = 0;
        
        for (i = i; i <= e; i++) {
            sum = sum + i;
        }
        System.out.println ("The sum is " + sum);
    }
}
