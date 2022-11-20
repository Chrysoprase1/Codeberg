
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = Integer.valueOf(scanner.nextLine());
        int e = 100 + 1;
        for (i = i; i < e; i++) {
            System.out.println (i);
        }

    }
}
