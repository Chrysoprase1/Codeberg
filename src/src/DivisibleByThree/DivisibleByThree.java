
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange(int start, int end) {
        for (start = start; start <= end; start++) {
            if (start % 3 == 0) {
                System.out.println (start);
            }
        }
    }
}
