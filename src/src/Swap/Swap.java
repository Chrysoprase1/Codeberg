// swaps the values of two indices from an given array
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        //asks for the indices
        System.err.println ("Give two indices to swap:");
        int input1 = Integer.valueOf (scanner.nextLine());
        int input2 = Integer.valueOf (scanner.nextLine());
        
        // swaps the two given indices
        int buffer = array[input1];
        array[input1] = array[input2];
        array[input2] = buffer;

        // prints the array
        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
