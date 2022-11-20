// program that prints inputs from number range x to y
// values are stores in arraylist

import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(10);
        
        printNumbersInRange (numbers, 3, 10);
        
        
    }
    
    public static void printNumbersInRange (ArrayList<Integer> numbers, int lower, int upper) {
    for (int i = 0; i < numbers.size(); i++) {
        if (Integer.valueOf (numbers.get(i)) >= lower && 
                Integer.valueOf (numbers.get (i)) <= upper) {
            System.out.println (Integer.valueOf (numbers.get(i)));
            }
        }
    }
}
