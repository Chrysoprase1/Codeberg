
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /*
        System.out.println ("Where to?");
        int i = 1;
        int e = 1+ Integer.valueOf (scanner.nextLine());
        
        for (i = i; i < e; i++) {
            System.out.println (i);
        }
*/

        System.out.println ("Where to?");
        int inputTo = Integer.valueOf (scanner.nextLine());
        System.out.println ("Where from?");
        int inputFrom = Integer.valueOf (scanner.nextLine());
        
        for (inputFrom = inputFrom; inputFrom <= inputTo; inputFrom++) {
            System.out.println (inputFrom);
        }
    }
}
