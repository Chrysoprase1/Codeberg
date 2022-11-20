// method that takes in a list and returns another list with only the positive values
// method works using a stream method of the Collectors class

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

    }
    
    public static List<Integer> positive (List<Integer> list) {
        return list.stream().filter(s -> s >= 0).collect (Collectors.toList());
        
    }

}
