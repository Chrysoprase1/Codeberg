// program that asks user for input until negative input is given
// program will then print every input number with a linebreak


import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf (scanner.nextLine());
            
            if(input < 0) {
                break;
            }
            
            list.add (input);
        }
        
        list.stream()
                .filter (s -> s > 0 && s < 6)
                .forEach (value -> System.out.println(value));
    }
}
