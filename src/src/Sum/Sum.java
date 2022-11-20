// program that calculates sum from a given list with a method

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
    
    public static int sum (ArrayList<Integer> numbers) {
        int sum = 0;
        
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + Integer.valueOf (numbers.get (i));
        }
        return sum;
    }
}
