
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int biggest = 0;
        
        ArrayList <Integer> numbers = new ArrayList<> ();
        
        while (true) {
            int number = Integer.valueOf (scanner.nextLine());
            
            if (number == (-1)) {
                break;
            }
            
            numbers.add (number);
        }
        int start = 0;
        for (start = start; start < numbers.size(); start++) {
            if (Integer.valueOf (numbers.get (start)) > Integer.valueOf (biggest)) {
                biggest = numbers.get (start);
            } 
        }
        
        System.out.println (Integer.valueOf (biggest));
    }
}
